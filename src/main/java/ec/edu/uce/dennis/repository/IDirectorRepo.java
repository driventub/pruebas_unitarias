package ec.edu.uce.dennis.repository;

import ec.edu.uce.dennis.modelo.Director;

public interface IDirectorRepo {

	void insertar(Director director);

	void actualizar(Director director);

	Director buscar(Integer id);

	Director buscarCedula(String cedula);

	void borrar(Integer id);
}
