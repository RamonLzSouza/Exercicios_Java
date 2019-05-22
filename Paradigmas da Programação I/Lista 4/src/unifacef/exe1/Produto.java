
package unifacef.exe1;

public  abstract class Produto {
     protected int volume;
     protected int serial;
     protected int preco;


 public Produto(){
 
}
    public Produto(int volume, int serial, int preco) {
        this.volume = volume;
        this.serial = serial;
        this.preco = preco;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" + "volume=" + volume + ", serial=" + serial + ", preco=" + preco + '}';
    }
 
}