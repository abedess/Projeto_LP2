package Util;

import java.text.*;
import java.util.*;

public class Validador {

    public Validador() {

    }

    public static void validaParametrosCadastrarPessoa(String nome, String dni, String estado){


        if ("".equals(nome.trim())){
            throw new IllegalArgumentException("Erro ao cadastrar pessoa: nome nao pode ser vazio ou nulo");
        }   if ("".equals(dni.trim())){
            throw new IllegalArgumentException("Erro ao cadastrar pessoa: dni nao pode ser vazio ou nulo");
        }   if ("".equals(estado.trim())){
            throw new IllegalArgumentException("Erro ao cadastrar pessoa: estado nao pode ser vazio ou nulo");
        }
        validaDNI(dni, "Erro ao cadastrar pessoa:");
    }
    public static void validaDNICadastrarDeputado(String dni){
        validaDNI(dni, "Erro ao cadastrar deputado:");

    }
    public static void validaDNIExibirPessoa(String dni){
        validaDNI(dni,"Erro ao exibir pessoa:");
    }

    public static void validaDNICadastrarComissao(String dni){
        validaDNI(dni,"Erro ao cadastrar comissao:");
    }

    public static void validaDNICadastroProjeto(String dni){
        validaDNI(dni,"Erro ao cadastrar projeto:");
    }

    public static void validaDNI(String dni, String erro) {
        if (dni.equals(null) || "".equals(dni.trim()))
        {
            throw new IllegalArgumentException(erro + " dni nao pode ser vazio ou nulo");
        }
        if (!dni.matches("^[0-9]{9}-[0-9]{1}")) throw new IllegalArgumentException(erro + " dni invalido");
    }

//    public static void validaParametrosCadastrarPessoa(String nome, String dni, String estado) {
//        if ("".equals(nome.trim())) {
//            throw new IllegalArgumentException("Erro ao cadastrar pessoa: nome nao pode ser vazio ou nulo");
//        }
//        if ("".equals(dni.trim())) {
//            throw new IllegalArgumentException("Erro ao cadastrar pessoa: dni nao pode ser vazio ou nulo");
//        }
//        if ("".equals(estado.trim())) {
//            throw new IllegalArgumentException("Erro ao cadastrar pessoa: estado nao pode ser vazio ou nulo");
//        }
//    }
//
//    public static void validaDNI(String dni, int cargo) {
//
//        if (cargo == 0) {
//            if (dni.equals(null) || "".equals(dni.trim())) {
//                throw new IllegalArgumentException("Erro ao cadastrar pessoa: dni nao pode ser vazio ou nulo");
//            } else if (!dni.matches("^[0-9]{9}-[0-9]{1}")) {
//                throw new IllegalArgumentException("Erro ao cadastrar pessoa: dni invalido");
//            }
//        } else if (cargo == 1) {
//            if (dni.equals(null) || "".equals(dni.trim())) {
//                throw new IllegalArgumentException("Erro ao cadastrar pessoa: dni nao pode ser vazio ou nulo");
//            } else if (!dni.matches("^[0-9]{9}-[0-9]{1}")) {
//                throw new IllegalArgumentException("Erro ao cadastrar deputado: dni invalido");
//            }
//        }
//    }

    public static void validaData(String data) {
        if ("".equals(data.trim())) {
            throw new IllegalArgumentException("Erro ao cadastrar deputado: data nao pode ser vazio ou nulo");
        }
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date dataFormatada = null;
        try {
            sdf.setLenient(false);
            dataFormatada = sdf.parse(data);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Erro ao cadastrar deputado: data invalida");
        }
        Date dataAtual = new Date();

        if (!data.matches("^[0-9]{8}")) {
            throw new IllegalArgumentException("Data formatada errada");
        } else if (dataFormatada.after(dataAtual)) {
            throw new IllegalArgumentException("Erro ao cadastrar deputado: data futura");
        }
//        SimpleDateFormat sdf = new SimpleDateFormat("DDMMAAAA");
//        Date dataFormatada = sdf.parse(data);
//        Calendar cal = new GregorianCalendar();
//        cal.setTime(dataFormatada);
//        GregorianCalendar dataAtual = new GregorianCalendar();
//
//        if(!data.matches("^[0-9]{8}")){
//            return false;
//        } else if (cal.after(dataAtual)){
//            return false;
//        } else {
//            return true;
//        }
    }
    public static void validaComissao(String tema, String deputados){
        if ("".equals(tema.trim())){
            throw new IllegalArgumentException("Erro ao cadastrar comissao: tema nao pode ser vazio ou nulo");
        }
        if ("".equals(deputados.trim())){
            throw new IllegalArgumentException("Erro ao cadastrar comissao: lista de politicos nao pode ser vazio ou nulo");
        }
    }

    public static void validaCadastroLei(String dni, int ano, String ementa, String interesses, String url){
        if ("".equals(dni.trim())){
            throw new IllegalArgumentException("Erro ao cadastrar projeto: autor nao pode ser vazio ou nulo");
        } else if ("".equals(ementa.trim())){
            throw new IllegalArgumentException("Erro ao cadastrar projeto: ementa nao pode ser vazia ou nula");
        } else if ("".equals(interesses.trim())){
            throw new IllegalArgumentException("Erro ao cadastrar projeto: interesse nao pode ser vazio ou nulo");
        } else if ("".equals(url.trim())){
            throw new IllegalArgumentException("Erro ao cadastrar projeto: url nao pode ser vazio ou nulo");
        }
    }
    public static void validaCadastroLei(String dni, int ano, String ementa, String interesses, String url, String artigos){
        if ("".equals(dni.trim())){
            throw new IllegalArgumentException("Erro ao cadastrar projeto: autor nao pode ser vazio ou nulo");
        } else if ("".equals(ementa.trim())){
            throw new IllegalArgumentException("Erro ao cadastrar projeto: ementa nao pode ser vazia ou nula");
        } else if ("".equals(interesses.trim())){
            throw new IllegalArgumentException("Erro ao cadastrar projeto: interesse nao pode ser vazio ou nulo");
        } else if ("".equals(url.trim())){
            throw new IllegalArgumentException("Erro ao cadastrar projeto: url nao pode ser vazio ou nulo");
        } else if ("".equals(artigos.trim())){
            throw new IllegalArgumentException("Erro ao cadastrar projeto: artigo nao pode ser vazio ou nulo");
        }
    }

}
