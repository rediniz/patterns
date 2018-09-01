package br.uece.ps.command;

public class JogoFutebol implements Jogo {

	@Override
	public void botaoA() {
		System.out.println("Botão A fez um cruzamento.");
	}

	@Override
	public void botaoB() {
		System.out.println("Botão B tocou a bola.");
	}

}
