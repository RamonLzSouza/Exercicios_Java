package br.com.unifacef.exe2;

import java.util.ArrayList;

/**
 *
 * @author Ramon
 */
public class Onibus {
    private int numero;
    private String marca;
    private ArrayList<Passageiro> passageiros;
    public Onibus(){
        this.passageiros = new ArrayList();
    }

    public Onibus(int numero, String marca) {
        this.numero = numero;
        this.marca = marca;
        this.passageiros = new ArrayList();
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public ArrayList<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(ArrayList<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }

    @Override
    public String toString() {
        return "\n Onibus{" + "numero=" + numero + ", marca=" + marca + ", passageiros=" + passageiros + '}';
    }

    public void adicionaPassageiro(Passageiro passageiro){
        this.passageiros.add(passageiro);
    }
    
    public boolean removePassageiro(Passageiro passageiro){
        return this.passageiros.remove(passageiro);
    }
    
    public int buscaPassageiro(String cpf){
        for(int i =0; i <this.passageiros.size();i++){
            if(this.passageiros.get(i).getCpf().equals(cpf)){
                return i;
            }
            
        }
        return -1;
    }
    
    public boolean atualizaPassageiro(Passageiro passageiro){
        int pos = this.buscaPassageiro(passageiro.getCpf());
        if(pos != -1){
            this.passageiros.set(pos, passageiro);
            return true;
        }
        else{
            return false;
        }
        
    }
}

