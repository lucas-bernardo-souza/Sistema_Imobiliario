package classes;

import java.time.LocalDate;

public class CasaResidencial extends Imovel{

	public CasaResidencial(int codigoImovel, String endereco, LocalDate dataConstrucao, float areaTotal,
			float areaConstruida, int qtdDormitorios, int qtdBanheiros, int qtdVagasGaragem, float valorIptu,
			float valorVenda, float valorAluguel) {
		super(codigoImovel, endereco, dataConstrucao, areaTotal, areaConstruida, qtdDormitorios, qtdBanheiros, qtdVagasGaragem,
				valorIptu, valorVenda, valorAluguel);
	}

	@Override
	public String toString() {
		super.toString();
		return "CasaResidencial []";
	}
	
	
	
}
