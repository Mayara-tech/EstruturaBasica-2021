package Brinquedos;

public class Boneca extends Produto {
// Atributos: 
	
	private String acess�rio;
	private int faixaEtariaRecomendada;
	private int categoria;
	
// M�todos Especiais (construtor):

	public Boneca(String nomeProduto, String especifica��oBrinquedo, Float preco, String descricao, String acess�rio,
			int faixaEtariaRecomendada, int categoria) {
		super(nomeProduto, especifica��oBrinquedo, preco, descricao);
		this.acess�rio = acess�rio;
		this.faixaEtariaRecomendada = faixaEtariaRecomendada;
		this.categoria = categoria;
}
// M�todos Acessores:
	
	public String getAcess�rio() {
		return acess�rio;
	}
	public void setAcess�rio(String acess�rio) {
		this.acess�rio = acess�rio;
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
	
	public void cadastrarBoneca ( ) {
		
	}
	public void alterarDadosBoneca ( ) {
		
	}
	public void deletarBoneca( ) {
		
	}
	public void filtrarFaixaEt�riaBoneca ( ) {
		
	}
	public void filtrarCategoriaBoneca ( ) {
		
	}

}
