package ExRepeticao;

public class Exercicio5 {

	public static void main(String[] args) {
		

		int numero = 233;

		
		do {
			if (numero >= 300 && numero <= 400){

				numero += 3;

				System.out.print(numero);
				System.out.print(" somando de 3 em 3\n");
						
			}else{

				numero += 5;

				System.out.print(numero);
				System.out.print(" somando de 5 em 5\n");
			}

		}while (numero <= 456);		
		
		
	}

}
