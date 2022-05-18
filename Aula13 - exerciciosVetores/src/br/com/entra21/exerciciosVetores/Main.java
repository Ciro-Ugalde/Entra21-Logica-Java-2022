package br.com.entra21.exerciciosVetores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner inPut = new Scanner(System.in);
		byte option;

		do {
			System.out.println(escreverMenu());

			option = inPut.nextByte();

			switch (option) {
			case 0:
				System.out.println("Sair");
				break;

			case 1:
				exibirTamanhoVetores();
				break;

			case 2:
				exibirTamanhoVetoresInicializados();
				break;

			case 3:
				vetorCom5ParaInicializar();
				break;

			case 4:
				definirTamanhoVetorparaInicializar();
				break;

			case 5:
				percorrerVetorInicializadoCrescenteDecrescente();// chamada de m�todo
				break;

			case 6:
				exibirVetorNaoInicializado();
				break;

			default:
				break;
			}
			// Caso a condi��o de perman�ncia seja true, repita o bloco
		} while (option != 0);// Enquanto n�o for 0, repita.

	}

	public static void exibirTamanhoVetores() {

		byte vetorBytes[] = new byte[1];
		short vetorShorts[] = new short[2];
		int vetorInts[] = new int[3];
		long vetorLongs[] = new long[4];
		char vetorChars[] = new char[5];
		float vetorFloats[] = new float[6];
		double vetorDoubles[] = new double[7];
		boolean vetorBooleans[] = new boolean[8];

		System.out.println("vetorBytes tamanho = " + vetorBytes.length);
		System.out.println("vetorShorts tamanho = " + vetorShorts.length);
		System.out.println("vetorInts tamanho = " + vetorInts.length);
		System.out.println("vetorLongs tamanho = " + vetorLongs.length);
		System.out.println("vetorChars tamanho = " + vetorChars.length);
		System.out.println("vetorFloats tamanho = " + vetorFloats.length);
		System.out.println("vetorDoubles tamanho = " + vetorDoubles.length);
		System.out.println("vetorBooleans tamanho = " + vetorBooleans.length);

	}

	public static void exibirTamanhoVetoresInicializados() {

		byte vetorBytes[] = { 5, 7, 9, 10 };
		short vetorShorts[] = { 130, 157, 171, 196 };
		int vetorInts[] = { 1001, 1203, 1427 };
		long vetorLongs[] = { 330000, 220000, 110000 };
		float vetorFloats[] = { 5000.50f, 15000.50f, 25000.25f };
		double vetorDoubles[] = { 150000.352d, 436000.35325d };
		char vetorChars[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
		boolean vetorBooleans[] = { true, false, false, true };

		System.out.println("vetorBytes tamanho = " + vetorBytes.length);
		System.out.println("vetorShorts tamanho = " + vetorShorts.length);
		System.out.println("vetorInts tamanho = " + vetorInts.length);
		System.out.println("vetorLongs tamanho = " + vetorLongs.length);
		System.out.println("vetorFloats tamanho = " + vetorFloats.length);
		System.out.println("vetorDoubles tamanho = " + vetorDoubles.length);
		System.out.println("vetorChars tamanho = " + vetorChars.length);
		System.out.println("vetorBooleans tamanho = " + vetorBooleans.length);

	}

	public static void vetorCom5ParaInicializar() {

		byte vetorBytes[] = new byte[5];
		Scanner input = new Scanner(System.in);

		for (byte contador = 0; contador < vetorBytes.length; contador++) {
			System.out.println("Inicializando a posi��o " + (contador + 1) + " No �ndice " + contador);
			vetorBytes[contador] = input.nextByte();
		}
	}

	public static void definirTamanhoVetorparaInicializar() {

		Scanner entrada = new Scanner(System.in);

		byte tamanho;
		byte vetorBytes[];

		System.out.println("Informe o tamanho do vetor");
		tamanho = entrada.nextByte();

		vetorBytes = new byte[tamanho];

		for (byte contador = 0; contador < vetorBytes.length; contador++) {

			System.out.println("Informe o valor para o intem " + (contador + 1) + " no �ndice [" + contador + "]");
			vetorBytes[contador] = entrada.nextByte();

		}
	}

	public static void percorrerVetorInicializadoCrescenteDecrescente() {

		byte vetorInt[] = { 11, 16, 33, 49 };
		for (byte contador = 0; contador < vetorInt.length; contador++) {
			System.out.println("vetorInt[contador]");

		}
		System.out.println("=======================================================");

		for (byte contador = (byte) (vetorInt.length - 1); contador >= 0; contador--) {
			// come�ando com o tamanho -1, porque o �ndice sempre tem um valor a menos
			// condi��o de perman�ncia, enquanto meu contador for maior do que 0,
			// pq comecei com valor alto e estou diminuindo
			// como uma repeti��o decrescente utilizo o decremento no contador
			System.out.println("vetorInt[contador]");
		}
	}

	public static void exibirVetorNaoInicializado() {

		byte vetorBytes[] = new byte[10];
		Scanner entrada = new Scanner(System.in);
		String resposta;
		byte index = 0;

		do {
			System.out.println("Infome um valor para o �ndice [" + index + "]");
			vetorBytes[index] = entrada.nextByte();

			System.out.println("Gostaria de inicializar outro �ndice?");
			resposta = entrada.next();

			if (resposta.equalsIgnoreCase("sim"))

				do {
					System.out.println("Informe um �ndice v�lido entre 0 e " + (vetorBytes.length - 1));
					index = entrada.nextByte();// Se o usu�rio digitar um valor v�lido esse index ser� usado no meu DO
												// principal, onde a l�gica se repete

				} while (index < 0 || index > vetorBytes.length);
			// A posi��o escolhida n�o pode ser menor do que 0 nem o tamanho do vetor ou
			// superior
			// Exemplo: 0 range v�lido e de 0 a 9, qualquer n�mero al�m disso fica preso
			// nesse loop

		} while (resposta.equalsIgnoreCase("sim"));

		for (byte contador = 0; contador < vetorBytes.length; contador++) {
			System.out.println("vetorBytes[" + contador + "] +vetorBytes[contador]");
		}

		System.out.println("");

	}

	public static String escreverMenu() {
		String menu = "Escolha uma op��o do menu de praticas\n";
		menu += "0 - sair\n";
		menu += "1 - Criar vetores para cada tipo primitivo e exibir o tamanho deles no console\n";
		menu += "2 - Criar vetores inicializados para cada tipo primitivo e exibir o tamanho deles no console\n";
		menu += "3 - Criar 1 vetor de 5 posi��es, para que o usu�rio alimente esses valores\n";
		menu += "4 - Criar um vetor com o tamanho informado pelo usu�rio e depois solicitar que o usu�rio informe os respectivos valores\n";
		menu += "5 - Criar um vetor de inteiros inicializado, para percorrer\\n\\tDo inicio ao fim\\n\\tDo fim ao inicio\\n\\tPara exibir os valore\n";
		menu += "6 - Criar um vetor de inteiros n�o inicializado\n";
		menu += "==============================================================";

		return menu;

	}
}