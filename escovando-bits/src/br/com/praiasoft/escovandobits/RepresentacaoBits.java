package br.com.praiasoft.escovandobits;

public class RepresentacaoBits {
	public static void main(String[] args) {
		display(123345678);
	}

	public static void display(int value) {
		System.out.printf("\nBit representation of %d is: \n", value);

		int displayMask = 1 << 31;

		for (int bit = 1; bit <= 32; bit++) {
			System.out.print((value & displayMask) == 0 ? '0' : '1');

			value <<= 1;

			if (bit % 8 == 0)
				System.out.print(' '); 
		} 
	}
}
