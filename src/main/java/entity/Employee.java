package entity;

import java.util.Date;

public class Employee {
	private int id;
	private int iddep;
	private String firstname;
	private String lastname;
	private String address;
	private boolean gender;
	private java.util.Date birthday;
	private float salary;
	private boolean status;
	private String imglink;
	public Employee() {
		super();
	}
	public Employee(int id, int iddep, String firstname, String lastname, String address, boolean gender, Date birthday,
			float salary, boolean status, String imglink) {
		super();
		this.id = id;
		this.iddep = iddep;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.gender = gender;
		this.birthday = birthday;
		this.salary = salary;
		this.status = status;
		this.imglink = imglink;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIddep() {
		return iddep;
	}
	public void setIddep(int iddep) {
		this.iddep = iddep;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public java.util.Date getBirthday() {
		return birthday;
	}
	public void setBirthday(java.util.Date birthday) {
		this.birthday = birthday;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getImglink() {
		return imglink;
	}
	public void setImglink(String imglink) {
		this.imglink = imglink;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", iddep=" + iddep + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", address=" + address + ", gender=" + gender + ", birthday=" + birthday + ", salary=" + salary
				+ ", status=" + status + ", imglink=" + imglink + "]";
	}
	
	
}
