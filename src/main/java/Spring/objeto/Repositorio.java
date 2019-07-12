package Spring.objeto;

import java.util.List;

public interface Repositorio {
	public RepositorioImpl invertirNombreObjeto(RepositorioImpl repo);
	public List<RepositorioImpl> PermutarNombreObjeto(RepositorioImpl repo);
	public List<RepositorioImpl> permutacionString(String repo, int indice);
}
