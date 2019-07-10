package Spring.objeto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objeto")
public class Controlador {
	@Autowired
	private Servicio servicio;
	
	@PostMapping(consumes= {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
	public RepositorioImpl traerDatosObjeto(@RequestBody RepositorioImpl repo) {
		
		return servicio.traerObjeto(repo);
	}
	
	@RequestMapping("/permutar")
	@PostMapping(consumes= {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<RepositorioImpl> traerListaPermutaciones(@RequestBody RepositorioImpl repo) {
		return servicio.traerLista(repo);
	}
}
