package osalao;

//atributos

public class Procedimento {
    protected Integer id;
    protected String servico;

//construtor vazio
    public Procedimento() {
    }


    //contrutor
    public Procedimento(int id, String servico) {
        this.id = id;
        this.servico = servico;
    }


    //get e setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }



}
