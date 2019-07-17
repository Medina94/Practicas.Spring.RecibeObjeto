package Spring.objeto;

import java.util.List;
import java.util.Set;

public interface Repositorio {
	public RepositorioImpl invertirNombreObjeto(RepositorioImpl repo);
	public List<RepositorioImpl> PermutarNombreObjeto(RepositorioImpl repo);
	public List<RepositorioImpl> permutacionString(String repo, int indice);
	//public Set<RepositorioImpl> permutacionTexto(RepositorioImpl repo);
}
