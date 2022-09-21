package osalao;


//CLASSE ABSTRATA
 public abstract class UnidadesSalao {

     private String nome;


     public UnidadesSalao(String nome) {
         this.nome = nome;
     }


     //metodo
     public void nomeFilial(){
         System.out.println( getNome());
     }


     public String getNome() {
         return nome;
     }

     public void setNome(String nome) {
         this.nome = nome;
     }

}
