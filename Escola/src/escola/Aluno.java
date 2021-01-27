
package escola;


public class Aluno extends Pessoa {
   
   private int matr;
   public String curso;
   
  
  
   //metodo
   public void cancelarMatr(){
       System.out.println("Matricula será cancelada!");
   }
   public void pagarMensalidade(){
       System.out.println("Pagando a mensalidade do aluno " + this.nome);
       
   }
   //Metodos Especiais
    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

  
    }
   
   

