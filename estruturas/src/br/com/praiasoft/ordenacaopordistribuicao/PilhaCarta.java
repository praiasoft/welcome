package br.com.praiasoft.ordenacaopordistribuicao;

public class PilhaCarta {
	
	private NoPilhaCarta topo;
	
	public void adicionar( Carta carta ) {
		var no = new NoPilhaCarta();
		no.setCarta(carta);
		no.setAnterior(topo);
		topo = no;
	}
	
	private void imprime( NoPilhaCarta no ) {
		if( no != null ) {
			imprime( no.getAnterior() );
			no.getCarta().imprime();
			if( no != topo )
				System.out.print(", ");
		}
	}
	
	public void imprime( String msg ) {
		if(topo != null ) {
			System.out.println(msg);
			imprime(topo);
			System.out.println();
		}
	}
	
	public Carta retirar() {
		if(topo != null) {
			var no = topo;
			var carta = no.getCarta();
			topo = topo.getAnterior();
			no = null;
			return carta;
		}
		return null;
	}
	
	public boolean vazia() {
		return topo == null;
	}
	
	private void eliminaCartasRepetidas( NoPilhaCarta no ) {
		if( no != null  ) {
			eliminaCartasRepetidas(no.getAnterior());
			
			var anterior = no.getAnterior();
			if( anterior != null  ) {
				if ( no.equals(anterior) ) {
					no.setAnterior(anterior.getAnterior());
					anterior = null;
				}
			}
		}
	}
	
	public void eliminaCartasRepetidas() {
		eliminaCartasRepetidas( topo );
	}
	
}
