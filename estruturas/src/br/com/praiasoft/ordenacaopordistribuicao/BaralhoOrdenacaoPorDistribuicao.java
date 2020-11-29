package br.com.praiasoft.ordenacaopordistribuicao;

public class BaralhoOrdenacaoPorDistribuicao {
	
	private static final int NAIPE = 4;
	private static final int NUMERO = 13;
	private static final int MAX_NUM_DE_CARTAS = 52;

	public static void main(String[] args) {
		
		var pilha = new PilhaCarta(); 
		var pilhaOrdenada = new PilhaCarta();
		
		for(int w = 0; w < MAX_NUM_DE_CARTAS; w++) {
			var carta = new Carta();
			pilha.adicionar(carta);
		}
		
		pilha.imprime("Cartas embaralhadas");
	
		PilhaCarta pilhasPorNumero[] = new PilhaCarta[13];
		for(int w=0; w < NUMERO; w++) {
			pilhasPorNumero[w] = new PilhaCarta();
		}
		
		for(int i = 0; i < MAX_NUM_DE_CARTAS; i++) {
			var carta = pilha.retirar();
			var pilhaSelecionada = pilhasPorNumero[ carta.getNumero() ];
			pilhaSelecionada.adicionar(carta);
		}
		
		PilhaCarta pilhasPorNaipe[] = new PilhaCarta[4];
		for(int w=0; w < NAIPE; w++) {
			pilhasPorNaipe[w] = new PilhaCarta();
		}		
		
		System.out.println("-----------------------------------------");
		for(int x=0; x < NUMERO; x++) {
			pilhasPorNumero[x].imprime("pilha de cartas por número:" + Carta.porNumero(x));
			while (!pilhasPorNumero[x].vazia()) {
				var carta = pilhasPorNumero[x].retirar();
				pilhasPorNaipe[ carta.getNaipe() ].adicionar(carta);
			}
		}

		System.out.println("-----------------------------------------");
		for(int y=0; y < NAIPE; y++) {
			pilhasPorNaipe[y].imprime("pilha de cartas por naipe:" + Carta.porNaipe(y));
			while(!pilhasPorNaipe[y].vazia()) {
				var carta = pilhasPorNaipe[y].retirar();
				pilhaOrdenada.adicionar(carta);
			}
		}
		
		System.out.println("-----------------------------------------");
		
		pilhaOrdenada.imprime("Baralho ordenado com cartas repetidas: ");
		
		pilhaOrdenada.eliminaCartasRepetidas();
		
		pilhaOrdenada.imprime("Resultado baralho ordenado sem cartas repetidas: ");
	}

}
