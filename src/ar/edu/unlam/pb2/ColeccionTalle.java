package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;

public class ColeccionTalle {
	/*ATRIBUTOS*/
	private List<Talle> talles;
	
	/*CONSTRUCTORES*/
	public ColeccionTalle(){
		this.talles=new ArrayList<>();
	}
	
	/*GETTERS Y SETERS**/
	
	
	
	/*ALTA TALLES*/
	public void altaTalle(Talle talle){
this.talles.add(talle);
	}
	
	public List<Talle> getTalles() {
		return talles;
	}

	public void setTalles(List<Talle> talles) {
		this.talles = talles;
	}

	/*LISTAR TALLES*/
	public List<Talle> listaTalle(){
return this.talles;
	}
	
	/*ELIMINAR COLOR*/
	public List<Talle> bajaTalle(Talle talle){
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((talles == null) ? 0 : talles.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ColeccionTalle other = (ColeccionTalle) obj;
		if (talles == null) {
			if (other.talles != null)
				return false;
		} else if (!talles.equals(other.talles))
			return false;
		return true;
	}

	
	
	/*EQUALS Y HASHCODE*/
}
