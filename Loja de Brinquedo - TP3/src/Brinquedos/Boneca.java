package Brinquedos;

public class Boneca extends Produto {
// Atributos: 
	
	private String acessório;
	private int faixaEtariaRecomendada;
	private int categoria;
	
// Métodos Especiais (construtor):

	public Boneca(String nomeProduto, String especificaçãoBrinquedo, Float preco, String descricao, String acessório,
			int faixaEtariaRecomendada, int categoria) {
		super(nomeProduto, especificaçãoBrinquedo, preco, descricao);
		this.acessório = acessório;
		this.faixaEtariaRecomendada = faixaEtariaRecomendada;
		this.categoria = categoria;
}
// Métodos Acessores:
	
	public String getAcessório() {
		return acessório;
	}
	public void setAcessório(String acessório) {
		this.acessório = acessório;
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
	
	public void cadastrarBoneca ( ) {
		
	}
	public void alterarDadosBoneca ( ) {
		
	}
	public void deletarBoneca( ) {
		
	}
	public void filtrarFaixaEtáriaBoneca ( ) {
		
	}
	public void filtrarCategoriaBoneca ( ) {
		
	}

}
