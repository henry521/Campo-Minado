package henriquecm.visao;

import java.awt.GridLayout;

import javax.swing.JPanel;

import henriquecm.modelo.Tabuleiro;

public class PainelTabuleiro extends JPanel {

	
	public PainelTabuleiro(Tabuleiro tabuleiro) {
		
		// Criando nova grid pegando o numero de linhas e colunas do tabuleiro criado
		setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));
		
		
		tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c)));
		
		tabuleiro.registrarObservador(e -> {
			// TODO mostrar resultado para o usuario 
			
			tabuleiro.reiniciar();
		});
		
		
		}
	}

