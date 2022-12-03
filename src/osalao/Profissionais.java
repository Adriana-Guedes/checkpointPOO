package osalao;

//atributos

public class Profissionais {
    public int id;
    public String nome;
    public String profissao;

    public Profissionais() {
    }

    //contrutor
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
}




