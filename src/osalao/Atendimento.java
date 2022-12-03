package osalao;

//atributos
public class Atendimento {
    private int id;
    private int id_Profissionais;
    private int id_Procedimento;
    private int id_Agenda;
    private int id_Cliente;
    private double valor;

    public Atendimento() {
    }



//contrutor
    public Atendimento(int id, int id_Profissionais, int id_Procedimento, int id_Agenda, int id_cliente, double valor) {
        this.id = id;
        this.id_Profissionais = id_Profissionais;
        this.id_Procedimento = id_Procedimento;
        this.id_Agenda = id_Agenda;
        this.id_Cliente = id_cliente;
        this.valor = valor;
    }



//metodo
    public double calcularValorServico(){
        return getValor();
    }



//get e setter
public double getValor() {
    return valor;
}

    public void setValor(double valor) {
        this.valor = valor;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_Profissionais() {
        return id_Profissionais;
    }

    public void setId_Profissionais(int id_Profissionais) {
        this.id_Profissionais = id_Profissionais;
    }

    public int getId_Procedimento() {
        return id_Procedimento;
    }

    public void setId_Procedimento(int id_Procedimento) {
        this.id_Procedimento = id_Procedimento;
    }

    public int getId_Agenda() {
        return id_Agenda;
    }

    public void setId_Agenda(int id_Agenda) {
        this.id_Agenda = id_Agenda;
    }

    public int getId_cliente() {
        return id_Cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_Cliente = id_cliente;
    }


}



