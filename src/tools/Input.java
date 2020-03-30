package tools;
import java.util.Scanner;

/**
 * A CLASSE INPUT FACILITA O USO DA CLASSE SCANNER E CORRIGE O ERRO DE QUEBRA DE LINHA QUANDO A CLASSE É UTILIZADA.
 * @author Madson Santos
 */

public class Input {

	static Scanner dados = new Scanner(System.in);

	public static char readChar() {
		String input = dados.nextLine();
		char retorno = input.charAt(0);
		return retorno;
	}
	
	public static String readString() {		
		String retorno = dados.nextLine();
		return retorno;
	}
	
	public static byte readByte() {
		String input = dados.nextLine();
		byte retorno = Byte.parseByte(input);
		return retorno;
	}
	
	public static short readShort() {
		String input = dados.nextLine();
		short retorno = Short.parseShort(input);
		return retorno;
	}
	
	public static int readInt() {
		String input = dados.nextLine();
		int retorno = Integer.parseInt(input);
		return retorno;
	}
	
	public static long readLong() {
		String input = dados.nextLine();
		long retorno = Long.parseLong(input);
		return retorno;
	}
	
	public static float readFloat() {
		String input = dados.nextLine();
		float retorno = Float.parseFloat(input);
		return retorno;
	}
	
	public static double readDouble() {		
		String input = dados.nextLine();
		double retorno = Double.parseDouble(input);
		return retorno;
	}
	
	public static void close() {
		dados.close();
	}		

}
