package br.com.entra21.precoproduto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Faça um programa que solicite o nome e preço de custo de um produto qualquer, após, processe um aumento de 65% e informe qual será o preço de venda.");
		
		String nome;
		float precoCusto,precoVenda;				
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Qual o nome do produto?");
		nome = entrada.nextLine();
		
	
		precoCusto = entrada.nextFloat();
		
		precoVenda = entrada.nextFloat();
		
		precoVenda = precoCusto + ( precoCusto * 65 / 100);
		
		System.out.println("O preço de venda é "+precoVenda); 
		
		
		
		
		
		
		
		
		
	

	}

}
