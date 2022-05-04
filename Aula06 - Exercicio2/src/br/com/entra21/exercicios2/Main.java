package br.com.entra21.exercicios2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String escolha;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Com o mesmo formato do exercício 1, agora aceite apenas String como resposta");
		
		System.out.println("Escolha sua cor favorita entre as opções :\nVerde\nAmarelo\nAzul\nVermelho");
		escolha= entrada.nextLine();
		
		switch(escolha) {
		
		case "verde":
			System.out.println("verdinho né");
			break;
			
		case "VERDE":
			System.out.println("verdão né");
			break;
			
		case "azul":
			System.out.println("Você gosta de azul");
			break;
			
		case "vermelho":
			System.out.println("gosta de vermelho");
			break;
			
		
		}
		
		
		

	}

}