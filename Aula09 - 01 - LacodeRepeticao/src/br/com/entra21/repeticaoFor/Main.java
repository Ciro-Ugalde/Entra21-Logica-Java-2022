package br.com.entra21.repeticaoFor;

public class Main {

	public static void main(String[] args) {

		System.out.println("Aprendendo sobre laços de repetição - for");
			
			// contador 1
		for (int contador1 = 1; contador1 < 10; contador1 = contador1 + 1) {

			System.out.println("Repetindo " + contador1);
			System.out.println("------");
		}
			
			// contador 2
		for (int contador = 1; contador <= 10; contador += 2) {

			System.out.println("Repetindo " + contador);
			System.out.println("============");
			// System.out.println(contador1);
			// Não é possível usar a variável contador1, pois ela só existe no outro escopo do for

		}
			
			// contador 3
		for (int contador = 4; contador <= 20; contador += 2) {
			
			System.out.println("Repetindo " + contador);
			System.out.println("///////");
		}
			
			// contador 4
		for (int contador = 10; contador > 1; contador = contador -= 1) {
			
			System.out.println("Repetindo " + contador);
			System.out.println("********");
			
		}
		int numero = 3 ;
		int contador = 1;
		
		for (contador = 1; contador <= 10; contador ++) {
		System.out.println("Tabuada " + contador + " x " + numero + " = " + (contador * numero));
		}
		
		System.out.println("Olha como ficou o contador: " + contador);
		
	}
	
}
		
		