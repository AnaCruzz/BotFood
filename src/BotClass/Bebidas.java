package BotClass;

public class Bebidas {
	
		
		public String Marca; 
		public String descri��o;
	    public int quantidade;
	    public double pre�o;
		public Bebidas(String marca, String descri��o, double pre�o ) {
			super();
			this.Marca = marca;
			this.descri��o = descri��o;
			this.pre�o = pre�o;
		}
		public String getMarca() {
			return Marca;
		}
		public void setMarca(String marca) {
			Marca = marca;
		}
		public String getDescri��o() {
			return descri��o;
		}
		public void setDescri��o(String descri��o) {
			this.descri��o = descri��o;
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