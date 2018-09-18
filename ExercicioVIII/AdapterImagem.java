package Exercicio08;

public class AdapterImagem implements ImagemTarget{
	Imagem imagem ;
	@Override
	public void carregarImagem() {

	}

	@Override
	public void desenharImagem() {
		
	}

	@Override
	public void carregarImagem(String TipoImagem) {
		if (TipoImagem == "JPEG") {
			return carregarImagem().ImagemJPEG;
		}
		
		if (TipoImagem == "PNG") {
			return carregarImagem().ImagemPNG;
		}
		
		if (TipoImagem == "BMP") {
			return carregarImagem().ImagemBMP;
		}

	}
	
	
}
