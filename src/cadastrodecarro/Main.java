package cadastrodecarro;
import models.Carro;

public class Main {

	public static void main(String [] args){
		
		Carro carro = new Carro(4, 4, "12345678900000000", 2018, "Flex");
		carro.setCor(carro.PRATA);
		carro.setMarca(carro.CHEVROLET);
		
		carro.imprimeValores();
		
		
	}
}
