package converters;

/** 
 *A CLASSE NUMEROSROMANOS CONVERTE NUMEROS INTEIROS DE ATÉ 3 DIGITOS EM ALGARISMOS ROMANOS
 * @author Madson Santos 
 */

public class NumerosRomanos {

	private String numeroParaTexto;
	private int tamanho;
	private char numerosSeparados[];	
	
	public String converterParaRomano(int numero) {		

		String romano= "";
		this.numeroParaTexto = Integer.toString(numero);
		this.numerosSeparados = numeroParaTexto.toCharArray();
		this.tamanho = numerosSeparados.length;
		romano = formatarNumero();
		return romano;		
		
	}
	
	private String formatarNumero() {		
		
		String retorno = "";
		
		if (tamanho == 3) {
			String centena = ""+numerosSeparados[tamanho-3];
			int numero = Integer.parseInt(centena);
			retorno += centena(numero);
		}
		
		if(tamanho >= 2 && tamanho <4) {
			String dezena = ""+numerosSeparados[tamanho-2];
			int numero = Integer.parseInt(dezena);
			retorno += dezena(numero);
		}
		
		if(tamanho >= 1 && tamanho <4) {
			String unidade = ""+numerosSeparados[tamanho-1];
			int numero = Integer.parseInt(unidade);
			retorno += unidade(numero);
		}		
		
		return retorno;
	}
	
	
	private String unidade(int numero) {
		String romano = "";
		String numerosRomanos[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

		if(numero != 0) {
			romano  = numerosRomanos[numero-1];
		}
		
		return romano;
	}
	
	
	private String dezena(int numero) {
		String romano = "";
		String numerosRomanos[] = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		
		if(numero != 0) {
			romano  = numerosRomanos[numero-1];
		}
				
		return romano;
	}
	
	
	private String centena(int numero) {
		String romano = "";
		String numerosRomanos[] = {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		
		if(numero != 0) {
			romano  = numerosRomanos[numero-1];
		}	
		
		return romano;
	}	
	
}
