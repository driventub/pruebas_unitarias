
package ec.edu.uce.paulo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.paulo.modelo.CuentaBancaria;
import ec.edu.uce.paulo.modelo.HistoricoRetiro;


@Service
public class OperacionesServiceImpl implements IOperacionesService{
	private  final Logger LOG = LoggerFactory.getLogger(OperacionesServiceImpl.class);
	
	@Autowired
	private ICuentaBancariaService bancService; 
	
	@Autowired
	private IHistoricoRetiroService retiroService;
	
	@Autowired
	private ICuentaHabienteService habienteService;
	
	
	
	@Override
	@Transactional
	public BigDecimal realizarRetiro(String numCuenta, BigDecimal valorRetiro) {
		CuentaBancaria c = this.bancService.buscarPorNumCuenta(numCuenta);
		
		HistoricoRetiro h = new HistoricoRetiro();
		
		BigDecimal transaccion = c.getSaldo().subtract(valorRetiro);
		c.setSaldo(transaccion);
		
		try {
			this.bancService.updateCuentaBancaria(c);
		}catch(NullPointerException e) {
			LOG.error("Persistio la excepcion");
		}
		
		
		h.setCuentaBancaria(c);
		h.setCuentaHabiente(c.getCuentaHabiente());
		h.setMontoRetiro(valorRetiro);
		h.setFechaRetiro(LocalDateTime.now());
		
		this.retiroService.insertarHistoricoRetiro(h);
		
		return transaccion;
		
		
	}



	@Override
	public void calcularSaldoLambda(BigDecimal saldo) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void calcularReporteLambda(LocalDateTime fechaRetiro, BigDecimal montoRetiro) {
		// TODO Auto-generated method stub
		
	}
	


}
