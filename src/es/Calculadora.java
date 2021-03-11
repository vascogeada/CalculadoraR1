package es;

public class Calculadora {
	/**
	 * <ul>
	 * <li>Somar</li>
	 * <li>Subtrair</li>
	 * <li>Multiplicar</li>
	 * <li>Dividir</li>
	 * </ul>
	 */
	

	/**
	 * Calcula a soma de dois números reais.
	 * 
	 * @param operando1 valor do primeiro operando
	 * @param operando2 valor do segundo operando
	 * @return retorna o resultado da soma dos dois operandos
	 */
	
	
	public  static double somar( double operando1, double operando2) {
		return operando1 + operando2;
	}
	
	/**
	 * Calcula a subtração de dois números reais.
	 * 
	  * @param operando1 valor do primeiro operando
	 * @param operando2 valor do segundo operando
	 * @return retorna o resultado da subtração dos dois operandos.
	 * 			No caso da divisão por zero, retorna infinity.
	 */
	public  static double subtrair( double operando1, double operando2) {
		return operando1 - operando2;
	}
	/**
	 * Calcula a multiplicação de dois números reais.
	 * 
	  * @param operando1 valor do primeiro operando
	 * @param operando2 valor do segundo operando
	 * @return retorna o resultado da multiplicação dos dois operandos.
	 */
	
	public  static double multiplicar( double operando1, double operando2) {
		return operando1 * operando2;
	}
	/**
	 * Calcula a Divisão de dois números reais.
	 * 
	  * @param operando1 valor do primeiro operando
	 * @param operando2 valor do segundo operando
	 * @return retorna o resultado da multiplicação dos dois operandos.
	 * 			No caso da divisão por 0, retorna infinity.
	 */
	
	
	public  static double dividir( double operando1, double operando2) {
		return operando1 / operando2;
	}
	

}
