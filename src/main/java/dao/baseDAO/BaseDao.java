package dao.baseDAO;

import java.util.List;

import entity.Employee;

public interface BaseDao<T, O> {
	public abstract List<O> getAll();
	public abstract boolean create(O e);
	public abstract boolean update(O e);
	public abstract boolean delete(T old_id);
	public abstract List<O> find_by_name(T name);
	public abstract List<O> find_by_address(T name);
	
}
