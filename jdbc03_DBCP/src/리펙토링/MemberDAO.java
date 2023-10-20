package 리펙토링;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {
	Connection con; // 전역변수, global 변수
	public MemberDAO() {
		try {
			// 객체 생성시 자동호출되는 메서드 == 생성자, constructor
			// jdbc 1-2단계 넣기
			
			// Java-DB 연결 (JDBC) 4단계
			// 1. 연결할 부품(커넥터, 드라이버) 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 커넥터 연결 성공");

			// 2. 1번 설정을 커넥터로 db 연결하고 승인
			// 1) url - ip + port + db 이름
			// 2) id, pw
			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";

			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. shop db연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 파일을 찾을 수 없음");
		} catch (SQLException e) {
			System.out.println("mySQL 연결 실패");
		}
	}
	
	public int insert(MemberVO bag) {
		try {
			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "insert into member values (?, ?, ?, ?)";
			String site = "http://www.naver.com";
			// 해당 부품으로 만들어야함
			// sql ==> PreparedStatement
			// site ==> URL
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getTel());

			System.out.println("3. sql문 생성 성공");

			// 4. 3번에서 생성된 sql문을 Mysql로 전송
			int result = ps.executeUpdate();
			System.out.println("4. sql문 mysql로 전송 성공");
			return result;
		} catch (Exception e) {
			// Exception == 치명적인 에러와 관련됨
			e.printStackTrace();
			System.out.println("에러 발생");
			return -1;
		}
	}

	public int delete(String id) {
		try {
			String sql = "delete from member where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, id); // 물음표 번호 1번에 id에 저장한 변수값을 넣어줘!
			System.out.println("3. sql문 생성 성공");
			int result = ps.executeUpdate();
			System.out.println("4. SQL문 mySQL로 전송 성공");
			return result;
		} catch (Exception e) { // Exception == Error
			e.printStackTrace();// 에러정보를 추적해서 프린트해줘.!
			System.out.println("에러 발생");
			return -1;
		}
	}

	public int update(String id, String tel) {
		// Java-DB연결 (JDBC) 4단계
		// 1. 연결할 부품(커넥터, driver, 드라이버) 설정
		try {
			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "update member set tel = ? where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, tel); // 물음표 번호 1번에 id에 저장한 변수값을 넣어줘!
			ps.setString(2, id); // 물음표 번호 2번에 pw에 저장한 변수값을 넣어줘!
			System.out.println("3. sql문 생성 성공");
			// 4. 3번에서 생성된 sql문을 Mysql로 전송
			int result = ps.executeUpdate();
			System.out.println("4. SQL문 mySQL로 전송 성공");
			return result;
		} catch (Exception e) { // Exception == Error
			e.printStackTrace();// 에러정보를 추적해서 프린트해줘.!
			System.out.println("에러 발생");
			return -1;
		}
	}

	public MemberVO search(String id) {
		MemberVO bag = new MemberVO();
		// Java-DB 연결 (JDBC) 4단계
		// 1. 연결할 부품(커넥터, 드라이버) 설정
		try {// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "select * from member where id = ?";
			String site = "http://www.naver.com";
			// 해당 부품으로 만들어야함
			// sql ==> PreparedStatement
			// site ==> URL
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			System.out.println("3. sql문 생성 성공");

			// 4. 3번에서 생성된 sql문을 Mysql로 전송
			ResultSet table = ps.executeQuery(); // 테이블로 mysql로 받아온다
			System.out.println("4. sql문 mysql로 전송 성공");
			if (table.next()) { // table 안에 검색결과 row가 있는지 체크
				String id1 = table.getString("id");
				String pw = table.getString("pw");
				String name = table.getString("name");
				String tel = table.getString("tel");
				bag.setId(id1); // ()안에 column명 써주기
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);
			} else {
				System.out.println("검색 결과 없음");
			}
		} catch (Exception e) {
			// Exception == 치명적인 에러와 관련됨
			e.printStackTrace();
			System.out.println("에러 발생");
		}
		return bag;
	}
}
