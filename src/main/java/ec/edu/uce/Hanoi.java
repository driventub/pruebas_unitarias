package ec.edu.uce;

import java.util.Stack;

public class Hanoi {

	public static boolean Hanoi(Stack<String> pri, Stack<String> des) {
		if (!pri.isEmpty()) {
			if (des.isEmpty()) {
				des.push(pri.pop());
				return true;
			} else {
				int a = Integer.parseInt(pri.peek());
				int b = Integer.parseInt(des.peek());
				if (a < b) {
					des.push(pri.pop());
					return true;
				}
			}
			return false;
		}
		return false;
	}

	static int Primero(Stack<String> _1, Stack<String> _2, Stack<String> _3) {
		int a = (int) Integer.valueOf(_1.peek());

		if (a == 1) {
			return 1;
		} else {
			int b = Integer.valueOf(_2.peek());

			if (b == 1) {
				return 2;
			} else {
				return 3;
			}
		}
	}

	public int calcular(int a, int b) {
		int suma = a + b;
		return suma;
	}

	public String inicio(int n) {
		Stack<String> pila = new Stack<String>();
		Stack<String> pila1 = new Stack<String>();
		Stack<String> pila2 = new Stack<String>();

		for (int i = n; i != 0; i--) {
			pila.push(Integer.toString(i));
		}

		int con1 = n, con2 = 0, con3 = 0, cont = 1, pri = 0, ant = 0;
		// System.out.println("Numero de pasos minimos: " + (int) (Math.pow(2, n) - 1));
		// System.out.println(con1 + "\t" + con2 + "\t" + con3);// 0

		String solucion = con1 + "\t" + con2 + "\t" + con3;

		// iniio primer while
		while (con1 != 0 || con2 != 0) {
			try {
				pri = Primero(pila, pila1, pila2);
			} catch (Exception e) {
			}
			if (cont % 2 == 1) {// 2
				ant = pri;// a
				switch (pri) {
				case 1:// 3
					if (con1 % 2 == 1) {// 5
						if (Hanoi(pila, pila2)) {
							con1--;
							con3++;
							cont++;
						}
					} // 4
					else if (Hanoi(pila, pila1)) {
						con1--;
						con2++;
						cont++;
					} // 4
					int temp = cont;
					
					
					String sol1="paso n:" + (temp - 1);
					//System.out.println("paso n:" + (temp - 1));
					String sol2=con1 + "\t" + con2 + "\t" + con3;
					//System.out.println(con1 + "\t" + con2 + "\t" + con3);// 0
					solucion=solucion+"\n"+sol1+"\n"+sol2;
					
					break;
				case 2:// 3
					if (con2 % 2 == 1) {// 5
						if (Hanoi(pila1, pila2)) {
							con2--;
							con3++;
							cont++;
						}
					} // 4
					else if (Hanoi(pila1, pila)) {
						con2--;
						con1++;
						cont++;
					} // 4
					int temp2 = cont;
					String sol3="paso n:" + (temp2 - 1);
					//System.out.println("paso n:" + (temp2 - 1));
					String sol4=con1 + "\t" + con2 + "\t" + con3;
					//System.out.println(con1 + "\t" + con2 + "\t" + con3);// 0
					solucion=solucion+"\n"+sol3+"\n"+sol4;
					
					break;
				case 3:// 3
					if (con3 % 2 == 1) {// 5
						if (Hanoi(pila2, pila1)) {
							con3--;
							con2++;
							cont++;
						}
					} // 4
					else if (Hanoi(pila2, pila)) {
						con3--;
						con1++;
						cont++;
					} // 4
					int temp3 = cont;
					String sol5="paso n:" + (temp3 - 1);
					//System.out.println("paso n:" + (temp3 - 1));
					String sol6=con1 + "\t" + con2 + "\t" + con3;
					//System.out.println(con1 + "\t" + con2 + "\t" + con3);// 0
					solucion=solucion+"\n"+sol5+"\n"+sol6;
				}
			} else {// 2

				switch (ant) {
				case 1:
					if (!pila.isEmpty()) {// 6
						if (con1 % 2 == 1) {// 5
							if (Hanoi(pila, pila2)) {
								con1--;
								con3++;
								cont++;
							} // 4
							else {// 7
								if (Primero(pila, pila1, pila2) == 2) {
									ant = 3;
								} else {
									ant = 2;
								}
							}
						} else {// 5
							if (Hanoi(pila, pila1)) {
								con1--;
								con2++;
								cont++;
							} // 4
							else {// 7
								if (Primero(pila, pila1, pila2) == 2) {
									ant = 3;
								} else {
									ant = 2;
								}
							}
						}
						int temp = cont;
						String sol7="paso n:" + (temp - 1);
						//System.out.println("paso n:" + (temp - 1));
						String sol8=con1 + "\t" + con2 + "\t" + con3;
						//System.out.println(con1 + "\t" + con2 + "\t" + con3); // 0
						solucion=solucion+"\n"+sol7+"\n"+sol8;
						
						break;
					} else {// 6
						try {
							if (Primero(pila, pila1, pila2) == 2) {
								ant = 3;
							} else {
								ant = 2;
							}
							break;
						} catch (Exception e) {
						}

					}
				case 2:
					if (!pila1.isEmpty()) {// 6
						if (con2 % 2 == 1) {// 5
							if (Hanoi(pila1, pila2)) {
								con2--;
								con3++;
								cont++;
							} // 4
							else {// 7
								if (Primero(pila, pila1, pila2) == 3) {
									ant = 1;
								} else {
									ant = 3;
								}
							}
						} else {// 5
							if (Hanoi(pila1, pila)) {
								con2--;
								con1++;
								cont++;
							} // 4
							else {// 7
								if (Primero(pila, pila1, pila2) == 3) {
									ant = 1;
								} else {
									ant = 3;
								}
							}
						}
						int temp = cont;
						String sol9="paso n:" + (temp - 1);
						//System.out.println("paso n:" + (temp - 1));
						String sol10=con1 + "\t" + con2 + "\t" + con3;
						//System.out.println(con1 + "\t" + con2 + "\t" + con3); // 0
						solucion=solucion+"\n"+sol9+"\n"+sol10;
						
						break;
					} else {// 6
						try {
							if (Primero(pila, pila1, pila2) == 3) {
								ant = 1;
							} else {
								ant = 3;
							}
							break;
						} catch (Exception e) {
						}

					}
				case 3:
					boolean tempPantalla = true;
					if (!pila2.isEmpty()) {// 6
						if (con3 % 2 == 1) {// 5
							if (Hanoi(pila2, pila1)) {
								con3--;
								con2++;
								cont++;
								tempPantalla = false;
							} // 4
							else {// 7
								if (Primero(pila, pila1, pila2) == 2) {
									ant = 1;
								} else {
									ant = 2;
								}
							}
						} else {// 5
							if (Hanoi(pila2, pila)) {
								con3--;
								con1++;
								cont++;
							} // 4
							else {// 7
								if (Primero(pila, pila1, pila2) == 2) {
									ant = 1;
								} else {
									ant = 2;
								}
							}
						}

						break;
					} else {// 6
						if (Primero(pila, pila1, pila2) == 2) {
							ant = 1;
						} else {
							ant = 2;
						}
					}
				}
			}
		}
		return solucion;
	}

}
