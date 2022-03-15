package ec.edu.uce.dennis.service;

import ec.edu.uce.dennis.modelo.Pelicula;

public interface IPeliculaService {

	void guardarPeliculaNuevo(Pelicula pelicula);

	void borrarPeliculaId(Integer id);

	void actualizarPelicula(Pelicula pelicula);

	Pelicula buscarPeliculaId(Integer id);

	Pelicula buscarPeliculaPorTitulo(String titulo);

}
