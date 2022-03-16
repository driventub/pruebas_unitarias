package ec.edu.uce.paulo.repository;

import java.util.List;

import ec.edu.uce.paulo.modelo.CuentaHabiente;



public interface ICuentaHabienteRepo {
	void insertarCuentaHabiente(CuentaHabiente p);
	void borrarCuentaHabientePorId(Integer id);
	CuentaHabiente buscarCuentaHabientePorId(Integer id);
	void updateCuentaHabiente(CuentaHabiente p);
	
}

