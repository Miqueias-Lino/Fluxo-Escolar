
package escola;


public class Escola {

    
    public static void main(String[] args) {
    Aluno a1 = new Aluno();
    
    a1.setIdade(18);
    a1.setNome("João");
    a1.setSexo("M");
    a1.setCurso("informatica");
    a1.setMatr(1113);
    a1.pagarMensalidade();
   
    
    Bolsista b1 = new Bolsista();
    
    b1.setNome("Marcos");
    b1.setIdade(19);
    b1.setSexo("M");
    b1.setMatr(1112);
    b1.setBolsa(12.5f);
    b1.pagarMensalidade();
    }
    
}
