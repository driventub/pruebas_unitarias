package ec.edu.uce.paulo.repository;

import java.util.List;

import ec.edu.uce.paulo.modelo.CuentaBancaria;



public interface ICuentaBancariaRepo {
	void insertarCuentaBancaria(CuentaBancaria p);
	void borrarCuentaBancariaPorId(Integer id);
	CuentaBancaria buscarCuentaBancariaPorId(Integer id);
	void updateCuentaBancaria(CuentaBancaria p);
	List<CuentaBancaria> buscarPorCedula(String cedula);
	CuentaBancaria buscarPorNumCuenta(String numCuenta);
}
