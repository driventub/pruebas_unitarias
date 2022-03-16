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
	

	private static final Logger LOG = LoggerFactory.getLogger(ProyectoSpringJpaPaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProyectoSpringJpaPaApplication.class, args);
	}

	@Override

	public void run(String... args) throws Exception {
//		this.ope.realizarRetiro(b1.getNumCuenta(),new BigDecimal("1.55"));
	}


	
		
		
	}
	

