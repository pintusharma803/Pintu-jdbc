package my.jdbc;

import java.sql.SQLException;
import my.jdbc.dao.EmployeeDaoImpl;
import my.jdbc.model.Employee;



public class Main {
	public static void main(String args []) throws SQLException {

		
		Employee e1 = new Employee(6,"pksharma67@gmail.com","Mohit Singh",50000);
		EmployeeDaoImpl empDao = new EmployeeDaoImpl();
			
		empDao.updateEmployee(e1);

	}

}
