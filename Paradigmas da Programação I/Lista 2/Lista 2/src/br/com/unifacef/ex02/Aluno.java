
package br.com.unifacef.ex02;

public class Aluno{
    private int numeroAluno;
    private String nome;
    private int idade;
    private float p1;
    private float p2;
    private float notafinal;
    
    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2){
        this.setNumeroAluno(numeroAluno);
        this.setNome(nome);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);
    }
    
    public Aluno(){}

    public int getNumeroAluno() {
        return numeroAluno;
    }

    public void setNumeroAluno(int numeroAluno) {
         if(numeroAluno == 6);
        this.numeroAluno = numeroAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length() <= 30);
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade <= 0);
        this.idade = idade;
    }

    public float getP1() {
        return p1;
    }

    public void setP1( float p1) {
        if(p1  <= 0);
        this.p1 = p1;
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        if(p2 <= 0);
        this.p2 = p2;
    }
    
    public void notaFinal(float notafinal){
         this.notafinal = (this.p1 + this.p2) / 2;
    }
    
    public String imprimir(){
        return "Nro.Aluno " + this.numeroAluno +  "\nNome: " + this.nome +   "\nIdade " + this.idade + 
                "\np1: " + this.p1 + "\np2: " + this.p2 + "\nnotafinal: " + this.notafinal+"\n";
        
    } 
}

