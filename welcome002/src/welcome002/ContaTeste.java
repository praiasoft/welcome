package welcome002;

import java.util.Scanner;

public class ContaTeste {
	
	private static class Conta {
		
		private int numero;
		private double saldo;

		public Conta(int numero, double saldo) {
			super();
			
			this.numero = numero;
			
			if( saldo > 0.0 ) {
				this.saldo = saldo;
			}
		}
		
		public void credito( double montante ) {
			this.saldo += montante;
		}

		public double getSaldo() {
			return saldo;
		}
		
		public void imprime() {
			System.out.printf( "conta %d saldo: R$ %.2f\n", numero, saldo );
		}
	}

	public static void main(String[] args) {
		
		var conta1 = new Conta(1, 100.55 );
		var conta2 = new Conta(2, 1233.45);
		
		conta1.imprime();
		conta2.imprime();
		
		try( var entrada = new Scanner(System.in) )
		{
			System.out.println("Entre valor de depósito para a conta 1: ");
			double valorDeposito = entrada.nextDouble();
			
			System.out.printf("Adicionando %.2f para o saldo da conta 1\n\n", valorDeposito);
			conta1.credito(valorDeposito);
			
			conta1.imprime(); conta2.imprime();
			
			System.out.println("Entre valor de depósito para a conta 2: ");
			double valorDeposito2 = entrada.nextDouble();
			
			System.out.printf("Adicionando %.2f para o saldo da conta 2\n\n", valorDeposito2);
			conta2.credito(valorDeposito2);
			
			conta1.imprime(); conta2.imprime();
		}
	}

}
