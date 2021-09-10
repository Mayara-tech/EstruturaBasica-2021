package Dados;

public class LocalRetirada {
// Atributos 

	private int códigoLoja;
	private Endereco endereco;
	
	
// Métodos Especiais (construtor):
	
	public LocalRetirada(int códigoLoja, Endereco endereco) {
		this.códigoLoja = códigoLoja;
		this.endereco = endereco;
	}
	
// Métodos Acessores
	
	public int getCódigoLoja() {
		return códigoLoja;
	}
	public void setCódigoLoja(int códigoLoja) {
		this.códigoLoja = códigoLoja;
	}
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

// Métodos Personalizados:
	
	public void cadastrarLocalRetirada ( ) {
		
	}
	public void alterarLocalRetirada ( ) {
		
	}
	public void deletarLocalRetirada ( ) {
		
	}
}
