package converters;
/**
 * A classe Cebolinhas recebe uma frase qualquer e troca as letras 'r' das palavras pela letra 'l'.
 * @author Madson
 */
public class Cebolinha {
	
	/**
	 * 
	 */
	private String frase;
	
	
	Cebolinha(String frase) {
		//construtor da classe.
		this.frase = frase;		
	}
	
	private String trocaLetras() {
		
		String texto = " ";
		
		//Usado o método .split da classe String para separar o texto em palavras e armazena-las em um array. 
		String[] textoSeparado = frase.split(" ");
		
		//Analisando palavra por palavra em um loop.
		for(String palavra: textoSeparado) {
			
			//Verificando o tamanho da palavra.
			int comprimento = palavra.length();
			
			//Analisando letra por letra em um loop.
			for (int i = 0; i< comprimento; i++) {				
				
				//verificando se a letra é igual a 'r', trocando a letra por 'l' e copiando no novo texto. 
				//o ultimo 'r' de um palavra não será modificado.
				if ( (palavra.charAt(i) == 'r') && (i != comprimento-1) ) {
					texto += 'l';	
				} else { //caso a letra seja diferente de 'r' apenas copiamos no novo texto.
					texto += palavra.charAt(i);
				}	
								
			}
			
			//inserindo espaços entre cada palavras.
			texto += " ";
		}
		
		//retirando os espaços do inicio e do fim da frase.
		return texto.trim();
	}
	
	
	public String toString() {		
		frase = trocaLetras();
		return frase;
	}
	
	
}
