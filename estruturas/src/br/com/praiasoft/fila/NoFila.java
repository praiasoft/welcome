package br.com.praiasoft.fila;

public class NoFila {
	
	private NoFila proximo;
	
	private String valor;

	public NoFila getProximo() {
		return proximo;
	}

	public void setProximo(NoFila proximo) {
		this.proximo = proximo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
}
