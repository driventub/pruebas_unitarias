package ec.edu.uce.dennis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.dennis.modelo.Director;
import ec.edu.uce.dennis.modelo.Pelicula;

@Service
public class CatalagoServiceImpl implements ICatalagoService {

	@Autowired
	private IPeliculaService iPeliculaService;

	@Autowired
	private IDirectorService iDirectorService;

	@Override
	public String nombreDirectorPelicula(String pelicula) {
		Pelicula p = this.iPeliculaService.buscarPeliculaPorTitulo(pelicula);
		return this.iDirectorService.buscar(p.getDirector().getId()).getNombre();
	}

}
