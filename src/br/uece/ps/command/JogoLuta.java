package br.uece.ps.command;

public class JogoLuta implements Jogo {

	@Override
	public void botaoA() {
		System.out.println("Botão A deu um chute alto.");
	}

	@Override
	public void botaoB() {
		System.out.println("Botão B deu uma rasteira.");
	}

}
