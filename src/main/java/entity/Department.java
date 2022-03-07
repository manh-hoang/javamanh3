package entity;

public class Department {
	private int id;
	private String code;
	private String name;
	private boolean status;
	public Department() {
		super();
	}
	public Department(int id, String code, String name, boolean status) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", code=" + code + ", name=" + name + ", status=" + status + "]";
	}
	
}
