package Spring.objeto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Repository;

@Repository
public class RepositorioImpl implements Repositorio {
	private String id;
	private String nombre;

	public RepositorioImpl(String id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	// --------------------------------------------------------------------------------------------------------
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
		RepositorioImpl r = new RepositorioImpl();
		String txt = "";
		String s = repo.getNombre();
		for (int i = (s.length() - 1); i >= 0; i--) {
			txt += repo.getNombre().charAt(i);
		}
		r.setNombre(txt);
		r.setId(repo.getId());
		return r;
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

		for (int i = 0; i < listaString.size(); i++) {
			RepositorioImpl r = new RepositorioImpl();
			r.setId("" + (i + 1));
			r.setNombre(listaString.get(i));

			lista.add(r);

		}

		return lista;
	}

	// --------------------------------------------------------------------------------------------------------------------
	private void intercambiar(char[] array, int pos, int pos2) {
		char temp = array[pos];
		array[pos] = array[pos2];
		array[pos2] = temp;
	}

	@Override
	public List<RepositorioImpl> permutacionString(String nombre, int indice) {
		List<RepositorioImpl> lista = new ArrayList();

		char[] array = nombre.toCharArray();

		if (indice == array.length - 1) {
			lista.add(new RepositorioImpl("" + 1, String.valueOf(array)));
		}
		for (int i = indice; i < nombre.length(); i++) {
			intercambiar(array, indice, i);
			permutacionString(nombre, indice + 1);
			intercambiar(array, indice, i);
		}

		return lista;
	}

	// -----------------------------------------------------------------------------------------
	/*@Override
	public List<String> permutacionTexto(RepositorioImpl repo) {
		Set<String> set = new HashSet();
		List<Character> letras = new ArrayList();
		for (int i = 0; i < repo.getNombre().length(); i++) {
			letras.add(repo.getNombre().charAt(i));
		}
		
		while(set.size()<25) {
			Collections.shuffle(letras);
			set.add( convertirAString(letras));
		}
		return set;
	}*/

	private String convertirAString(List<Character> lista) {
		String s = "";
		for(int i=0; i<lista.size(); i++) {
			s += lista.get(i);
		}
		return s;
	}
}
