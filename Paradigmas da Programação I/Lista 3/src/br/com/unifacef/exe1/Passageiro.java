package br.com.unifacef.exe1;

import java.util.ArrayList;

/**
 *
 * @author Ramon
 */
public class Passageiro {
    private String nome, cpf;
    private ArrayList<Mala> malas;
    public Passageiro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        //aloca espaço na memoria
        this.malas = new ArrayList();
    }
    
    public Passageiro(){
        //aloca espaço na memoria
        this.malas = new ArrayList();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Nome do passageiro: " + nome + ", cpf: " + cpf + ", malas: " + malas;
    }


    //associa uma mala ao passageiro
    public void adicionaMala(Mala mala){
        this.malas.add(mala);
        
    }
    //remove uma mala do passageiro
    public boolean removeMala(Mala mala){
        return this.malas.remove(mala);
                
    }
    
    //busca posição da mala
    public int buscaMala(int codigo){
        for(int i=0;i<this.malas.size();i++){ // quantidade de malas
            if(this.malas.get(i).getCodigo() == codigo){ // pega o codigo da mala
                return i; //achou
            }
        }
        return -1; // nao achou
    }
    
    //atualiza uma mala
    public boolean atualizaMala(Mala nova){
        int pos = this.buscaMala(nova.getCodigo());
        if (pos != -1){ // achou
            this.malas.set(pos, nova);
            return true;
        }
        else return false;
    }
}
