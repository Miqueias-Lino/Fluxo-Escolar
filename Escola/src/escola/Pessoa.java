
package escola;


public abstract class Pessoa {
    
   public String nome;
   public int idade;
   public String sexo;
   
   //metodos
   public void fazerAniv(){
       System.out.println(this.getIdade() + 1);
       
   }
   //metodos Especiais
   public String getNome(){
       return nome;
   }
   public void setNome(String nome){
       this.nome = nome;
   }
   public int getIdade(){
       return idade;
   }
   public void setIdade(int idade){
       this.idade = idade;
   }
   public String getSexo(){
       return sexo;
   }
   public void setSexo(String sexo){
       this.sexo = sexo;
   }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
}
