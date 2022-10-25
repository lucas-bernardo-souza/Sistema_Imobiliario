package classes;

import java.time.LocalDate;

public class Comercial extends Imovel{
	protected float taxaImpostoFederal;

	public Comercial(int codigoImovel, String endereco, LocalDate dataConstrucao, float areaTotal, float areaConstruida,
			int qtdDormitorios, int qtdBanheiros, int qtdVagasGaragem, float valorIptu, float valorVenda,
			float valorAluguel, float taxaImpostoFederal) {
		super(codigoImovel, endereco, dataConstrucao, areaTotal, areaConstruida, qtdDormitorios, qtdBanheiros, qtdVagasGaragem,
				valorIptu, valorVenda, valorAluguel);
		this.taxaImpostoFederal = taxaImpostoFederal;
	}

	public float getTaxaImpostoFederal() {
		return taxaImpostoFederal;
	}

	public void setTaxaImpostoFederal(float taxaImpostoFederal) {
		this.taxaImpostoFederal = taxaImpostoFederal;
	}

	@Override
	public String toString() {
		super.toString();
		return "Comercial [taxaImpostoFederal=" + taxaImpostoFederal + "]";
	}
	
}
