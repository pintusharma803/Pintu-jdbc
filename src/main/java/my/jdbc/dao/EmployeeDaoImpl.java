package my.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import my.jdbc.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private static Connection connection = null;
	
	static {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","Pintu@6728");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	public static final String UPDATE_QUERY = "update student set name = '%s' where id = %d";
	
	@Override
	public void saveEmployee(Employee e) throws SQLException {
		Statement statement = connection.createStatement();
//		statement.executeUpdate("insert into employee (empid,email,name,salary) values(3,'PkRaj','pkraj675@gmail.com',5678.98)");
		statement.executeUpdate("insert into employee (empid,email,name,salary) values("+e.getId()+",'"+e.getEmail()+"','"+e.getName()+"',"+e.getSalary()+")");
		System.out.println("insert into employee (empid,email,name,salary) values("+e.getId()+",'"+e.getName()+"','"+e.getEmail()+"',"+e.getSalary()+")");
	}

	@Override
    public void updateEmployee(Employee e) {
    	
    	try(Statement statement = connection.createStatement()){
    		statement.executeUpdate(String.format(UPDATE_QUERY,e.getName(),e.getId()));
    	}catch(SQLException c) {
    		c.printStackTrace();
    	}
    }

	@Override
	public void deleteAnEmployee(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printAllEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee getEmpById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmps() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmpByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
