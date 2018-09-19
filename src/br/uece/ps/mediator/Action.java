package br.uece.ps.mediator;

public enum Action {
	SEND_PAPER("enviou um trabalho", "recebeu um trabalho"), SEND_MESSAGE("enviou uma mensagem", "recebeu uma mensagem");

		  private String title;
		  private String description;

		  Action(String title, String description) {
		    this.title = title;
		    this.description = description;
		  }

		  public String getDescription() {
		    return description;
		  }

		  public String toString() {
		    return title;
		  }
}
