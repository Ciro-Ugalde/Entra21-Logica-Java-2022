package br.com.entra21.prova02;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	
		
					
				startSystem(); //Iniciar a funcao para capturar os dados do usuario. (Conceito de recursividade para implementar loops)

			}
			
			//----------- INICIO SISTEMA  --------------//
			public static void startSystem() {
				String nomeCompleto = nomeUsuario(); 	
				captureDates(nomeCompleto);			
				}
			
			//----------- CAPTURANDO NOME USUARIO --------------//
			public static String nomeUsuario() {
				Scanner input = new Scanner(System.in); 												
				String primeiroNome, ultimoNome; 													
				
				System.out.println("Olá, diga seu primeiro nome?"); 									
				primeiroNome = input.nextLine();														
				
				System.out.println("Seu último nome?"); 									
				ultimoNome = input.nextLine();														
						
				String primeiroLetterNome = primeiroNome.substring(0, 1).toUpperCase();					
				primeiroNome = primeiroLetterNome+primeiroNome.substring(1).toLowerCase(); 				
				
				String ultimoLetterNome = ultimoNome.substring(0, 1).toUpperCase();					
				ultimoNome = ultimoLetterNome+ultimoNome.substring(1).toLowerCase(); 				
				
				String nomeCompleto = primeiroNome+" "+ultimoNome;									
				return nomeCompleto;																	
			}

			//----------- CAPTURANDO ANIVERSARIO/MES USUARIO --------------//
			public static void captureDates(String nomeCompleto) {
				Scanner input = new Scanner(System.in); 												
				byte diaAniversario; 																		
				String mesAniversario; 																	
				
				System.out.println(nomeCompleto+", em que dia nos fomos agraciados com a sua vinda a terra?");	
				diaAniversario = input.nextByte();																	
				
				System.out.println(nomeCompleto+", em que mes nos fomos agraciados com a sua vinda a terra?\nSelecione o mes correspondente na lista:");
				System.out.println("1 - Janeiro    |  2 - Fevereiro   |  3 - Marco");
				System.out.println("4 - Abril      |  5 - Maio        |  6 - Junho");
				System.out.println("7 - Julho      |  8 - Agosto      |  9 - Setembro");
				System.out.println("10 - Outubro   |  11 - Novembro   |  12 - Dezembro");
						
				mesAniversario = input.next();
				
				switch(mesAniversario.toLowerCase()) {
				case "1":
				case "janeiro":
					//verificacao do mes
					validacaoTrintaUm(diaAniversario, nomeCompleto, 1);
					break;
				case "2","fevereiro":
					//verificacao do mes
					validacaoVinteeNove(diaAniversario, nomeCompleto, 2);
					break;
				case "3","marco":
					//verificacao do mes
					validacaoTrintaUm(diaAniversario, nomeCompleto, 3);
					break;
				case "4","abril":
					//verificacao do mes
					validacaoTrinta(diaAniversario, nomeCompleto, 4);
					break;
				case "5","maio":
					//verificacao do mes
					validacaoTrintaUm(diaAniversario, nomeCompleto, 5);
					break;
				case "6","junho":
					//verificacao do mes
					validacaoTrinta(diaAniversario, nomeCompleto, 6);
					break;
				case "7","julho":
					//verificacao do mes
					validacaoTrintaUm(diaAniversario, nomeCompleto, 7);
					break;
				case "8","agosto":
					//verificacao do mes
					validacaoTrintaUm(diaAniversario, nomeCompleto, 8);
					break;
				case "9","setembro":
					//verificacao do mes
					validacaoTrinta(diaAniversario, nomeCompleto, 9);
					break;
				case "10","outubro":
					//verificacao do mes
					validacaoTrintaUm(diaAniversario, nomeCompleto, 10);
					break;
				case "11","novembro":
					//verificacao do mes
					validacaoTrinta(diaAniversario, nomeCompleto, 11);
					break;
				case "12","dezembro":
					//verificacao do mes
					validacaoTrinta(diaAniversario, nomeCompleto, 12);
					break;
				default:
					System.out.println("Por favor, insira um número válido para o dia do mês.");
					datadeCaptura(nomeCompleto);
				}
			}
			
			//----------- VALIDAÇÃO PARA MESES COM 31 DIAS --------------//
			public static void validacaoTrintaUm(byte diaAniversario, String nomeCompleto, int mesAniversario){	
				final byte DIALIMITE=31; 																	
				if(diaAniversario>DIALIMITE) {																	
					System.out.println("Please, enter a valid value for the day of the month.");			
					captureDates(nomeCompleto);																	
				} else {																					
					verificacaoSigno(diaAniversario,mesAniversario, nomeCompleto);   							
				}
			}
						
				
			

			//----------- VALIDAÇÃO PARA MESES COM 30 DIAS --------------//
			public static void validacaoTrinta(byte diaAniversario, String nomeCompleto, int mesAniversario) {		
				final byte DIALIMITE=30;																		
				if(diaAniversario>DIALIMITE) {																	
					System.out.println("Por favor, insira um dia válido para o mês.");			
					datadeCaptura(nomeCompleto);																	
				} else {																					
					verificacaoSigno(diaAniversario, mesAniversario, nomeCompleto);   								
				}
			}
		
	
				
			

			private static void datadeCaptura(String nomeCompleto) {
								
			}

			//----------- VALIDAÇÃO PARA MESES COM 29 DIAS --------------//
			public static void validacaoVinteeNove(byte diaAniversario, String nomeCompleto, int mesAniversario){	
				final byte DIALIMITE=29;																		
				if(diaAniversario>DIALIMITE) {																	
					System.out.println("Por favor, insira um dia válido para o mês.");			
					datadeCaptura(nomeCompleto);																	
				} else {																					
					verificacaoSigno(diaAniversario, mesAniversario, nomeCompleto);    								
			   }
			}
			
			
			//----------- VERIFICANDO O SIGNO DO USUARIO --------------//
			private static void verificacaoSigno(byte diaAniversario, int mesAniversario, String nomeCompleto) {
				
				if(diaAniversario>=21 && mesAniversario==3 || diaAniversario<=20 && mesAniversario==4) {
					System.out.println(nomeCompleto+ " seu signo e ARIES!");
				} else if(diaAniversario>=21 && mesAniversario==4 || diaAniversario<=20 && mesAniversario==5) {
					System.out.println(nomeCompleto+ " seu signo e TOURO!");
				} else if(diaAniversario>=21 && mesAniversario==5 || diaAniversario<=20 && mesAniversario==6) {
					System.out.println(nomeCompleto+ " seu signo e GEMEOS!");
				} else if(diaAniversario>=21 && mesAniversario==6 || diaAniversario<=22 && mesAniversario==7) {
					System.out.println(nomeCompleto+ " seu signo e CANCER!");
				} else if(diaAniversario>=23 && mesAniversario==7 || diaAniversario<=22 && mesAniversario==8) {
					System.out.println(nomeCompleto+ " seu signo e LEAO!");
				} else if(diaAniversario>=23 && mesAniversario==8 || diaAniversario<=22 && mesAniversario==9) {
					System.out.println(nomeCompleto+ " seu signo e VIRGEM!");
				} else if(diaAniversario>=23 && mesAniversario==9 || diaAniversario<=22 && mesAniversario==10) {
					System.out.println(nomeCompleto+ " seu signo e LIBRA!");
				} else if(diaAniversario>=23 && mesAniversario==10 || diaAniversario<=21 && mesAniversario==11) {
					System.out.println(nomeCompleto+ " seu signo e ESCORPIAO!");
				} else if(diaAniversario>=22 && mesAniversario==11 || diaAniversario<=21 && mesAniversario==12) {
					System.out.println(nomeCompleto+ " seu signo e SAGITARIO!");
				} else if(diaAniversario>=22 && mesAniversario==12 || diaAniversario<=20 && mesAniversario==1) {
					System.out.println(nomeCompleto+ " seu signo e CAPRICORNIO!");
				} else if(diaAniversario>=21 && mesAniversario==1 || diaAniversario<=18 && mesAniversario==2) {
					System.out.println(nomeCompleto+ " seu signo e AQUARIO!");
				} else if(diaAniversario>=19 && mesAniversario==2 || diaAniversario<=20 && mesAniversario==3) {
					System.out.println(nomeCompleto+ " seu signo e PEIXES!");
				} else {
					System.out.println(nomeCompleto+"Voce se superou! Como voce chegou ate aqui?!");
				}
				
			}
			
		}