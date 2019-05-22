package unifacef.exe0;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Ramon
 */
public class Testa {
    
    public static void mostra(Esporte camaleao){
        JOptionPane.showMessageDialog(null, camaleao.toString());

    }
    
    
    public static void main(String[] args) {
        
        Futebol fut1 = new Futebol("De campo", "11 metros do gol", "Chegou ao Brasil", new Date(), "Inglaterra");
        
        Basquete bas = new Basquete("7 metros", "4.6 metros", "surgiu nos EUA", new Date(), "EUA" );
        
        Volei vol = new Volei("recepeçao e defesa", "bola em jogo", "criado em 1895", new Date(), "EUA");
        
        mostra(fut1);
        mostra(bas);
        mostra(vol);
        
    }
    
}
