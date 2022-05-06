package br.com.entra21.prova01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escolha a op��o de calculo que desejar:");
		
		String opcao;
		
		System.out.println("Deseja calcular?");
		System.out.println("Sim \nNao");
		opcao = entrada.nextLine();
		
		switch (opcao.toLowerCase()) {
		case "sim":
			float numero1,numero2;
			System.out.println("Qual � o seu primeiro numero: ");
			numero1 = entrada.nextFloat();			
			System.out.println("Qual o seu segundo numero: ");
			numero2 = entrada.nextFloat();
			
			System.out.println("O resultado da opera��o � "+calculadoraCalcular(numero1,numero2));
			break;
			
		case "nao":
			System.out.println("Foi bom te ter por aqui");
			break;
			
		}
	}
	
		public static float calculadoraCalcular(float numero1, float numero2) {
			
			Scanner entrada = new Scanner(System.in);
			
			String expressao;
			float resultado = 0;
			
			System.out.println("Qual opera��o voc� deseja fazer?");
			System.out.println("+\n-\n*\n/");
			expressao = entrada.nextLine();
				
			switch(expressao) {
			
			case "+":
				resultado = numero1 + numero2;
			break;
			
			case "-":
				resultado = numero1 - numero2;
			break;
			
			case "*":
				resultado = numero1 * numero2;
			break;
			
			case "/":
				resultado = numero1 / numero2;
			break;
			
			default:
			    System.out.println("Voc� digitou uma op��o inv�lida");
			    break;
			    
			}
			return resultado;
			
			
		}
	
}
