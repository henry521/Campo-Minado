package henriquecm;

import henriquecm.modelo.Tabuleiro;
import henriquecm.modelo.TabuleiroConsole;

public class Aplicacao {

	
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		
		new TabuleiroConsole(tabuleiro);
	}
	
	
}
