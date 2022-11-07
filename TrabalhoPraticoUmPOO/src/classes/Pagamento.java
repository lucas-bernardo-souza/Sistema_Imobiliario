package classes;

public abstract class Pagamento {
	private String tipoPagamento;

	public Pagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	@Override
	public String toString() {
		return "Pagamento [tipoPagamento=" + tipoPagamento + ", getTipoPagamento()=" + getTipoPagamento()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
