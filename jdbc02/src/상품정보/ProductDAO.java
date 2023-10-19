package 상품정보;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductDAO {
		public static void insert(ProductVO bag) {
			// Java-DB 연결 (JDBC) 4단계
			// 1. 연결할 부품(커넥터, 드라이버) 설정
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("1. 커넥터 연결 성공");

				// 2. 1번 설정을 커넥터로 db 연결하고 승인
				// 1) url - ip + port + db 이름
				// 2) id, pw
				String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
				String user = "root";
				String password = "1234";

				Connection con = DriverManager.getConnection(url, user, password);
				System.out.println("2. shop db연결 성공");

				// 3. 2번에서 연결된 것을 가지고 sql문 생성
				String sql = "insert into product values (?, ?, ?, ?, ?, ?)";
				String site = "http://www.naver.com";
				// 해당 부품으로 만들어야함
				// sql ==> PreparedStatement
				// site ==> URL
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, bag.getId());
				ps.setString(2, bag.getName());
				ps.setString(3, bag.getContent());
				ps.setInt(4, bag.getPrice());
				ps.setString(5, bag.getCompany());
				ps.setString(6, bag.getImg());

				System.out.println("3. sql문 생성 성공");

				// 4. 3번에서 생성된 sql문을 Mysql로 전송
				ps.execute();
				System.out.println("4. sql문 mysql로 전송 성공");
			} catch (Exception e) {
				// Exception == 치명적인 에러와 관련됨
				e.printStackTrace();
				System.out.println("에러 발생");
			}
		}

		public void delete(ProductVO bag) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("1. 커넥터 연결 성공");

				String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
				String user = "root";
				String password = "1234";

				Connection con = DriverManager.getConnection(url, user, password);
				System.out.println("2. shop db연결 성공");

				String sql = "delete from product where id = ? ";
				PreparedStatement ps = con.prepareStatement(sql); //
				ps.setString(1, bag.getId()); // 물음표 번호 1번에 id에 저장한 변수값을 넣어줘!
				System.out.println("3. sql문 생성 성공");

				ps.execute();
				System.out.println("4. SQL문 mySQL로 전송 성공");
			} catch (Exception e) { // Exception == Error
				e.printStackTrace();// 에러정보를 추적해서 프린트해줘.!
				System.out.println("에러 발생");
			}
		}

		public void update(ProductVO bag) {
			// Java-DB연결 (JDBC) 4단계
			// 1. 연결할 부품(커넥터, driver, 드라이버) 설정
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("1. 커넥터 연결 성공");
				// 패키지.대표클래스
				// 외부자원연결(db, network, cpu, file,...)
				// 너무 위험한 상황!
				// 상황이 발생했을 때 어떻게 대처할지를 반드시 써주어야 함.
				// 2. 1번 설정을 커넥터로 db연결하고 승인
				// 1) url - ip + port + db명
				// 2) id, pw
				String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
				String user = "root";
				String password = "1234";

				Connection con = DriverManager.getConnection(url, user, password);
				System.out.println("2. shop db연결 성공");

				// 3. 2번에서 연결된 것을 가지고 sql문 생성
				String sql = "update product set name = ?, content = ?, price = ?, company = ?, img = ? where id = ? ";
				PreparedStatement ps = con.prepareStatement(sql); //
				ps.setString(1, bag.getName());
				ps.setString(2, bag.getContent());
				ps.setInt(3, bag.getPrice());
				ps.setString(4, bag.getCompany());
				ps.setString(5, bag.getImg());
				ps.setString(6, bag.getId());
				System.out.println("3. sql문 생성 성공");

				// URL site = new URL(site);

				// 4. 3번에서 생성된 sql문을 Mysql로 전송
				ps.execute();
				System.out.println("4. SQL문 mySQL로 전송 성공");
			} catch (Exception e) { // Exception == Error
				e.printStackTrace();// 에러정보를 추적해서 프린트해줘.!
				System.out.println("에러 발생");
			}
		}
		
		public ProductVO search(String id) {
			ProductVO bag = new ProductVO();
			// Java-DB 연결 (JDBC) 4단계
			// 1. 연결할 부품(커넥터, 드라이버) 설정
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("1. 커넥터 연결 성공");

				// 2. 1번 설정을 커넥터로 db 연결하고 승인
				// 1) url - ip + port + db 이름
				// 2) id, pw
				String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
				String user = "root";
				String password = "1234";

				Connection con = DriverManager.getConnection(url, user, password);
				System.out.println("2. shop db연결 성공");

				// 3. 2번에서 연결된 것을 가지고 sql문 생성
				String sql = "select * from product where id = ?";
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
					String id2 = table.getString("id"); // ()안에 column명 써주기
					String name = table.getString("name"); // ()안에 column명 써주기
					String content = table.getString("content");
					int price = table.getInt("price");
					String company = table.getString("company");
					String img = table.getString("img");
					System.out.println("ID : " + id2);
					System.out.println("NAME : " + name);
					System.out.println("CONTENT : " + content);
					System.out.println("PRICE : " + price);
					System.out.println("COMPANY : " + company);
					System.out.println("IMG : " + img);
					bag.setId(id2);
					bag.setName(name);
					bag.setContent(content);
					bag.setPrice(price);
					bag.setCompany(company);
					bag.setImg(img);
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


