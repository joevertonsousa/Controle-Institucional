package src; 
/**
 * A classe Disciplina representa uma disciplina do curso, 
 * com informações como nome, horas de estudo, notas e média. 
 *  @author Joeverton Bento de Sousa
 */
import java.util.*; 

public class Disciplina {
    
    // Atributos da classe Disciplina
    private int Horas; // Armazena as horas de estudo da disciplina
    private String nomeDisciplina; // Armazena o nome da disciplina
    private double[] notas; // Armazena as notas da disciplina
    private double media; // Armazena a média das notas da disciplina
    
    /**
     * Construtor da classe Disciplina, que recebe o nome da disciplina 
     * e inicializa os atributos Horas, notas e media.
     * 
     * @param nomeDisciplina O nome da disciplina.
     */
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.notas = new double[4]; // Inicializa o vetor de notas com tamanho 4
        this.media = 0; // Inicializa a média como 0
        this.Horas = 0; // Inicializa as horas de estudo como 0
    }
    
    /**
     * Método que cadastra as horas de estudo da disciplina.
     * 
     * @param horas As horas de estudo da disciplina.
     */
    public void cadastraHoras(int horas){
        this.Horas = horas;
    }
    
    /**
     * Método que cadastra uma nota para a disciplina.
     * 
     * @param Nota O número da nota que será cadastrada (1 a 4).
     * @param valorNota O valor da nota que será cadastrada.
     */
    public void cadastraNota(int Nota, double valorNota){
        notas[Nota-1] = valorNota; // Armazena a nota no vetor de notas, subtraindo 1 para ajustar o índice do vetor
    }
    
    /**
     * Método que verifica a média das notas da disciplina.
     */
    private void verificaMedia() {
        double soma = 0;
        for (double nota : notas) { // Percorre o vetor de notas e soma seus valores
            soma += nota; 
        }
        this.media = soma/4; // Calcula a média e armazena no atributo media
    }

    /**
     * Método que verifica se a disciplina foi aprovada ou não, baseado em sua média.
     * 
     * @return true se a disciplina foi aprovada, false caso contrário.
     */
    public boolean aprovado() {
        verificaMedia(); // Verifica a média das notas da disciplina
        return this.media >= 7.0; // Retorna true se a média for maior ou igual a 7.0, false caso contrário
    }

    /**
     * Método que retorna uma representação da disciplina em formato de String.
     * 
     * @return Uma String contendo o nome da disciplina, suas horas de estudo, média e notas.
     */
    public String toString() {
        return nomeDisciplina + " " + Horas + " " + media + " " + Arrays.toString(notas); // Retorna uma String com os atributos da disciplina formatados
    }
}
