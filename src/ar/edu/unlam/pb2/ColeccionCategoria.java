package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;

public class ColeccionCategoria {
	/*ATRIBUTOS*/
	private List<Categoria> categorias;
	
	/*CONSTRUCTORES*/
	public ColeccionCategoria(){
		this.categorias=new ArrayList<>();
	}
	
	/*GETTERS Y SETERS*/

	
	
	/*LISTAR CATEGORIAS*/
	public List<Categoria> listaCategoria(){

	}
	
	/*ELIMINAR CATEGORIA*/
	public List<Categoria> bajaCategoria(Categoria categoria){

	}

	
	/*ALTA CATEGORIAS*/
	public void altaCategoria(Categoria categoria){
		this.categorias.add(categoria);
	}
	
	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categorias == null) ? 0 : categorias.hashCode());
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
		ColeccionCategoria other = (ColeccionCategoria) obj;
		if (categorias == null) {
			if (other.categorias != null)
				return false;
		} else if (!categorias.equals(other.categorias))
			return false;
		return true;
	}
	
	/*EQUALS Y HASHCODE*/

}
