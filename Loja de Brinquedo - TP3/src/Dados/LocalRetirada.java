package Dados;

public class LocalRetirada {
// Atributos 

	private int c�digoLoja;
	private Endereco endereco;
	
	
// M�todos Especiais (construtor):
	
	public LocalRetirada(int c�digoLoja, Endereco endereco) {
		this.c�digoLoja = c�digoLoja;
		this.endereco = endereco;
	}
	
// M�todos Acessores
	
	public int getC�digoLoja() {
		return c�digoLoja;
	}
	public void setC�digoLoja(int c�digoLoja) {
		this.c�digoLoja = c�digoLoja;
	}
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

// M�todos Personalizados:
	
	public void cadastrarLocalRetirada ( ) {
		
	}
	public void alterarLocalRetirada ( ) {
		
	}
	public void deletarLocalRetirada ( ) {
		
	}
}
