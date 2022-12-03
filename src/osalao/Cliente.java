package osalao;



//atributos
public class Cliente {
    private Integer id;
    private String nome;
    private String telefone;

    public Cliente() {
    }



    //contrutor
    public Cliente(Integer id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }


    //get e setter

    public Integer getId(int i) {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome(String adriana) {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone(String telefone) {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}

