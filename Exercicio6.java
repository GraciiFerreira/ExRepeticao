package ExRepeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero=0, resultado=0;
		
		System.out.println("Digite um numero: ");
		numero = leia.nextInt();
		
		do {
			
			resultado= resultado + numero;
			numero = numero - 1;
		}while(numero>=0);
		
		System.out.println("Esse é o resultado: "+resultado);
			
			

	}

}
