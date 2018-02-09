
public class Invoice {
	private String numero;
	private String descricao;
	private int quantidade;
	private double preco;
	
	public Invoice(String numero, String descricao, int quantidade, double preco) {
		this.numero = numero;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	public double getInvoice() {
		if ((this.quantidade < 0) || (this.preco < 0)) {
			return 0;
		} else {
			return this.quantidade * this.preco;
		}
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
