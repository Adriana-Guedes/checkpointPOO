package osalao;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {


    public static boolean run(){


        //VARIAVEIS
        int operador = 0;


        Filial filial = new Filial();

        // ---------------------------Criação dos objetos------------------------------------------------

        ArrayList<Cliente> clienteList = new ArrayList<>();
        clienteList.add(new Cliente(1, "Larissa", "(11)9738-9562"));
        clienteList.add(new Cliente(2, "Raquel", "(11)97389-5555"));
        clienteList.add(new Cliente(3, "Adriana", "(11)98788-7878"));


        //---------------------objeto Profissionais------------------------------------------------------


        ArrayList<Profissionais> profissionaisList = new ArrayList<>();
        profissionaisList.add(new Profissionais(1, "Rosangela", "Cabeleireira"));
        profissionaisList.add(new Profissionais(2, "Silvia", "Manicure"));
        profissionaisList.add(new Profissionais(3, "Carminha", "Cabeleireira"));


        //--------------------------------------------objeto Procedimento----------------------------------


        ArrayList<Procedimento> servicoList = new ArrayList<>();
        servicoList.add(new Procedimento(1, "Fazer a mão"));
        servicoList.add(new Procedimento(2, "Fazer o pé"));
        servicoList.add(new Procedimento(3, "Escovar"));


        //------------------------------objeto Agenda-------------------------------------------------------

        ArrayList<Agenda> agendaList = new ArrayList<>();
        agendaList.add(new Agenda(1, "23/10/2022", "10:00", 1, 2));
        agendaList.add(new Agenda(2, "24/10/2022", "09:00", 3, 1));
        agendaList.add(new Agenda(3, "23/10/2022", "12:00", 2, 2));


        //------------------------------objeto Atendimento-------------------------------------------------------

        //aqui os objetos já estao em index, pois criamos uma array liste de arrays  :/
        ArrayList<Atendimento> atendimentoList = new ArrayList<>();
        atendimentoList.add(new Atendimento(1, profissionaisList.get(0), servicoList.get(1), agendaList.get(0), clienteList.get(2), 20));
        atendimentoList.add(new Atendimento(2, profissionaisList.get(1), servicoList.get(0), agendaList.get(2), clienteList.get(1), 35));
        atendimentoList.add(new Atendimento(3, profissionaisList.get(2), servicoList.get(2), agendaList.get(1), clienteList.get(0), 15));


        //-------------------------------INTERAÇÃO COM O USUARIO------------------------------------------------------

        Scanner in = new Scanner(System.in);
        //NOME DA FILIAL
        System.out.println("\n\n--------------" + filial.getNome() + " -------------------\n\n");
        System.out.println("COMO DESEJA REALIZAR SUA CONSULTA? ");


        // defina operador


        do {


            try {


                System.out.printf(" \n"
                        + "1 - AGENDA\n"
                        + "2 - COLABORADORES\n"
                        + "3 - CLIENTES\n");
                System.out.printf("\n INFORME O NÚMERO DE UMA DAS OPÇÕES ACIMA:\n");

                operador = in.nextInt();

            } catch (InputMismatchException e) {
                System.out.printf("POR GENTILEZA DIGITA APENAS NUMEROS DE 1 À 3 CONFOME AS OPÇÕES ");
            } catch (Exception e) {
                System.out.printf("INFORME O NÚMERO DE UMA DAS OPÇÕES");
            }

            in.nextLine(); //scanner pula o cursos para a proxima linha(pois estará vazia), para não ficar com o valor errado gaurdado na memória provocando um looping eterno
        } while (operador < 1 || operador > 3);

        // pode seguir : opoerador tem que ser de 1 a 3




        switch (operador) {
            case 1:
                System.out.printf("|-------------------------------------------------|\n");
                System.out.printf("|                   AGENDAMENTOS                  |\n");
                System.out.printf("|-------------------------------------------------|\n\n");
                mostrarAgenda(atendimentoList);
                break;


            case 2:
                System.out.printf("|-------------------------------------------------|\n");
                System.out.printf("|                  COLABORADORES                  |\n");
                System.out.printf("|-------------------------------------------------|\n\n");
                mostrarProfissionais(profissionaisList);
                break;


            case 3:
                System.out.printf("|-------------------------------------------------|\n");
                System.out.printf("|                   CLIENTES                      |\n");
                System.out.printf("|-------------------------------------------------|\n\n");
                mostrarClientes(clienteList);
                break;

        }


        System.out.println("DESEJA CONSULTAR MAIS ALGUMA INFORMAÇÃO [SIM/NÃO]?");
       // in.nextLine(); //scanner pula o cursos para a proxima linha(pois estará vazia), para não ficar com o valor errado gaurdado na memória provocando um looping eterno
        String continua = in.next();




        return continua != null &&
                ( continua.equalsIgnoreCase("SIM") || continua.equalsIgnoreCase("S"));

    }




    //METODOS MOSTRAR
    public static void mostrarAgenda(ArrayList<Atendimento> atendimento) {
        for (Atendimento item : atendimento) {
            System.out.printf("---------------- CLIENTE E SERVIÇO  -------------\n");

            System.out.printf("%s\n", item.toString());

            System.out.printf("-------------------------------------------------\n\n");

        }

    }

    public static void mostrarProfissionais(ArrayList<Profissionais> prof) {
        for (Profissionais item : prof) {
            System.out.printf("------------------ COLABORADOR -------------------\n");
            System.out.printf("%s\n|", item.toString());

            System.out.printf("------------------------------------------------\n\n\n");

        }

    }


    public static void mostrarClientes(ArrayList<Cliente> cliente) {
        for (Cliente item : cliente) {
            System.out.printf("-------------------- CLIENTE ----------------------\n");
            System.out.printf("%s\n", item.toString());

            System.out.printf("--------------------------------------------------\n\n");

        }

    }



}
