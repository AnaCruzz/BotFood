package BotClass;

public class Lanches {
	public String nomeLanche;
	public String descri��o;
	public double pre�o;
	public int quantidade;
	
	public Lanches(String nomeLanche, String descri��o, double pre�o, int quantidade) {
		super();
		this.nomeLanche = nomeLanche;
		this.descri��o = descri��o;
		this.pre�o = pre�o;
		this.quantidade = quantidade;
	}
	
	public String getNomeLanche() {
		return nomeLanche;
	}
	public void setNomeLanche(String nomeLanche) {
		this.nomeLanche = nomeLanche;
	}
	public String getDescri��o() {
		return descri��o;
	}
	public void setDescri��o(String descri��o) {
		this.descri��o = descri��o;
	}
	public double getPre�o() {
		return pre�o;
	}
	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
}
