package application;

import tools.Input;
import converters.NumerosRomanos;;

public class program {

	public static void main(String[] args) {
		
		System.out.print("Digite um número inteiro de até três casas decimais: ");
		int inteiro = Input.readInt();
		
		NumerosRomanos romano = new NumerosRomanos();		
		System.out.println("O número romano correspondente a "+ inteiro + " é: "+ romano.converterParaRomano(inteiro));

		Input.close();
		
	}

}
