package exercicio02;

public class Passageiro {
	private Pessoa pessoa;
	private int numeroSmiles;
	
	public Passageiro (Pessoa pessoa, int numeroSmiles) {
		this.pessoa = pessoa;
		this.numeroSmiles = numeroSmiles;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public int getNumeroSmiles() {
		return numeroSmiles;
	}
	public void setNumeroSmiles(int numeroSmiles) {
		this.numeroSmiles = numeroSmiles;
	}
	
	

}
