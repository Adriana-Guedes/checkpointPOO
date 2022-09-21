package osalao;

import java.util.ArrayList;
import java.util.List;

//atributos
public class Atendimento {
    private Integer id;
    private Profissionais profissional;
    private Procedimento procedimento;
    private Agenda agenda;
    private Cliente cliente;
    private double valor;


    //construtor vazio
    public Atendimento() {
    }

    //contrutor

    public Atendimento(Integer id, Profissionais profissional, Procedimento procedimento, Agenda agenda, Cliente cliente, double valor) {
        this.id = id;
        this.profissional = profissional;
        this.procedimento = procedimento;
        this.agenda = agenda;
        this.cliente = cliente;
        this.valor = valor;
    }


//metodo

    public double calcularValorServico() {
        return getValor();
    }


    //get e setter


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Profissionais getProfissional() {
        return profissional;
    }

    public void setProfissional(Profissionais profissional) {
        this.profissional = profissional;
    }

    public Procedimento getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(Procedimento procedimento) {
        this.procedimento = procedimento;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }







    //METODO TO STRING

    @Override
    public String toString() {
        String result;

        result = String.format("Id :..............................:%s\n",  cliente.id)+
                String.format("Nome: ............................:%s\n",  cliente.nome) +
                String.format("Telefone: ........................:%s\n",  cliente.telefone) +
                String.format("Profissional: ....................:%s\n",  profissional.nome ) +
                String.format("Profissional: ....................:%s\n",  procedimento.servico ) +
                String.format("Data: ............................:%s\n",  agenda.data ) +
                String.format("Hora: ............................:%s\n",  agenda.hora ) +
                String.format("Valor Total:  ....................:%s\n",  this.valor) ;



        return (result);


        }




}

