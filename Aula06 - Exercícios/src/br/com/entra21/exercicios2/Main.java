package br.com.entra21.exercicios2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String resposta;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual time n�o tem mundial?");
		resposta = entrada.next();
		
		switch(resposta) {
		
		case "Internacional":
			System.out.println("N�o podemos esquercer do MAZEMBEDAY");
			break;
			
		case "Gr�mio":
			System.out.println("Hamburgo � time grande sim");
			break;
			
		case "Corinthians":
			System.out.println("E furtou metade do lugar kkk");
			break;
			
		case "S�o Paulo":
			System.out.println("BAMBII");
			break;
			
			default:
			break;
			
		}
		
		
		

	}

}
