package Brinquedos;

public class BrinquedoEducativo extends Produto{
// Atributos
	
	private String desenvolvimentoAtipico;
	private int faixaEtariaRecomendada;
	private int categoria;

	
// M�todos Especiais (construtor):
	
	public BrinquedoEducativo(String nomeProduto, String especifica��oBrinquedo, Float preco, String descricao,
		String desenvolvimentoAtipico, int faixaEtariaRecomendada, int categoria) {
		super(nomeProduto, especifica��oBrinquedo, preco, descricao);
		this.desenvolvimentoAtipico = desenvolvimentoAtipico;
		this.faixaEtariaRecomendada = faixaEtariaRecomendada;
		this.categoria = categoria;
}
// M�todos Acessores:

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
	
	public void cadastrarBrinquedoEducativo ( ) {
				
	}
	public void alterarDadosBrinquedoEducativo ( ) {
				
	}
	public void deletarBrinquedoEducativo( ) {
				
	}
	public void filtrarFaixaEt�riaBrinquedoEducativo ( ) {
				
	}
	public void filtrarCategoriaBrinquedoEducativo ( ) {
			
	}
}
