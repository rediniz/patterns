package br.uece.ps.factorymethod;

public class ImagemJPG implements Imagem {

	@Override
	public void carregar() {
		System.out.println("Carregando imagem JPG...");
	}

	@Override
	public void exibir() {
		System.out.println("Exibindo imagem JPG...");
	}

	@Override
	public void fechar() {
		System.out.println("Fechando imagem JPG...");
	}

}
