package ec.edu.uce.paulo.service;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@SpringBootTest
@Rollback(true)
@Transactional
class OperacionesServiceImplTest {
	
	@Autowired
	private IOperacionesService operaciones;
	
	
	
	@Test
	void testRealizarRetiro() {
		assertEquals( new BigDecimal("1832.27"), this.operaciones.realizarRetiro("1234429-3", new BigDecimal("2.00")));
	}

}
