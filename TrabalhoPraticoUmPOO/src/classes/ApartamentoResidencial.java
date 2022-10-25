package classes;

import java.time.LocalDate;

public class ApartamentoResidencial extends Imovel{
	protected int andar;
	protected float valorCondominio;
	
	
	public ApartamentoResidencial(int codigoImovel, String endereco, LocalDate dataConstrucao, float areaTotal,
			float areaConstruida, int qtdDormitorios, int qtdBanheiros, int qtdVagasGaragem, float valorIptu,
			float valorVenda, float valorAluguel, int andar, float ValorCondominio) {
		super(codigoImovel, endereco, dataConstrucao, areaTotal, areaConstruida, qtdDormitorios, qtdBanheiros, qtdVagasGaragem,
				valorIptu, valorVenda, valorAluguel);
		this.andar = andar;
		this.valorCondominio = ValorCondominio;	
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

	public float getValorCondominio() {
		return valorCondominio;
	}

	public void setValorCondominio(float valorCondominio) {
		this.valorCondominio = valorCondominio;
	}

	@Override
	public String toString() {
		super.toString();
		return "ApartamentoResidencial [andar=" + andar + ", valorCondominio=" + valorCondominio + "]";
	}
		
}
