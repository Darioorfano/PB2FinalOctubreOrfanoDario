package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;

public class ColeccionColor {
	/*ATRIBUTOS*/
	private List<Color> colores;
	
	/*CONSTRUCTORES*/
	public ColeccionColor(){
		this.colores=new ArrayList<>();
	}
	
	/*ALTA COLORES*/
	public void altaColor(Color color){
		this.colores.add(color);
	}
	
	/*LISTAR COLORES*/
	public List<Color> listaColor(){

	return this.colores;
	}
	
	/*ELIMINAR COLOR*/
	public List<Color> bajaColor(Color color){

	}

	public List<Color> getColores() {
		return colores;
	}

	public void setColores(List<Color> colores) {
		this.colores = colores;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((colores == null) ? 0 : colores.hashCode());
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
		ColeccionColor other = (ColeccionColor) obj;
		if (colores == null) {
			if (other.colores != null)
				return false;
		} else if (!colores.equals(other.colores))
			return false;
		return true;
	}
	
	/*GETTERS Y SETERS*/


	/*EQUALS Y HASHCODE*/

}
