package br.com.entra21.elseif;

public class Main {

	public static void main(String[] args) {
		System.out.println("Aprendendo sobre lese if (ou seja renovando o if antes do else)");
		
		float altura=1.7f;
		double dinheiro=1000f;
		
		if(altura<1.5) {// é baixinho ?
			System.out.println("é bem baixinho");
			
		}else if(altura<=1.9f ) {//é alto
			System.out.println("é alto");
		}else {
			//mesmo que eu não queira fazer nada aqui, é uma boa prática ter o else
		}
		
		//se até 1200, até 1800, até 2000, qualquer valor acima
		byte pontos;
		if (dinheiro <1200) {
			System.out.println("salário minimo");
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
		
		System.out.println("sua pontuação " +  pontos);
		
		
		
		
	}

}
