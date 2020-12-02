package br.com.praiasoft.escovandobits;

import java.util.BitSet;

public class RepresentacaoBits {
	public static void main(String[] args) {
		int inteiro = 123345678;
		display( inteiro );
		
		System.out.println();
		System.out.println(
				String.format("%32s", Integer.toBinaryString(inteiro)).replace(" ", "0"));
		
		BitSet b1 = new BitSet();
		b1.set(0);
		b1.set(1);
		b1.set(2);
		b1.set(3);
		b1.set(4);
		b1.set(5);
		b1.set(6);
//		b1.set(7);
		System.out.println(b1.toByteArray()[0]);
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
