/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unifacef.exe0;

/**
 *
 * @author Ramon
 */
public class Pedra extends Mao {

    @Override
    public String quemSouEu(){
        return "Pedra";
    }
    
    @Override
    public String compara(Mao mao) {
        String quem = mao.quemSouEu(); //poliformismo
            switch(quem){
                case "Pedra": return "Pedra empata Pedra";
                case "Papel": return "Pedra perde Papel";
                case "Tesoura": return "Pedra ganha Tesoura";
                default: return "Não sabemos responder";
            }
        
    }
    
}
