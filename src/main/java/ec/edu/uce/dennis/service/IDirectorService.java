package ec.edu.uce.dennis.service;

import ec.edu.uce.dennis.modelo.Director;

public interface IDirectorService {

	void insertar(Director director);

	void actualizar(Director director);

	Director buscar(Integer id);

	void borrar(Integer id);

	Director buscarCedula(String cedula);

}
