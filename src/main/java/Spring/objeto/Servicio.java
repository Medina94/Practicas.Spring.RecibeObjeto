package Spring.objeto;

import java.util.List;

public interface Servicio {
	public RepositorioImpl traerObjeto(RepositorioImpl repo);
	public List<RepositorioImpl> traerLista(RepositorioImpl repo);
}
