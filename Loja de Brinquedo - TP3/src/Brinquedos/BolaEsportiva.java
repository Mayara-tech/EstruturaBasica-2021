package Brinquedos;

public class BolaEsportiva extends Produto {
// Atributos
	
	private String marca;
	private String modelo;
	
// Métodos Especiais (construtor):
	
	public BolaEsportiva(String nomeProduto, String especificaçãoBrinquedo, Float preco, String descricao, String marca,
		String modelo) {
		super(nomeProduto, especificaçãoBrinquedo, preco, descricao);
		this.marca = marca;
		this.modelo = modelo;
	}
// Métodos Acessores:
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
// Métodos Personalizados:
	
	public void cadastrarBola () {
		System.out.println(" ------------------ BEM VINDOS A TOYS UNION ---------------------- \n " );
		System.out.println(" \n BRINQUEDOS TOYS UNION \n");
		System.out.println(" Nome do Brinquedo: " + this.getNomeProduto()  );
		System.out.println(" Categoria: " + this.getEspecificaçãoBrinquedo() );
		System.out.println(" preço: R$" + this.getPreco());
		System.out.println(" Descrição: " + this.getDescricao() );
		System.out.println(" Marca:  " + this.getMarca() );
		System.out.println(" Modelo " + this.getModelo() );
		
	}
	public void alterarDadoBola () {
		
	}
	public void deletarBola ( ) {
		
	}
	public void filtrarModeloBola( ) {
		
	}
}
