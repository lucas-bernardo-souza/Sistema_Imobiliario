package classes;

import java.time.LocalDate;

public class Venda {
	private int codigoVenda;
	private Cliente cliente;
	private Corretor corretor;
	private Imovel imovel;
	private LocalDate dataVenda;
	private float valorTotalVenda;
	private Pagamento formaPagamento;
	
	public Venda(int codigoVenda, Cliente cliente, Corretor corretor, Imovel imovel, LocalDate dataVenda,
			float valorTotalVenda, Pagamento formaPagamento) {
		this.codigoVenda = codigoVenda;
		this.cliente = cliente;
		this.corretor = corretor;
		this.imovel = imovel;
		this.dataVenda = dataVenda;
		this.valorTotalVenda = valorTotalVenda;
		this.formaPagamento = formaPagamento;
	}
	
	
}
