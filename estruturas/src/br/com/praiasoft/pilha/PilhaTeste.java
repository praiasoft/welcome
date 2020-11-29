package br.com.praiasoft.pilha;

public class PilhaTeste {

	public static void main(String[] args) {
		var pilha = new Pilha();
		
		pilha.adicionar("1-um");
		pilha.adicionar("2-dois");
		pilha.adicionar("3-três");
		pilha.adicionar("4-quatro");
		pilha.adicionar("5-cinco");
		
		pilha.imprime();
		
		System.out.println("----------");
		
		pilha.retirar();
		pilha.retirar();
		
		pilha.imprime();
	}
}
