package br.com.unifacef.exe1;
public class Mala {
    private int codigo;
    private float peso;
    private String cor;
    
    public Mala(){
    }

    public Mala(int codigo, float peso, String cor) {
        this.codigo = codigo;
        this.peso = peso;
        this.cor = cor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "\n Mala: " + "codigo: " + codigo + ", peso: " + peso + ", cor: " + cor;
    }
    
}
