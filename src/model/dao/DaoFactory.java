package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	/*A minha classe DaoFactory vai expor um método que retorna o tipo da interface (SellerDao), mais 
	internamente ela vai instanciar uma implementação */
	
}
