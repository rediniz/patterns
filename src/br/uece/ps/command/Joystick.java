package br.uece.ps.command;

public class Joystick {
	
	public void apertarBotao(Comando comando, Jogo jogo) {
		comando.execute(jogo);
	}

}
