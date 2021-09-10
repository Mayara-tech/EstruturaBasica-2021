package Brinquedos;

public class Boneco extends Produto {
// Atributos
	
	private String material;
	private int faixaEtariaRecomendada;
	private int categoria;
	
// M�todos Especiais (construtor):
	
	public Boneco(String nomeProduto, String especifica��oBrinquedo, Float preco, String descricao, String material,
			int faixaEtariaRecomendada, int categoria) {
		super(nomeProduto, especifica��oBrinquedo, preco, descricao);
		this.material = material;
		this.faixaEtariaRecomendada = faixaEtariaRecomendada;
		this.categoria = categoria;
}
// M�todos Acessores:
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
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
	
	public void cadastrarBoneco ( ) {
			
	}
	public void alterarDadosBoneco ( ) {
			
	}
	public void deletarBoneco( ) {
			
	}
	public void filtrarFaixaEt�riaBoneco ( ) {
			
	}
	public void filtrarCategoriaBoneco ( ) {
			
	}
}