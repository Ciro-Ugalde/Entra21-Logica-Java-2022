package br.com.entra21.prova02;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	
		
		
		String nome, signo, opcao;
		int mes;
		
		byte dia = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Vamos descobrir qual é seu signo!");
		
		System.out.println("================================================================");
		
	   System.out.println("Seu nome é: ");
	   nome = entrada.nextLine();
	   System.out.println("=================================================================");
	   
	   System.out.println("Dia do seu aniversário: ");
	   dia = entrada.nextByte();
	   System.out.println("==================================================================");
	   System.out.println("=================================================================");
	   	   
	   System.out.println("Mês em que você nasceu: ");
	   System.out.println("1 - Janeiro // 2 - Fevereiro // 3 - Março // 4 - Abril // 5 - Maio // 6 - Junho // 7 - Julho // 8 - Agosto // 9 - Setembro // 10 - Outubro // 11 - Novembro // 12 - Dezembro");
	   opcao = entrada.next();
	   System.out.println("=================================================================");
	   
	   

			
		switch (opcao.toLowerCase()) {
		
		case "1":
		case "janeiro":
		mes = 1;
		break;
		case "2":
		case "fevereiro":
		mes = 2;
		break;
		case "3":
		case "marco":
		mes = 3;
		break;
		case "4":
		case "abril":
		mes = 4;
		break;
		case "5":
		case "maio":
		mes = 5;
		break;
		case "6":
		case "junho":
		mes = 6;
		break;
		case "7":
		case "julho":
		mes = 7;
		break;
		case "8":
		case "agosto":
		mes = 8;
		break;
		case "9":
		case "setembro":
		mes = 9;
		break;
		case "10":
		case "outubro":
		mes = 10;
		break;
		case "11":
		case "novembro":
		mes = 11;
		break;
		case "12":
		case "dezembro":
		mes = 12;
		break;
		default:
				System.out.println("Opção Inexistente!");
	}
			
		
		
				
		
		if (signo == "error") {
			System.out.println("Houve algum erro no processo! Tente novamente!");
			
		} else {
			System.out.println("|===============================================================|");
			System.out.println("-- "+nome.toUpperCase() + " você nasceu no dia "+dia+" do mes "+mes+" seu signo é " + signo+"! --");
			System.out.println("|===============================================================|");
		}
	}
		
		
		
		
		public static void verificar(byte mes, byte dia) {
			
			final byte diasLimiteMes29 = 29;
			final byte diasLimiteMes30 = 30;
			final byte diasLimiteMes31 = 31;
			
			if (mes == 2 && dia >diasLimiteMes29) {
				System.out.println("Por favor, digite uma opção válida FEVEREIRO TEM no máximo 29 dias.");
			} else if (mes == 4 && dia >diasLimiteMes30) {
				System.out.println("Por favor, digite uma opção válida ABRIL TEM no máximo 30 dias.");
			} else if (mes == 6 && dia >diasLimiteMes30) {
				System.out.println("Por favor, digite uma opção válida JUNHO TEM no máximo 30 dias.");
			} else if (mes == 9 && dia >diasLimiteMes30) {
				System.out.println("Por favor, digite uma opção válida SETEMBRO TEM no máximo 30 dias.");
			} else if (mes == 11 && dia >diasLimiteMes30) {
				System.out.println("Por favor, digite uma opção válida NOVEMBRO TEM no máximo 30 dias.");
			} else if (dia >diasLimiteMes31){
				System.out.println("Por favor, digite uma opção válida. Um mês tem no máximo 31 dias.");
			} else { 
				
				verificar(mes,dia);
			}
		}
		
		
		
	
		String signo  
		
		if else (mes == 3 && dia >= 21 && dia <= 31 / mes == 4 && dia <= 20) {
			signo = "ARIES";
		}  if (mes == 4 && dia >= 21 && dia <= 30 / mes == 5 && dia <= 20) {
			signo = "TOURO";
		} else if (mes == 5 && dia >= 21 && dia <= 31 / mes == 6 && dia <= 20) {
			signo = "GEMEOS";
		} else if (mes == 6 && dia >= 21 && dia <= 30 / mes == 7 && dia <= 22) {
			signo = "CANCER";
		} else if (mes == 7 && dia >= 23 && dia <= 31 / mes == 8 && dia <= 22) {
			signo = "LEAO";
		} else if (mes == 8 && dia >= 23 && dia <= 31 / mes == 9 && dia <= 22) {
			signo = "VIRGE";
		} else if (mes == 9 && dia >= 23 && dia <= 30 / mes == 10 && dia <= 22) {
			signo = "LIBRA";
		} else if (mes == 10 && dia >= 23 && dia <= 31 / mes == 11 && dia <= 21) {
			signo = "ESCORPIAO";
		} else if (mes == 11 && dia >= 22 && dia <= 30 / mes == 12 && dia <= 21) {
			signo = "SAGITARIO";
		} else if (mes == 12 && dia >= 22 && dia <= 31 / mes == 1 && dia <= 20) {
			signo = "CAPRICORNIO";
		} else if (mes == 1 && dia >= 21 && dia <= 31 / mes == 2 && dia <= 18) {
			signo = "AQUARIO";
		} else if (mes == 2 && dia >= 19 && dia <= 29/ mes == 3 && dia <= 20) {
			signo = "PEIXES";
		} else {
			signo = "error";
		}

		return signo;
	}
}
		
