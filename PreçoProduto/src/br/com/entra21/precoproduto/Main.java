package br.com.entra21.precoproduto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Fa�a um programa que solicite o nome e pre�o de custo de um produto qualquer, ap�s, processe um aumento de 65% e informe qual ser� o pre�o de venda.");
		
		String nome;
		float precoCusto,precoVenda;				
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Qual o nome do produto?");
		nome = entrada.nextLine();
		
	
		precoCusto = entrada.nextFloat();
		
		precoVenda = entrada.nextFloat();
		
		precoVenda = precoCusto + ( precoCusto * 65 / 100);
		
		System.out.println("O pre�o de venda � "+precoVenda); 
		
		
		
		
		
		
		
		
		
	

	}

}
