package br.com.entra21.elseif;

public class Main {

	public static void main(String[] args) {
		System.out.println("Aprendendo sobre lese if (ou seja renovando o if antes do else)");
		
		float altura=1.7f;
		double dinheiro=1000f;
		
		if(altura<1.5) {// � baixinho ?
			System.out.println("� bem baixinho");
			
		}else if(altura<=1.9f ) {//� alto
			System.out.println("� alto");
		}else {
			//mesmo que eu n�o queira fazer nada aqui, � uma boa pr�tica ter o else
		}
		
		//se at� 1200, at� 1800, at� 2000, qualquer valor acima
		byte pontos;
		if (dinheiro <1200) {
			System.out.println("sal�rio minimo");
			pontos=5;
		}else if(dinheiro<=1800) {
			System.out.println("ta ficando rico");
			pontos=8;
		}else if(dinheiro <2000) {
			System.out.println("me empresta :) ");
			pontos=12;
		}else {
			System.out.println("me contrata vai");
			pontos=13;
		}
		
		System.out.println("sua pontua��o " +  pontos);
		
		
		
		
	}

}
