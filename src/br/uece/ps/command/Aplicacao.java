package br.uece.ps.command;

public class Aplicacao {

	public static void main(String[] args) {
		Joystick joystick = new Joystick();
		Jogo jogo = new JogoLuta();
		
		System.out.println("Jogo de luta:");
		joystick.apertarBotao(new BotaoA(), jogo);
		
		jogo = new JogoFutebol();
		System.out.println("Jogo de futebol:");
		
		joystick.apertarBotao(new BotaoA(), jogo);
		
		jogo = new JogoCorrida();	
		System.out.println("Jogo de corrida:");
		
		joystick.apertarBotao(new BotaoB(), jogo);
		
		jogo = new JogoFutebol();
		System.out.println("Jogo de futebol:");
		
		joystick.apertarBotao(new BotaoB(), jogo);

	}

}
