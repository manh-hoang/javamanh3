package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import baAnhEm.connectSql;
import dao.baseDAO.BaseDao;
import entity.Department;

public class Departmentlmp implements BaseDao<Integer, Department> {
	private static Connection connect = connectSql.getConnect();
	String sql = null;
	@Override
	public List<Department> getAll() {
		sql = "select * from department";
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<Department> departList = new ArrayList<>();
		try {
			pst = connect.prepareStatement(sql);
			rs = pst.executeQuery();
			if(rs.isBeforeFirst()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					 String code = rs.getString("code");
					 String name = rs.getString("name");
					 boolean status = rs.getBoolean("status");
					 Department newDepart = new Department(id, code, name, status);
					 departList.add(newDepart);
				}
				return departList;
			}
			return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean create(Department e) {
		
		return false;
	}

	@Override
	public boolean update(Department e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Integer old_id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Department> find_by_name(Integer name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Department> find_by_address(Integer name) {
		// TODO Auto-generated method stub
		return null;
	}


}
