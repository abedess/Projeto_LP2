package ECO;

import java.util.ArrayList;
import java.util.List;

public class PLP extends LeiAbstract{

    private String artigos;


    public PLP(String dni, int ano, String codigo, String ementa, String interesses, String url, String artigos){
        super(dni,ano,codigo,ementa,interesses,url);
        this.artigos = String.join(", ",artigos.split(","));
    }

    @Override
    public String exibirProjeto() {
        return "Projeto de Lei Complementar - " + this.codigo + " - " + this.autorDNI + " - " + this.ementa + " - " + this.artigos + " - " + this.situacao;
    }

    @Override
    public boolean isConclusiva()
    {
        return false;
    }
}
