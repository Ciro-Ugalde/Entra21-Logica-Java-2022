package br.com.entra21.exercicioswitch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		String resposta;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("1 = Primavera");
		System.out.println("2 = Outono");
		System.out.println("3 = Inverno");
		System.out.println("4 = Verão");
		System.out.println("Qual é a sua estação do ano favorita? ");
		resposta = entrada.next();
		
		switch(resposta) {
		case "1":
			System.out.println("As cores aparecem");
			break;
			
		case "2":
			System.out.println("Winter is coming");
			break;
			
		case "3":
			System.out.println("Chegou");
			break;
			
		case "4":
			System.out.println("Calorão");
			break;
			default:
				break;
		}
		
		System.out.println("Qual é a sua cor favorita? ");
		resposta = entrada.next();
		
		
		switch(resposta) {
		
		case "verde":
			System.out.println("verde do mato");
			break;
			
		case "azul":
			System.out.println("azul do céu");
			break;
			
		case "vermelho":
		System.out.println("cor de sangue");
		break;
		
		case "preto":
		System.out.println("cor do espaço");
		break;
		
		default:
			System.out.println("Era muito simples!!!");
		}
		
			
	}
}
