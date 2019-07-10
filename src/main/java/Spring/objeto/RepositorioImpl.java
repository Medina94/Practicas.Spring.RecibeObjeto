package Spring.objeto;

import org.springframework.stereotype.Repository;

@Repository
public class RepositorioImpl implements Repositorio{
	private int id;
	private String nombre;
	
//--------------------------------------------------------------------------------------------------------
	//GETTERS AND SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

//--------------------------------------------------------------------------------------------------------
	@Override
	public RepositorioImpl getObjeto() {
		// TODO Auto-generated method stub
		return this;
	}

}
