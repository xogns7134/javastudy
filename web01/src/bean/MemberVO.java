package bean;

public class MemberVO {
	String id;
	String pw;
	String name;
	String tel;
	
	// 가방에 데이터를 하나씩 넣는 기능 (메서드)
	public void setId(String id) { //setter
		this.id = id;
	}
	
	// 가방의 데이터를 하나씩 꺼내는 기능 (메서드)
	public String getId() { //getter
		return id;
	}
	// 자동완성 --> 상단의 Source -> Generate Getters and Setters
	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + "]";
	}
	
	
}
