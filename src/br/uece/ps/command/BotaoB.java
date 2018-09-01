package br.uece.ps.command;

public class BotaoB implements Comando {

	@Override
	public void execute(Jogo jogo) {
		jogo.botaoB();
	}

}
