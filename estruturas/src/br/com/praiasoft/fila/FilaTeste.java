package br.com.praiasoft.fila;

public class FilaTeste {

	public static void main(String[] args) {
		var fila = new Fila();
		
		fila.adicionar("1-um");
		fila.adicionar("2-dois");
		fila.adicionar("3-três");
		fila.adicionar("4-quatro");
		fila.adicionar("5-cinco");
		
		fila.imprime();
		
		System.out.println("----------");
		
		fila.retirar();
		fila.retirar();
		
		fila.imprime();
	}
}
