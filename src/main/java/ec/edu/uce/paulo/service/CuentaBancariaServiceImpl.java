package ec.edu.uce.paulo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.paulo.modelo.CuentaBancaria;
import ec.edu.uce.paulo.repository.ICuentaBancariaRepo;



@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService {

	@Autowired
	private ICuentaBancariaRepo cuentaBancaria;

	@Override
	public void insertarCuentaBancaria(CuentaBancaria p) {
		this.cuentaBancaria.insertarCuentaBancaria(p);

	}

	@Override
	public CuentaBancaria buscarCuentaBancariaPorId(Integer id) {
		return this.cuentaBancaria.buscarCuentaBancariaPorId(id);

	}

	@Override
	public void updateCuentaBancaria(CuentaBancaria p) {
		this.cuentaBancaria.updateCuentaBancaria(p);

	}

	@Override
	public void borrarCuentaBancariaPorId(Integer id) {
		this.cuentaBancaria.borrarCuentaBancariaPorId(id);

	}

	@Override
	public List<CuentaBancaria> buscarPorCedula(String cedula) {

		return this.cuentaBancaria.buscarPorCedula(cedula);
	}

	@Override
	public CuentaBancaria buscarPorNumCuenta(String numCuenta) {
		
		return this.cuentaBancaria.buscarPorNumCuenta(numCuenta);
	}
}
