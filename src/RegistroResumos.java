package src;
/**
 * Classe que representa um registro de resumos.
 * @author Joeverton Bento de Sousa
 */
public class RegistroResumos {

    private String[] temas;
    private String[] resumos;
    private int numeroDeResumos;
    private int indice;

    /**
     * Construtor que inicializa o objeto com um número máximo de resumos.
     *
     * @param numeroDeResumos número máximo de resumos que podem ser adicionados ao registro.
     */
    public RegistroResumos(int numeroDeResumos) {
        this.numeroDeResumos = numeroDeResumos;
        temas = new String[numeroDeResumos];
        resumos = new String[numeroDeResumos];
        indice = 0;
    }

    /**
     * Adiciona um novo resumo ao registro.
     *
     * @param tema   o tema do resumo.
     * @param resumo o conteúdo do resumo.
     */
    public void adiciona(String tema, String resumo) {

        if (indice == numeroDeResumos) {
            indice = 0;
        }

        temas[indice] = tema;
        resumos[indice] = resumo;

        indice++;
    }

    /**
     * Retorna um array de Strings com todos os resumos cadastrados.
     *
     * @return um array de Strings com os resumos.
     */
    public String[] pegaResumos() {
        String[] resultado = new String[indice];
        for (int i = 0; i < indice; i++) {
            resultado[i] = temas[i] + " : " + resumos[i];
        }
        return resultado;
    }

    /**
     * Retorna uma String com a listagem dos resumos cadastrados.
     *
     * @return a listagem dos resumos.
     */
    public String imprimeResumos() {

        if (indice == 0) {
            return "- Nenhum resumo cadastrado.";
        }

        String resultado = "- " + indice + " resumo(s) cadastrado(s)\n";
        for (int i = 0; i < indice; i++) {
            resultado += temas[i] + " | ";
        }

        resultado = resultado.substring(0, resultado.length() - 2);
        return resultado;
    }

    /**
     * Retorna o número de resumos cadastrados.
     *
     * @return o número de resumos cadastrados.
     */
    public int conta() {
        return indice;
    }

    /**
     * Verifica se um determinado tema já tem um resumo cadastrado.
     *
     * @param tema o tema a ser verificado.
     * @return true se já existe um resumo cadastrado com o tema especificado, false caso contrário.
     */
    public boolean temResumo(String tema) {
        for (int i = 0; i < indice; i++) {
            if (temas[i].equals(tema)) {
                return true;
            }
        }
        return false;
    }
}
