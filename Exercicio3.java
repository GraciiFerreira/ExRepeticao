package ExRepeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
				int cont = 0, soma = 0, y = 0, media = 0, total = 0;

			
				System.out.println("Digite um valor: ");
				y = leia.nextInt();

				while (y >= 0){

					soma = soma + y;
					cont = cont + 1;

					System.out.println("Digite um número negativo para encerrar o programa: ");
					y = leia.nextInt();
							
				}
				if (cont >= 0){
					media = soma / cont;
					total = cont;
						
					System.out.println("O total dos valores é: " + soma);
					System.out.println("A media doos valores é: " + media);
					System.out.println("O total de valores é: " + total);
				}
			
					
			}		

	}



