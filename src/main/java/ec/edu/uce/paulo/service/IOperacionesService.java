package ec.edu.uce.paulo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;


public interface IOperacionesService {
	BigDecimal realizarRetiro(String numCuenta, BigDecimal valorRetiro);
	void calcularSaldoLambda(BigDecimal saldo);
	void calcularReporteLambda(LocalDateTime fechaRetiro, BigDecimal montoRetiro);
	
}
