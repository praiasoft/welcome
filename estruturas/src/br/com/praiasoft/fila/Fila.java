package br.com.praiasoft.fila;

public class Fila {
	
	private NoFila primeiro;
	private NoFila ultimo;
	
	public Fila() {
		super();
		primeiro = new NoFila();
		ultimo = primeiro;
	}

	public void adicionar( String valor ) {
		ultimo.setValor(valor);
		ultimo.setProximo( new NoFila() );
		ultimo = ultimo.getProximo();
	}
	
	public String retirar() {
		var valor = primeiro.getValor();
		if( primeiro.getProximo() != null )
			primeiro = primeiro.getProximo();
		return valor;
	}
	
	private void imprime( NoFila no ) {
		if( no.getProximo() != null ) {
			System.out.println( no.getValor() );
			imprime(no.getProximo());
		}
	}
	
	public void imprime() {
		imprime(primeiro);
	}
}
