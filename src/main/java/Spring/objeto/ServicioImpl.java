package Spring.objeto;

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
	public RepositorioImpl traerObjeto() {
		return repositorio.getObjeto();
	}

}
