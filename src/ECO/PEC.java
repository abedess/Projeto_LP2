package ECO;

/**
 * Esta classe define uma propsota de emenda a constituição (PEC),
 * que tem como base a classae abstract LeiAbstract.
 */
public class PEC extends LeiAbstract {
	/**
	 * Este atributo representa os artigos relacionados a PEC.
	 */
    private String artigos;
    /**
     * Construtor tilizado para inicializar os atributos relacionados
     * a PEC, utilizando o método super para os atributos que estão na
     * classe abstract.
     * @param dni
     * @param ano
     * @param codigo
     * @param ementa
     * @param interesses
     * @param url
     * @param artigos
     */
    public PEC(String dni, int ano, String codigo, String ementa, String interesses, String url, String artigos) {
        super(dni, ano, codigo, ementa, interesses, url);
        this.artigos = artigos;
    }
    /**
     * Este método é a representação textual para exibir a PEC.
     */
    @Override
    public String exibirProjeto() {
        return "Projeto de Emenda Constitucional - " + this.codigo + " - " + this.autorDNI + " - " + this.ementa + " - " + this.artigos + " - " + this.situacao;
    }
}
