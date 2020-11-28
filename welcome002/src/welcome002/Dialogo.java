package welcome002;

import javax.swing.JOptionPane;

public class Dialogo {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Qual o seu nome?");
		
		JOptionPane.showMessageDialog(null, "Bem Vindo, " + nome );
	}

}
