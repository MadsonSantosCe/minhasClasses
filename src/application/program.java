package application;

import tools.Input;
import converters.NumerosRomanos;;

public class program {

	public static void main(String[] args) {
		
		System.out.print("Digite um n�mero inteiro de at� tr�s casas decimais: ");
		int inteiro = Input.readInt();
		
		NumerosRomanos romano = new NumerosRomanos();		
		System.out.println("O n�mero romano correspondente a "+ inteiro + " �: "+ romano.converterParaRomano(inteiro));

		Input.close();
		
	}

}
