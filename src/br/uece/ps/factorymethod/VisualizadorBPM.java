package br.uece.ps.factorymethod;

public class VisualizadorBPM implements Visualizador {

	@Override
	public Imagem criarImagem() {
		return new ImagemBPM();
	}

}
