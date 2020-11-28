package welcome002;

import java.util.Scanner;

public class Comparacao {

	public static void main(String[] args) {
		try( var entrada = new Scanner(System.in) )
		{
			int n1;
			int n2;
			
			System.out.println("Entre com o primeiro número inteiro: ");
			n1 = entrada.nextInt();
			
			System.out.println("Entre com o segundo número inteiro: ");
			n2 = entrada.nextInt();
			
			if(n1 == n2) System.out.printf("%d == %d\n", n1, n2);
			if(n1 != n2) System.out.printf("%d != %d\n", n1, n2);
			if(n1 <  n2) System.out.printf("%d <  %d\n", n1, n2);
			if(n1 >  n2) System.out.printf("%d >  %d\n", n1, n2);
			if(n1 <= n2) System.out.printf("%d <= %d\n", n1, n2);
			if(n1 >= n2) System.out.printf("%d >= %d\n", n1, n2);
		}
	}

}
