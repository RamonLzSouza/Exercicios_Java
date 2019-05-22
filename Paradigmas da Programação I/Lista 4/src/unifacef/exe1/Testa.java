package unifacef.exe1;

import javax.swing.JOptionPane;


public class Testa {
    
    public static void mostra(Produto camaleao){
         JOptionPane.showMessageDialog(null, camaleao.toString());
    }

  
    public static void main(String[] args) {
        
        Radio radio1 = new Radio ((float) 957.7, "hertz", 15, 457, 29 );
        Tv tv1 = new Tv (7, 16, 49, 25);
        
        mostra(radio1);
        mostra(tv1);
        
    }
    
}
