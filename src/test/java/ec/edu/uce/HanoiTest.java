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
		
		
		
		String sol="3	0	0\npaso n:1\n2	0	1\npaso n:2\n1	1	1\npaso n:3\n1	2	0\npaso n:4\n0	2	1\npaso n:5\n1	1	1\npaso n:6\n1	0	2\npaso n:7\n0	0	3";
		
		assertEquals(sol, hanoiTower.inicio(3));
	}

}
