package models;

public class Carro {
	
	public static final String VERMELHA ="Vermelho", PRETA = "Preto", AZUL = "Azul", PRATA = "Prata";
	public static final String CHEVROLET = "Chevrolet", RENAULT ="Renault";
	
	private Integer quantidadePneus, anoFabricacao, quantidadePortas, quantidadeParafusosPneu, quantidadeCalotas;
	private String chassi, tipoCombustivel, cor, marca;
	
	public String getCor() {
		return cor;
	}


	public String getMarca() {
		return marca;
	}


	public Carro(Integer quantidadePneus, Integer quantidadePortas, String chassi,
			Integer anoFabricacao, String tipoCombustivel) {
		
		setQuantidadePneus(quantidadePneus);
		this.quantidadePortas = quantidadePortas;
		this.chassi = chassi;
		this.anoFabricacao = anoFabricacao;
		this.tipoCombustivel = tipoCombustivel;
	}
	
	
	public int getQuantidadePneus() {
		
		return quantidadePneus + 1;
		
	}
	
	
	
	public void setQuantidadePneus( Integer quantidadePneus){
		
		quantidadeCalotas = quantidadePneus;
		quantidadeParafusosPneu = quantidadePneus * 4;
		this.quantidadePneus = quantidadePneus;
		
	}

	public Integer getQuantidadeCalotas() {
		return quantidadeCalotas;
	}


	public void setQuantidadeCalotas(Integer quantidadeCalotas) {
		this.quantidadeCalotas = quantidadeCalotas;
	}


	public Integer getQuantidadeParafusosPneu() {
		return quantidadeParafusosPneu;
	}


	public void setQuantidadeParafusosPneu(Integer quantidadeParafusosPneu) {
		this.quantidadeParafusosPneu = quantidadeParafusosPneu;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
	public void imprimeValores(){
		System.out.println("------------------------------------------------------------------");
		System.out.println("                        Dados do carro                            ");
		System.out.println("------------------------------------------------------------------");
		System.out.println("Marca: " + marca);
		System.out.println("Cor: " + cor);
		System.out.println("Quantidade de Pneus: " + getQuantidadePneus());
		System.out.println("Quantiade de Calotas: " + getQuantidadeCalotas());
		System.out.println("Quantidade de Parafusos: " + getQuantidadeParafusosPneu());
		System.out.println("Quantidade de Portas: " + quantidadePortas);
		System.out.println("Número do chassi: " + chassi);
		System.out.println("Ano de fabricação: " + anoFabricacao);
		System.out.println("Tipo de Combustivel: " + tipoCombustivel);
		System.out.println("------------------------------------------------------------------");
	}
}
