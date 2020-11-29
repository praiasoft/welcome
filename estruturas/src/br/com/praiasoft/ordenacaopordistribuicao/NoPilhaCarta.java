package br.com.praiasoft.ordenacaopordistribuicao;

public class NoPilhaCarta {
	
	private NoPilhaCarta anterior;
	private Carta carta;
	
	public NoPilhaCarta getAnterior() {
		return anterior;
	}
	public void setAnterior(NoPilhaCarta anterior) {
		this.anterior = anterior;
	}
	public Carta getCarta() {
		return carta;
	}
	public void setCarta(Carta carta) {
		this.carta = carta;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carta == null) ? 0 : carta.hashCode());
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
		NoPilhaCarta other = (NoPilhaCarta) obj;
		if (carta == null) {
			if (other.carta != null)
				return false;
		} else if (!carta.equals(other.carta))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "NoPilhaCarta [carta=" + carta + "]";
	}
}
