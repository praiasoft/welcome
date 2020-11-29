package br.com.praiasoft.pilha;

public class NoPilha {
	
	private NoPilha anterior;
	
	private String valor;

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public NoPilha getAnterior() {
		return anterior;
	}

	public void setAnterior(NoPilha anterior) {
		this.anterior = anterior;
	}
	
}
