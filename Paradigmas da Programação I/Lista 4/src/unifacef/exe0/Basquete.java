package unifacef.exe0;

import java.util.Date;

/**
 *
 * @author Ramon
 */
public class Basquete extends Esporte{
    private String linha3, lanceLivre;
    
    public Basquete(){
        
    }
    public Basquete(String linha3, String lanceLivre, String historia, Date inicio, String local){
        
        super(historia, inicio, local);
        this.linha3 = linha3;
        this.lanceLivre = lanceLivre;
        
    }

    public String getLinha3() {
        return linha3;
    }

    public void setLinha3(String linha3) {
        this.linha3 = linha3;
    }

    public String getLanceLivre() {
        return lanceLivre;
    }

    public void setLanceLivre(String lanceLivre) {
        this.lanceLivre = lanceLivre;
    }

    @Override
    public String toString() {
        return "Basquete{" + "linha3=" + linha3 + ", lanceLivre=" + lanceLivre + super.toString() + '}';
    }
    
}
