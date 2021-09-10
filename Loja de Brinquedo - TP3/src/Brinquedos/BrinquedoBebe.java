package Brinquedos;

public class BrinquedoBebe extends Produto {
// Atributos 
	
	private String marca;
	private String desenvolvimentoAtipico;
	private int faixaEtariaRecomendada;
	private int categoria;
	
// M�todos Especiais (construtor):
	
	public BrinquedoBebe(String nomeProduto, String especifica��oBrinquedo, Float preco, String descricao, String marca,
		String desenvolvimentoAtipico, int faixaEtariaRecomendada, int categoria) {
		super(nomeProduto, especifica��oBrinquedo, preco, descricao);
		this.marca = marca;
		this.desenvolvimentoAtipico = desenvolvimentoAtipico;
		this.faixaEtariaRecomendada = faixaEtariaRecomendada;
		this.categoria = categoria;
}
// M�todos Acessores: 
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDesenvolvimentoAtipico() {
		return desenvolvimentoAtipico;
	}
	public void setDesenvolvimentoAtipico(String desenvolvimentoAtipico) {
		this.desenvolvimentoAtipico = desenvolvimentoAtipico;
	}
	public int getFaixaEtariaRecomendada() {
		return faixaEtariaRecomendada;
	}
	public void setFaixaEtariaRecomendada(int faixaEtariaRecomendada) {
		this.faixaEtariaRecomendada = faixaEtariaRecomendada;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
// M�todos Personalizados:

	public void cadastrarBrinquedoBebe ( ) {
					
	}
	public void alterarDadosBrinquedoBebe ( ) {
					
	}
	public void deletarBrinquedoBebe( ) {
					
	}
	public void filtrarFaixaEt�riaBrinquedoBebe ( ) {
					
	}
	public void filtrarCategoriaBrinquedoBebe ( ) {
				
	}
}
