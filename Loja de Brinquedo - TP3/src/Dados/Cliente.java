package Dados;

public class Cliente extends Pessoa  {

	// Atributos 

	private String email;
	private String dataNascimento;
	

    // Métodos Especiais (construtor):
	
	public Cliente(String nome, int numeroIdentidade, int cpf, Endereco endereco, Telefone telefone, String email,
			String dataNascimento) {
		super(nome, numeroIdentidade, cpf, endereco, telefone);
		this.email = email;
		this.dataNascimento = dataNascimento;
	}
	
	// Métodos Acessores:

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	// Métodos Personalizados:

	public void cadastrarCliente () {

	}
	public void buscarCliente ( ) {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Numero da Identidade " + this.getNumeroIdentidade());
		System.out.println("CPF "+ this.getCpf());
		System.out.println( "email " + this.getEmail());
		System.out.println( "data de nascimento" + this.getDataNascimento());
		
	}
	public void alterarDadosCliente ( ) {

	}
	public void deletarCliente ( ) {

	}

}
