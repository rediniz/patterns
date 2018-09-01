package br.uece.ps.factorymethod;

public class ImagemBPM implements Imagem {

	@Override
	public void carregar() {
		System.out.println("Carregando imagem BPM...");
	}

	@Override
	public void exibir() {
		System.out.println("Exibindo imagem BPM...");
	}

	@Override
	public void fechar() {
		System.out.println("Fechando imagem BPM...");
	}

}
