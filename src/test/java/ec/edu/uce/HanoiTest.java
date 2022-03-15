package ec.edu.uce;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HanoiTest {

	
	
	@Test
	void testCalcular() {
		Hanoi hanoiTower=new Hanoi();
		
		assertEquals(4, hanoiTower.calcular(2, 2));
	}

	@Test
	void testInicio() {
		Hanoi hanoiTower=new Hanoi();
		
		
		
		String sol="3	0	0\n"
				+ "paso n:1\n"
				+ "2	0	1\n"
				+ "paso n:2\n"
				+ "1	1	1\n"
				+ "paso n:3\n"
				+ "1	2	0\n"
				+ "paso n:4\n"
				+ "0	2	1\n"
				+ "paso n:5\n"
				+ "1	1	1\n"
				+ "paso n:6\n"
				+ "1	0	2\n"
				+ "paso n:7\n"
				+ "0	0	3";
		
		assertEquals(sol, hanoiTower.inicio(3));
	}

}
