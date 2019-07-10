package Spring.objeto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class RepositorioImpl implements Repositorio {
	private String id;
	private String nombre;

	/*public RepositorioImpl(String id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
*/
	//--------------------------------------------------------------------------------------------------------
	// GETTERS AND SETTERS
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public RepositorioImpl() {
		// TODO Auto-generated constructor stub
	}

//--------------------------------------------------------------------------------------------------------
	@Override
	public RepositorioImpl invertirNombreObjeto(RepositorioImpl repo) {
		RepositorioImpl r = repo;
		this.setNombre(repo.getNombre() + "-Concatenado");
		this.setId(repo.getId() + 1);
		return this;
	}

//---------------------------------------------------------------------------------------------------------
	@Override
	public List<RepositorioImpl> PermutarNombreObjeto(RepositorioImpl repo) {
			List<RepositorioImpl> lista = new ArrayList();
			List<String> listaString = new ArrayList();
			String txt = repo.getNombre();
			char[] array = txt.toCharArray();
			char[] copia = array;
			char aux;
			listaString.add(String.valueOf(array));
			for (int i = 0; i < txt.length(); i++) {
				for (int j = 0; j < txt.length(); j++) {
					for (int k = 0; k < txt.length(); k++) {
						for (int l = 0; l < txt.length(); l++) {
							aux = copia[k];
							copia[k] = copia[l];
							copia[l] = aux;
							if (!listaString.contains(String.valueOf(copia))) {
								listaString.add(String.valueOf(copia));
							}
						}
						aux = copia[j];
						copia[j] = copia[k];
						copia[k] = aux;
					}
					aux = copia[i];
					copia[i] = copia[j];
					copia[j] = aux;
				}
			}

			for(int i=0; i<listaString.size(); i++) {
				RepositorioImpl r = new RepositorioImpl();
				r.setId(""+(i+1));
				r.setNombre(listaString.get(i));
				
				lista.add(r);
				
			}
			
			return lista;
		}

}
