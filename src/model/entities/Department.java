package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable {
	
	/*Implements Serializable para nossos objetos poderem ser transformados em sequencia
	de bits, isso é, para ser gravado em arquivo, seja trafegado em rede, etc */
	
	private static final long serialVersionUID = 1L; //resultado autocorreção do implements
	
	private Integer Id;
	private String name;
	
	
	public Department() {}

	public Department(Integer id, String name) {
		Id = id;
		this.name = name;
	}
	
	
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	/*HashCode e equals para que meus objetos possam ser comparados pelo conteúdo e não 
	pela referencia de ponteiros*/
	
	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(Id, other.Id);
	}

	
	//ToString para ter uma facilidade de imprimir os valores do objeto na hora de testar
	
	@Override
	public String toString() {
		return "Department [Id=" + Id + ", name=" + name + "]";
	}
	
}
