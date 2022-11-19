package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class SellerDaoJDBC implements SellerDao {
	
	private Connection conn;
	
	public SellerDaoJDBC(Connection conn) {
		this.conn = conn; 
	}

	@Override
	public void isert(Seller obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Seller obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Seller findById(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
					"SELECT seller.*,department.Name as DepName "
					+ "FROM seller INNER JOIN department "
					+ "ON seller.DepartmentId = department.Id "
					+ "WHERE seller.Id = ?");
		
			//atribuir valores ao ponto de ?
			st.setInt(1, id); //setINT porque id é um numero inteiro, 1 pq é o primeiro ponto de ? e id pq eu quero achar deacordo com a id 
			rs = st.executeQuery(); //rs é a variavel com o resultado dessa operacao
			if (rs.next()) { //testar se o rs tem algum resultado ou se esta nulo, se for vdd:
				Department dep = new Department();
				dep.setId(rs.getInt("DepartmentId")); // getINT pq é numero inteiro e entre "" o nome da coluna do banco de dados q contem a info que queremos que é DepartmentId
				dep.setName(rs.getString("DepName"));
				Seller obj = new Seller(); //declarar a classe seller
				obj.setId(rs.getInt("Id"));
				obj.setName(rs.getString("Name"));
				obj.setEmail(rs.getString("Email"));
				obj.setBaseSalary(rs.getDouble("BaseSalary"));
				obj.setBirthDate(rs.getDate("BirthDate"));
				obj.setDepartment(dep);
				return obj;
			} return null; //caso nao existe nenhum vendor com essa id
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
		
		
		
		
		
	}

	@Override
	public List<Seller> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
}
