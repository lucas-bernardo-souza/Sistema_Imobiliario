package classes;

public class Dinheiro extends Pagamento{
	
	public Dinheiro(String tipoPagamento) {
		super(tipoPagamento);
	}

	@Override
	public String toString() {
		return "Dinheiro [getTipoPagamento()=" + getTipoPagamento() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
