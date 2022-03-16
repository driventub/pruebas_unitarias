package ec.edu.uce;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.paulo.modelo.CuentaBancaria;
import ec.edu.uce.paulo.modelo.CuentaHabiente;
import ec.edu.uce.paulo.service.ICuentaBancariaService;
import ec.edu.uce.paulo.service.ICuentaHabienteService;
import ec.edu.uce.paulo.service.IOperacionesService;

@SpringBootApplication
public class ProyectoSpringJpaPaApplication implements CommandLineRunner {

	@Autowired
	private ICuentaBancariaService banc;

	@Autowired
	private ICuentaHabienteService habi;

	@Autowired
	private IOperacionesService ope;

	private static final Logger LOG = LoggerFactory.getLogger(ProyectoSpringJpaPaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProyectoSpringJpaPaApplication.class, args);
	}

	@Override

	public void run(String... args) throws Exception {

		CuentaBancaria b1 = new CuentaBancaria();
		CuentaBancaria b2 = new CuentaBancaria();
		CuentaHabiente h1 = new CuentaHabiente();
		CuentaHabiente h2 = new CuentaHabiente();

		h1.setNombre("Wilson");
		h1.setApellido("Garcia");
		h1.setCedula("173478565-0");

		h2.setNombre("Lucas");
		h2.setApellido("Sosa");
		h2.setCedula("180987269-1");

		b1.setNumCuenta("1234429-3");
		b1.setSaldo(new BigDecimal("2000.00"));
		b1.setTipo("Ahorros");
		b1.setCuentaHabiente(h1);

		b2.setNumCuenta("7893232-1");
		b2.setSaldo(new BigDecimal("2000.00"));
		b2.setTipo("Corriente");
		b2.setCuentaHabiente(h2);

		//habi.insertarCuentaHabiente(h2);
		//banc.insertarCuentaBancaria(b2);
		
//		this.ope.realizarRetiro(b1.getNumCuenta(),new BigDecimal("1.55"));

	}
}
