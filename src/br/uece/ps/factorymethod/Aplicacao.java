package br.uece.ps.factorymethod;

public class Aplicacao {

	public static void main(String[] args) {
		Visualizador visualizador = new VisualizadorBPM();
		Imagem imagem = visualizador.criarImagem();
		imagem.carregar();
		imagem.exibir();
		imagem.fechar();

		visualizador = new VisualizadorJPG();
		imagem = visualizador.criarImagem();
		imagem.carregar();
		imagem.exibir();
		imagem.fechar();
	}

}
