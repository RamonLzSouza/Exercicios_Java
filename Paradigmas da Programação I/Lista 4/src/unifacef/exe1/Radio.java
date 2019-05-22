
package unifacef.exe1;


public class Radio extends Produto {
    private float estacao;
    private String banda;

    public Radio (){
    
    }

    public Radio(float estacao, String banda, int volume, int serial, int preco) {
        super(volume, serial, preco);
        this.estacao = estacao;
        this.banda = banda;
    }

    public float getEstacao() {
        return estacao;
    }

    public void setEstacao(float estacao) {
        this.estacao = estacao;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    @Override
    public String toString() {
        return "Radio{" + "estacao=" + estacao + ", banda=" + banda + super.toString() +'}';
    }


}

