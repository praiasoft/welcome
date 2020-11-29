package br.com.praiasoft.pilha;

public class Pilha {
	
	private NoPilha topo;

	public Pilha() {
		super();
	}
	
	public void adicionar( String valor ) {
		var no = new NoPilha();
		no.setValor(valor);
		no.setAnterior(topo);
		topo = no;
	}
	
	private void imprime( NoPilha no ) {
		if( no != null ) {
			imprime(no.getAnterior());
			System.out.println( no.getValor() );
		}
	}
	
	public void imprime() {
		imprime(topo);
	}
	
	public String retirar() {
		if(topo != null) {
			var no = topo;
			var valor = no.getValor();
			topo = topo.getAnterior();
			no = null;
			return valor;
		}
		return null;
	}
}
