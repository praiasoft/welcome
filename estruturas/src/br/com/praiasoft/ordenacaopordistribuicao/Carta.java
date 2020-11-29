package br.com.praiasoft.ordenacaopordistribuicao;

import java.util.Random;

public class Carta {
	
	private int numero;
	private int naipe;
	
	public Carta() {
		super();
		numero = aleatorio(0,12);
		naipe = aleatorio(0, 3);
	}
	
    private static int aleatorio(int minimo, int maximo) {
        Random random = new Random();
        return random.nextInt((maximo - minimo) + 1) + minimo;
    }

    public void imprime() {
    	System.out.print(toString());
    }
    
    public static String porNumero( int num ) {
    	return switch (num) {
			case 0 -> "Ás";
			case 10 -> "Dama";
			case 11 -> "Valete";
			case 12 -> "Rei";
			default -> Integer.toString( num + 1 );
		};
    }
    
    public static String porNaipe( int num ) {
    	return switch (num) {
			case 0 -> "PAUS";
			case 1 -> "OURO";
			case 2 -> "COPAS";
			case 3 -> "ESPADA";
			default ->
				throw new IllegalArgumentException("Unexpected value: " + num);
		};
    }
    
	@Override
	public String toString() {
		String numeroStr = porNumero(numero);
		
		String naipeStr = porNaipe(naipe);

		return "["+numeroStr + ":" + naipeStr+"]";
	}

	public int getNumero() {
		return numero;
	}

	public int getNaipe() {
		return naipe;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + naipe;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		if (naipe != other.naipe)
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}

    
}
