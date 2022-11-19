package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	void isert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id); //responsavel por pegar a ID e consultar no banco o objeto com esse id
	List<Department> findAll();
	
	
	
	
	
}
