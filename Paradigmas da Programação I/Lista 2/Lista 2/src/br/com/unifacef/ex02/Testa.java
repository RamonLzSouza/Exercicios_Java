
package br.com.unifacef.ex02;

public class Testa {
    
    public static void main(String[] args) {
        Aluno joao = new Aluno (20146, "joao ", 16, 5, 5);
        joao.notaFinal(0);
        System.out.println(joao.imprimir());
        
       
        Aluno jose = new Aluno (20199, "jose ", 20, 5, 7);
        jose.notaFinal(0);
        System.out.println(jose.imprimir());
    }
    
}
