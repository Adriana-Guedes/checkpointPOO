package osalao;

//atributos

import java.util.ArrayList;

public class Profissionais  {
    protected Integer id;
    protected String nome;
    protected String profissao;





    //sobrecarga de metodos

    //construtor vazio
    public Profissionais() {
    }

    //contrutor com parametros
    public Profissionais(int id, String nome, String profissao) {
        this.id = id;
        this.nome = nome;
        this.profissao = profissao;

    }


    //get e setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }


    //METODO TO STRING - Sobreescrita
    @Override
    public String toString() {
        String result;

        result = String.format("Id :..............................:%s\n", this.id) +
                String.format("Profissional: ....................:%s\n", this.nome) +
                String.format("Serviço: .........................:%s\n", this.profissao);


        return (result);


    }




}

