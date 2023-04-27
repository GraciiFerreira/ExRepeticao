package ExRepeticao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int filhos=0, habitantes=3; 
		float salario, mediaSalario=0, totalSalario=0, mediaFilhos=0, 
				totalFilhos=0, maiorSalario=0, salario100=0, ate100=0;
		
		for(int x=0; x<habitantes; x++) {
			
			System.out.println("Digite seu salario: ");
			salario = leia.nextFloat();
			
			System.out.println("Digite quantos filhos você tem: ");
			filhos = leia.nextInt();
			
			totalSalario= totalSalario + salario;
			totalFilhos = totalFilhos + filhos;
				if(salario>maiorSalario) {
					maiorSalario=salario;
				}
				if(salario<=100) {
					salario100++;
				}
		}
		mediaSalario= totalSalario/3;
		mediaFilhos= totalFilhos/3;
		ate100= (salario100/3)*100;
		
		System.out.println("A média do salario é: " + mediaSalario);
		System.out.println("A média de filhos é: " + mediaFilhos);
		System.out.println("O maior salario é: " + maiorSalario);
		System.out.println("Percentual até 100: " + ate100);
	}

}
