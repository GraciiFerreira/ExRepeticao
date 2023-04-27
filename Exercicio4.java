package ExRepeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n, c;
		
		System.out.println("Digite um numero: ");
		n = leia.nextInt();
		
		c=1;
		
		while(c<=100) {
			System.out.println(c*n +"\n");
			
			c = c*3;
		}

	}

}
