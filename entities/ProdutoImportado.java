package entities;

public class ProdutoImportado extends Produto {
	
	private double taxaAlfandega;
	
	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, double preco, double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}
	
	public double getTaxaAlfandega() {
		
		return taxaAlfandega;
	}
	
	public void setTaxaAlfandega(double taxaAlfandega) {
		
		this.taxaAlfandega = taxaAlfandega;
	}
	
	public double totalPreco() {
		
		return super.getPreco() + taxaAlfandega;
	}
	
	
    @Override
	public String etiquetaPreco() {
		
		return super.getNome() 
				+ " $ " 
				+ String.format("%.2f", super.getPreco() + taxaAlfandega) 
				+ " (Taxa alfandegaria: $ " 
				+ String.format("%.2f", taxaAlfandega)
				+ ")";
	}
	

}
