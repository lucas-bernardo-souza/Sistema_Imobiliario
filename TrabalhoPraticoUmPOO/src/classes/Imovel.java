package classes;

import java.time.LocalDate;

public abstract class Imovel {
	protected int codigoImovel;
	protected String endereco;
	protected LocalDate dataConstrucao;
	protected float areaTotal;
	protected float areaConstruida;
	protected int qtdDormitorios;
	protected int qtdBanheiros;
	protected int qtdVagasGaragem;
	protected float valorIptu;
	protected float valorVenda;
	protected float valorAluguel;
	
	public Imovel(int codigoImovel, String endereco, LocalDate dataConstrucao, float areaTotal,
			float areaConstruida, int qtdDormitorios, int qtdBanheiros, int qtdVagasGaragem,
			float valorIptu, float valorVenda, float valorAluguel) {
		this.codigoImovel = codigoImovel;
		this.endereco = endereco;
		this.dataConstrucao = dataConstrucao;
		this.areaTotal = areaTotal;
		this.areaConstruida = areaConstruida;
		this.qtdDormitorios = qtdDormitorios;
		this.qtdBanheiros = qtdBanheiros;
		this.qtdVagasGaragem = qtdVagasGaragem;
		this.valorIptu = valorIptu;
		this.valorAluguel = valorAluguel;
		this.valorVenda = valorVenda;
	}

	public int getCodigoImovel() {
		return codigoImovel;
	}

	public void setCodigoImovel(int codigoImovel) {
		this.codigoImovel = codigoImovel;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public LocalDate getDataConstrucao() {
		return dataConstrucao;
	}

	public void setDataConstrucao(LocalDate dataConstrucao) {
		this.dataConstrucao = dataConstrucao;
	}

	public float getAreaTotal() {
		return areaTotal;
	}

	public void setAreaTotal(float areaTotal) {
		this.areaTotal = areaTotal;
	}

	public float getAreaConstruida() {
		return areaConstruida;
	}

	public void setAreaConstruida(float areaConstruida) {
		this.areaConstruida = areaConstruida;
	}

	public int getQtdDormitorios() {
		return qtdDormitorios;
	}

	public void setQtdDormitorios(int qtdDormitorios) {
		this.qtdDormitorios = qtdDormitorios;
	}

	public int getQtdBanheiros() {
		return qtdBanheiros;
	}

	public void setQtdBanheiros(int qtdBanheiros) {
		this.qtdBanheiros = qtdBanheiros;
	}

	public int getQtdVagasGaragem() {
		return qtdVagasGaragem;
	}

	public void setQtdVagasGaragem(int qtdVagasGaragem) {
		this.qtdVagasGaragem = qtdVagasGaragem;
	}

	public float getValorIptu() {
		return valorIptu;
	}

	public void setValorIptu(float valorIptu) {
		this.valorIptu = valorIptu;
	}

	public float getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}

	public float getValorAluguel() {
		return valorAluguel;
	}

	public void setValorAluguel(float valorAluguel) {
		this.valorAluguel = valorAluguel;
	}

	@Override
	public String toString() {
		return "Imovel [codigoImovel=" + codigoImovel + ", endereco=" + endereco + ", dataConstrucao=" + dataConstrucao
				+ ", areaTotal=" + areaTotal + ", areaConstruida=" + areaConstruida + ", qtdDormitorios="
				+ qtdDormitorios + ", qtdBanheiros=" + qtdBanheiros + ", qtdVagasGaragem=" + qtdVagasGaragem
				+ ", valorIptu=" + valorIptu + ", valorVenda=" + valorVenda + ", valorAluguel=" + valorAluguel + "]";
	}
}
