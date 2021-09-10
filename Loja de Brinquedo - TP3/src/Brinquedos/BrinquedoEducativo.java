package Brinquedos;

public class BrinquedoEducativo extends Produto{
// Atributos
	
	private String desenvolvimentoAtipico;
	private int faixaEtariaRecomendada;
	private int categoria;

	
// Métodos Especiais (construtor):
	
	public BrinquedoEducativo(String nomeProduto, String especificaçãoBrinquedo, Float preco, String descricao,
		String desenvolvimentoAtipico, int faixaEtariaRecomendada, int categoria) {
		super(nomeProduto, especificaçãoBrinquedo, preco, descricao);
		this.desenvolvimentoAtipico = desenvolvimentoAtipico;
		this.faixaEtariaRecomendada = faixaEtariaRecomendada;
		this.categoria = categoria;
}
// Métodos Acessores:

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
	
// Métodos Personalizados:
	
	public void cadastrarBrinquedoEducativo ( ) {
				
	}
	public void alterarDadosBrinquedoEducativo ( ) {
				
	}
	public void deletarBrinquedoEducativo( ) {
				
	}
	public void filtrarFaixaEtáriaBrinquedoEducativo ( ) {
				
	}
	public void filtrarCategoriaBrinquedoEducativo ( ) {
			
	}
}
