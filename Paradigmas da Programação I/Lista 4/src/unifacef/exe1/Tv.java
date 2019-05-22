
package unifacef.exe1;


public class Tv extends Produto {
    private int canal;

  public Tv(){
        
    }

    public Tv(int canal, int volume, int serial, int preco) {
        super(volume, serial, preco);
        this.canal = canal;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    @Override
    public String toString() {
        return "Tv{" + "canal=" + canal + super.toString()+'}';
    }

}


