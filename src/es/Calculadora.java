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
	 * Calcula a soma de dois n�meros reais.
	 * 
	 * @param operando1 valor do primeiro operando
	 * @param operando2 valor do segundo operando
	 * @return retorna o resultado da soma dos dois operandos
	 */
	
	
	public  static double somar( double operando1, double operando2) {
		return operando1 + operando2;
	}
	
	/**
	 * Calcula a subtra��o de dois n�meros reais.
	 * 
	  * @param operando1 valor do primeiro operando
	 * @param operando2 valor do segundo operando
	 * @return retorna o resultado da subtra��o dos dois operandos.
	 * 			No caso da divis�o por zero, retorna infinity.
	 */
	public  static double subtrair( double operando1, double operando2) {
		return operando1 - operando2;
	}
	/**
	 * Calcula a multiplica��o de dois n�meros reais.
	 * 
	  * @param operando1 valor do primeiro operando
	 * @param operando2 valor do segundo operando
	 * @return retorna o resultado da multiplica��o dos dois operandos.
	 */
	
	public  static double multiplicar( double operando1, double operando2) {
		return operando1 * operando2;
	}
	/**
	 * Calcula a Divis�o de dois n�meros reais.
	 * 
	  * @param operando1 valor do primeiro operando
	 * @param operando2 valor do segundo operando
	 * @return retorna o resultado da multiplica��o dos dois operandos.
	 * 			No caso da divis�o por 0, retorna infinity.
	 */
	
	
	public  static double dividir( double operando1, double operando2) {
		return operando1 / operando2;
	}
	

}
