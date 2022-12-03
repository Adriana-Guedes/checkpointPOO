package osalao;


//A criação do MAIN
public class Salaobeauty {
    public static void main(String[] args) {



        // ---------------------------Criação dos objetos------------------------------------------------

        Cliente cliente1 = new Cliente();
        cliente1.setId(1);
        cliente1.setNome("Adriana");
        cliente1.setTelefone("11999999999");

        Cliente cliente2 = new Cliente(2, "Larissa", "1197389562");
        Cliente cliente3 = new Cliente(3, "Raquel", "11973895555");


        //---------------------objeto Profissionais------------------------------------------------------


        Profissionais profissionais1 = new Profissionais();
        profissionais1.setId(1);
        profissionais1.setNome("Rosangela");
        profissionais1.setProfissao("Cabeleireira");

        Profissionais profissionais2 = new Profissionais(2, "Silvia", "Manicure");
        Profissionais profissionais3 = new Profissionais(3, "Carminha", "Cabeleireira");



        //--------------------------------------------objeto Procedimento----------------------------------



        Procedimento servico1 = new Procedimento();
        servico1.setId(1);
        servico1.setServico("Fazer a mão");

        Procedimento servico2 = new Procedimento(2, "Fazer o pé");
        Procedimento servico3 = new Procedimento(3, "Escovar");


        //------------------------------objeto Agenda-------------------------------------------------------



        Agenda agenda1 = new Agenda(1, "23/10/2022", "10:00", 1, 2);
        Agenda agenda2 = new Agenda(2, "24/10/2022", "09:00", 3, 1);
        Agenda agenda3 = new Agenda(1, "23/10/2022", "12:00", 2, 2);

        //------------------------------objeto Atendimento-------------------------------------------------------

        Atendimento atendimento1 = new Atendimento(1, 2, 1,1,1,30.00);
        Atendimento atendimento2 = new Atendimento(2, 1, 3,2,2,60.00);
        Atendimento atendimento3 = new Atendimento(3, 2, 2,3,3,20.00);


    }


}
