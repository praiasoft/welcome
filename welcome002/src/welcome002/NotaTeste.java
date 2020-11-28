package welcome002;

import java.util.Scanner;

public class NotaTeste {

	private static class Nota {
		
		private String titulo;
		private String descricao;
		
		public Nota() {
			super();
		}
		
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		@Override
		public String toString() {
			return "Nota [titulo=" + titulo + ", descricao=" + descricao + "]";
		}
	}
	
	public static void main(String[] args) {
		
		
		try( var entrada = new Scanner( System.in ) )
		{
			var nota = new Nota();
			
			System.out.println("Entre com o titulo: ");
			nota.setTitulo( entrada.nextLine() );
			
			System.out.println("Entre com a descrição: ");
			nota.setDescricao( entrada.nextLine() );
			
			System.out.println(nota);
		}
		
	}

}
