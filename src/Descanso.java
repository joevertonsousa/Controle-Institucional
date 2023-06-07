package src; 
/**
 * Classe para gerenciar o tempo de descanso de uma pessoa.
 * @author Joeverton Bento de Sousa
 */
public class Descanso {
	
	/** Horas mínimas de descanso por dia.
	 * 
	 */
	private int defineHorasDescanso; 
	
	/** Número de semanas de descanso. 
	 * 
	*/
	private int defineNumeroSemanas;
	
	/**
	 * Define o número mínimo de horas de descanso por dia.
	 * 
	 * @param defineHorasDescanso número mínimo de horas de descanso por dia.
	 */
	public void defineHorasDescanso(int defineHorasDescanso) {
		this.defineHorasDescanso = defineHorasDescanso; 
	}
	
	/**
	 * Define o número de semanas de descanso.
	 * 
	 * @param defineNumeroSemanas número de semanas de descanso.
	 */
	public void defineNumeroSemanas(int defineNumeroSemanas) {
		this.defineNumeroSemanas = defineNumeroSemanas; 
	}
	
	/**
	 * Retorna o status geral do descanso de acordo com o número de horas e semanas de descanso definidos.
	 * 
	 * @return "cansado" se o número de horas ou semanas de descanso é igual a zero, "descansado" se o número médio de horas de descanso por semana for maior ou igual a 26 e "cansado" caso contrário.
	 */
	public String getStatusGeral() {
		if (defineHorasDescanso == 0 || defineNumeroSemanas == 0) {
			return "cansado"; 
		} else if (defineNumeroSemanas != 0 && defineHorasDescanso / defineNumeroSemanas >= 26) {
			return "descansado"; 
		} else {
			return "cansado"; 
		}
	}
	
}

