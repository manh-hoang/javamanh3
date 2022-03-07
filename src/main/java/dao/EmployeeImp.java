package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import baAnhEm.connectSql;
import dao.baseDAO.BaseDao;
import entity.Employee;

public class EmployeeImp implements BaseDao<Integer, Employee>{

	
		
		private static Connection connect = connectSql.getConnect();
		String sql = null;
		@Override
		public List<Employee> getAll() {
			sql = "select * from employee";
			PreparedStatement pst = null;
			ResultSet rs = null;
			List<Employee> emlList = new ArrayList<>();
			try {
				pst = connect.prepareStatement(sql);
				rs = pst.executeQuery();
				if(rs.isBeforeFirst()) {
					while (rs.next()) {
						
						
						  int id = rs.getInt("id");
						  int iddep= rs.getInt("iddep");
						 String firstname = rs.getString("firstname");
						 String lastname = rs.getString("lastname");
							 String address = rs.getString("address");
							 boolean gender = rs.getBoolean("gender");
							 java.util.Date birthdayrs = rs.getDate("birthdayrs");
							 float salary = rs.getFloat("salary");
							 boolean status = rs.getBoolean("status");
							 String imglink = rs.getString("imglink");
							
						 Employee newEml= new Employee(id, iddep, firstname, lastname,address,gender,birthdayrs,salary,status,imglink);

						 emlList.add(newEml);
						 
					}
					return emlList;
				}
				return null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
	}

	@Override
	public boolean create(Employee e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Employee e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Integer old_id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Employee> find_by_name(Integer name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> find_by_address(Integer name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
