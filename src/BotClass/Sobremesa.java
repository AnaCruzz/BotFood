package BotClass;

public class Sobremesa {
	//atributos
	public String nomeSobremesa;
	public String descri�ao;
	public int quantidade;
	public double pre�o;
	
	//construtor
	public Sobremesa(String nomeSobremesa, String descri�ao, double pre�o) {
		super();
		this.nomeSobremesa = nomeSobremesa;
		this.descri�ao = descri�ao;
		this.pre�o = pre�o;
		
	}
	//getters and setters


	public String getNomeSobremesa() {
		return nomeSobremesa;
	}


	public void setNomeSobremesa(String nomeSobremesa) {
		this.nomeSobremesa = nomeSobremesa;
	}


	public String getDescri�ao() {
		return descri�ao;
	}


	public void setDescri�ao(String descri�ao) {
		this.descri�ao = descri�ao;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public double getPre�o() {
		return pre�o;
	}


	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
	

	


	
}
