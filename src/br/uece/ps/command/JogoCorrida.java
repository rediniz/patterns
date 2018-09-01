package br.uece.ps.command;

public class JogoCorrida implements Jogo {

	@Override
	public void botaoA() {
		System.out.println("Botão A puxou o freio de mão.");
	}

	@Override
	public void botaoB() {
		System.out.println("Botão B acelerou.");
	}

}
