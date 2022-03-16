package ec.edu.uce.dennis.service;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.dennis.modelo.Director;
import ec.edu.uce.dennis.repository.IDirectorRepo;


@Service
public class DirectorServiceImpl implements IDirectorService {

	@Autowired
	private IDirectorRepo iDirectorRepo;

	@Override
	public void insertar(Director director) {
		this.iDirectorRepo.insertar(director);
	}

	@Override
	@Transactional
	public void actualizar(Director director) {
		this.iDirectorRepo.actualizar(director);
	}

	@Override
	public Director buscar(Integer id) {
		return this.iDirectorRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		this.iDirectorRepo.borrar(id);
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public Director buscarCedula(String cedula) {
		return this.iDirectorRepo.buscarCedula(cedula);
	}

}
