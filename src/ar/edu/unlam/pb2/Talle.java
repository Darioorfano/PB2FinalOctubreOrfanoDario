package ar.edu.unlam.pb2;

public class Talle {
	/*ATRIBUTOS*/
	private String talle;
	
	/*CONSTRUCTORES*/
	public Talle(String talle) {
	this.talle=talle;
	}

	public String getTalle() {
		return talle;
	}

	public void setTalle(String talle) {
		this.talle = talle;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((talle == null) ? 0 : talle.hashCode());
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
		Talle other = (Talle) obj;
		if (talle == null) {
			if (other.talle != null)
				return false;
		} else if (!talle.equals(other.talle))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Talle [talle=" + talle + "]";
	}	

	
	
	/*GETTERS Y SETTERS*/

	/*EQUALS Y HASHCODE*/

	/*SOBREESCRITURA DE METODO TOSTRING*/

}
