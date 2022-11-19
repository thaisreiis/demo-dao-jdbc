package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
	
	/*A minha classe DaoFactory vai expor um m�todo que retorna o tipo da interface (SellerDao), mais 
	internamente ela vai instanciar uma implementa��o */
	
}
