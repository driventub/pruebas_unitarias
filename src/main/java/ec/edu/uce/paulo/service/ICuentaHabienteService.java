package ec.edu.uce.paulo.service;

import java.util.List;

import ec.edu.uce.paulo.modelo.CuentaHabiente;



public interface ICuentaHabienteService {
	void insertarCuentaHabiente(CuentaHabiente p);
	void borrarCuentaHabientePorId(Integer id);
	CuentaHabiente buscarCuentaHabientePorId(Integer id);
	void updateCuentaHabiente(CuentaHabiente p);
	
}
