package br.com.profsalu;

public class EscadaInvertida {

	public static void main(String[] args) {
		criarEscada(10);

	}
	
	public final static void criarEscada(int n){
		
		int tamEscada = n;
		
				
		for (int alturaAtual = 1; alturaAtual <= tamEscada; alturaAtual++) {
			for (int degrauPreenchido = 1; degrauPreenchido <= tamEscada; degrauPreenchido++) {
				if(tamEscada-alturaAtual >= degrauPreenchido )
					System.out.print(" ");
				else
					System.out.print("#");
			}
			
			System.out.println("");
		}
	}

}
