package br.uece.ps.command;

public class BotaoA implements Comando {

	@Override
	public void execute(Jogo jogo) {
		jogo.botaoA();
	}

}
