package db3;

public class UserEntity {
	private int num;
	private String id;
	private String passwd;
	private String name;
	private double score;
	public UserEntity() {
	// TODO Auto-generated constructor stub
}
	protected UserEntity(int num, String id, String passwd, String name, double score) {
		super();
		this.num = num;
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.score = score;
	}
	
	protected UserEntity(String id, String passwd, String name, double score) {
		super();
		this.num = num;
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.score = score;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
}
