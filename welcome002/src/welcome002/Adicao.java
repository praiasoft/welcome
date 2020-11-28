package welcome002;

import java.util.Scanner;

public class Adicao {

	public static void main(String[] args) {
		try (var entrada = new Scanner(System.in)) 
		{
			int n1, n2, soma;
			
			System.out.println("Entre com o primento número: ");
			n1 = entrada.nextInt();
			
			System.out.println("Entre com o segundo número: ");
			n2 = entrada.nextInt();
			
			soma = n1 + n2;
			System.out.printf("A soma é: %d\n", soma);
		}
	}

}
