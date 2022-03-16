package ec.edu.uce.paulo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.paulo.modelo.CuentaHabiente;
import ec.edu.uce.paulo.repository.ICuentaHabienteRepo;



@Service
public class CuentaHabienteServiceImpl implements ICuentaHabienteService {

	@Autowired
	private ICuentaHabienteRepo cuentaHabiente;

	@Override
	public void insertarCuentaHabiente(CuentaHabiente p) {
		this.cuentaHabiente.insertarCuentaHabiente(p);

	}

	@Override
	public CuentaHabiente buscarCuentaHabientePorId(Integer id) {
		return this.cuentaHabiente.buscarCuentaHabientePorId(id);

	}

	@Override
	public void updateCuentaHabiente(CuentaHabiente p) {
		this.cuentaHabiente.updateCuentaHabiente(p);

	}

	@Override
	public void borrarCuentaHabientePorId(Integer id) {
		this.cuentaHabiente.borrarCuentaHabientePorId(id);

	}

	
}
