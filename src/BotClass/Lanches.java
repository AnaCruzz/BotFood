package BotClass;

public class Lanches {
	public String nomeLanche;
	public String descricao;
	public double preco;
	public int quantidade;
	
	public Lanches(String nomeLanche, String descricao, double preco) {
		super();
		this.nomeLanche = nomeLanche;
		this.descricao = descricao;
		this.preco = preco;
		
	}
	
	public String getNomeLanche() {
		return nomeLanche;
	}
	public void setNomeLanche(String nomeLanche) {
		this.nomeLanche = nomeLanche;
	}
	public String getDescri��o() {
		return descricao;
	}
	public void setDescri��o(String descri��o) {
		this.descricao = descri��o;
	}
	public double getPre�o() {
		return preco;
	}
	public void setPre�o(double pre�o) {
		this.preco = pre�o;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String toString() {
		return "Lanches [nomeLanche=" + nomeLanche + ", descricao=" + descricao + ", quantidade=" + quantidade
				+ ", preco=" + preco + "]";
	}
	
	
	
}
