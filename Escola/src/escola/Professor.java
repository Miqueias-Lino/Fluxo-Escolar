
package escola;

 public class Professor extends Pessoa{
 public String especialidade;
 public float salario;
 

 //metodo
 public void receberAum(float aum){
     this.salario += aum;
 }
 //Metodos Especiais
 
 public String getEspecialidade(){
     return especialidade;
 }
 public void setEspecialidade(String especialidade){
     this.especialidade = especialidade;
 }
 public float getSalario(){
     return salario;
 }
 public void setSalario(float salario){
     this.salario = salario;
 }

    
    }
 

    

