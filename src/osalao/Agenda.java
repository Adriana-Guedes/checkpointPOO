package osalao;

//atributos
public class Agenda {
    public int id;
    public String data;
    public String hora;
    public int id_procedimento;
    public int id_profissionais;

    public Agenda() {
    }

    //contrutor
    public Agenda(int id, String data, String hora, int id_procedimento, int id_profissionais) {
        this.id = id;
        this.data = data;
        this.hora = hora;
        this.id_procedimento = id_procedimento;
        this.id_profissionais = id_profissionais;
    }

    //get e setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getid_procedimento() {
        return id_procedimento;
    }

    public void setId_procedimento(int id_procedimento) {
        this.id_procedimento = id_procedimento;
    }

    public int getId_profissionais() {
        return id_profissionais;
    }

    public void setId_profissionais(int id_profissionais) {
        this.id_profissionais = id_profissionais;
    }
}



