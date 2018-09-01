package br.uece.ps.factorymethod;

public class VisualizadorJPG implements Visualizador {

	@Override
	public Imagem criarImagem() {
		return new ImagemJPG();
	}

}
