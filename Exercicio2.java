package ExRepeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
	
		Scanner leia = new Scanner(System.in);

		int x, soma = 0; 

				
		for (x= 1; x <= 500; x = x + 1){
		
			if (x % 2 != 0 && x % 3 == 0){
				soma = soma + x;
			}
		}
		
		System.out.println("A soma dos ímpares múltiplos de três de 1 até 500 é: " + soma + ".\n");		
		
	}

}