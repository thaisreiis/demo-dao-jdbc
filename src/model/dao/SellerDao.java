package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {

	void isert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id); //responsavel por pegar a ID e consultar no banco o objeto com esse id
	List<Seller> findAll();
	List<Seller> findByDepartment(Department department);
	
	
}
