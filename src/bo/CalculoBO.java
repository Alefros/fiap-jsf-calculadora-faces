package bo;

public class CalculoBO {

	public static double somar(double n1, double n2){
		return n1 + n2;
	}
	
	public static double subtrair(double n1, double n2){
		return n1 - n2;
	}
	
	public static double multiplicar(double n1, double n2){
		return n1 * n2;
	}
	
	public static double dividir(double n1, double n2){
		return n1 / n2;
	}
	
	public static Integer fatorial(Integer n1){
		if(n1 == 0)
			return 1;
		else
			return n1 * fatorial(n1 - 1);
	}
	
}
