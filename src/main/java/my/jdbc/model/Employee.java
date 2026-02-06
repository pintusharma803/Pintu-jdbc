package my.jdbc.model;

public class Employee {
	
	private int id;
	private String name,email;
	private double salary;
	
	
	
	public Employee() {
//		super();
		
	}



	public Employee(int id, String email, String name,double salary ) {
//		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.email = email;
	}



	



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + ", email=" + email + "]";
	}
	
	
	
	

}
