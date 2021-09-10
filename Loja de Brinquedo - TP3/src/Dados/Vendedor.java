package Dados;

public class Vendedor extends Pessoa{
// Atributos 
	
	private String codigoLoja;
	private String dataContrata��o;
	private String cargo;

	
// M�todos Especiais (construtor):
	
	public Vendedor(String nome, int numeroIdentidade, int cpf, Endereco endereco, Telefone telefone, String codigoLoja,
			String dataContrata��o, String cargo) {
		super(nome, numeroIdentidade, cpf, endereco, telefone);
		this.codigoLoja = codigoLoja;
		this.dataContrata��o = dataContrata��o;
		this.cargo = cargo;
	}
	
// M�todos Acessores:

	public String getCodigoLoja() {
		return codigoLoja;
	}
	public void setCodigoLoja(String codigoLoja) {
		this.codigoLoja = codigoLoja;
	}
	public String getDataContrata��o() {
		return dataContrata��o;
	}
	public void setDataContrata��o(String dataContrata��o) {
		this.dataContrata��o = dataContrata��o;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

// M�todos Personalizados:
	
	public void cadastrarVendedor () {
		
	}
	public void buscarVendedor ( ) {
		
	}
	public void alterarDadosVendedor ( ) {
		
	}
	public void deletarVendedor ( ) {
		
	}

}
