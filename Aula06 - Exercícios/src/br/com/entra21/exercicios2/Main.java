package br.com.entra21.exercicios2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String resposta;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual time não tem mundial?");
		resposta = entrada.next();
		
		switch(resposta) {
		
		case "Internacional":
			System.out.println("Não podemos esquercer do MAZEMBEDAY");
			break;
			
		case "Grêmio":
			System.out.println("Hamburgo é time grande sim");
			break;
			
		case "Corinthians":
			System.out.println("E furtou metade do lugar kkk");
			break;
			
		case "São Paulo":
			System.out.println("BAMBII");
			break;
			
			default:
			break;
			
		}
		
		
		

	}

}
