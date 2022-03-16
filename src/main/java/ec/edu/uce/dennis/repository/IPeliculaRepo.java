package ec.edu.uce.dennis.repository;

import ec.edu.uce.dennis.modelo.Pelicula;

public interface IPeliculaRepo {

	void insertarPelicula(Pelicula pelicula);

	void actualizarPelicula(Pelicula pelicula);

	Pelicula buscarPelicula(Integer id);

	void borrarPelicula(Integer id);

	Pelicula buscarPeliculaPorTitulo(String titulo);


}
