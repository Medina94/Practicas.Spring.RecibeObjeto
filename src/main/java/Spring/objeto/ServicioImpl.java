package Spring.objeto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioImpl implements Servicio{
	@Autowired
	private Repositorio repositorio;
	
	
	public Repositorio getRepositorio() {
		return repositorio;
	}


	public void setRepositorio(Repositorio repositorio) {
		this.repositorio = repositorio;
	}


	@Override
	public RepositorioImpl traerObjeto(RepositorioImpl repo) {
		return repositorio.invertirNombreObjeto(repo);
	}


	@Override
	public List<RepositorioImpl> traerLista(RepositorioImpl repo) {
		return repositorio.PermutarNombreObjeto(repo);
	}

}
