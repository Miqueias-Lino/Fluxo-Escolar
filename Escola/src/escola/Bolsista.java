
package escola;

public class Bolsista extends Aluno {
    
    private float bolsa;
    
    //metodo
     public void renovarBolsa(){
         
     } 
     @Override
     public void pagarMensalidade(){
         System.out.println(this.nome + " é bolsista! Pagamento facilitado!");
     }
     
     public float getBolsa(){
         return bolsa;
     }
     public void setBolsa(float bolsa){
         this.bolsa = bolsa;
     }
}
