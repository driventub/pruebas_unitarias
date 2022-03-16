package ec.edu.uce.dennis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.dennis.modelo.Pelicula;
import ec.edu.uce.dennis.repository.IPeliculaRepo;


@Service
public class PeliculaServiceImpl implements IPeliculaService {

	@Autowired
	private IPeliculaRepo iPeliculaRepo;

	@Override
	public void guardarPeliculaNuevo(Pelicula pelicula) {
		this.iPeliculaRepo.insertarPelicula(pelicula);
	}

	@Override
	public void borrarPeliculaId(Integer id) {
		this.iPeliculaRepo.borrarPelicula(id);
	}

	@Override
	public void actualizarPelicula(Pelicula pelicula) {
		this.iPeliculaRepo.actualizarPelicula(pelicula);
	}

	@Override
	public Pelicula buscarPeliculaId(Integer id) {
		return this.iPeliculaRepo.buscarPelicula(id);
	}

	@Override
	public Pelicula buscarPeliculaPorTitulo(String titulo) {
		return this.iPeliculaRepo.buscarPeliculaPorTitulo(titulo);
	}


}
