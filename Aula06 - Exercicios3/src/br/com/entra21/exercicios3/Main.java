package br.com.entra21.exercicios3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Escreva um menu de opções e trate a situação onde o usuário não escolha uma opção informada na lista");
		
		String opcao;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escolha uma opção");
		System.out.println("Brasil\nEUA\nEuropa");
		opcao = entrada.nextLine();
		
		opcao=opcao.toLowerCase();
		
		switch(opcao) {
		case "brasil":
			System.out.println("BRAZILL ZILL ZILL");
			break;
			
		case "eua":
			System.out.println("United States");
			break;
			
		case "europa":
			System.out.println("É um país da eurooopaa, o loco bichooo");
			break;
			
			default:
				System.out.println("Opção inválida, tente novamente");
				break;
				
		}

	}

}
