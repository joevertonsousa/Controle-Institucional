package src;
/**
 * Classe que representa o registro de tempo online de uma disciplina.
 * @author Joeverton Bento de Sousa
 */
public class RegistroTempoOnline {

    private String nomeDisciplina; // nome da disciplina
    private int tempoOnlineEsperado; // tempo online esperado em minutos
    private int tempoOnline; // tempo online atual em minutos

    /**
     * Construtor que recebe o nome da disciplina e o tempo online esperado em minutos.
     *
     * @param nomeDisciplina O nome da disciplina
     * @param tempoOnlineEsperado O tempo online esperado em minutos
     */
    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }

    /**
     * Construtor que recebe apenas o nome da disciplina. O tempo online esperado é definido como 120 minutos.
     *
     * @param nomeDisciplina O nome da disciplina
     */
    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        tempoOnlineEsperado = 120;
    }

    /**
     * Adiciona tempo online em horas ao tempo online atual da disciplina.
     *
     * @param horas Tempo online em horas a ser adicionado
     */
    public void adicionaTempoOnline(int horas) {
        tempoOnline += horas;
    }

    /**
     * Verifica se a disciplina atingiu a meta de tempo online esperado.
     *
     * @return True se o tempo online atual for maior ou igual ao tempo online esperado, false caso contrário
     */
    public boolean atingiuMetaTempoOnline() {
        return tempoOnline >= tempoOnlineEsperado;
    }

    /**
     * Retorna uma representação em string do registro de tempo online, contendo o nome da disciplina, o tempo online atual e o tempo online esperado.
     *
     * @return A string que representa o registro de tempo online
     */
    public String toString() {
        return nomeDisciplina + " " + tempoOnline + "/" + tempoOnlineEsperado;
    }
}
