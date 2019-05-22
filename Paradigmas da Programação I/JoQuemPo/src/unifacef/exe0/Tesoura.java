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
public class Tesoura extends Mao {
    
    @Override
    public String quemSouEu(){
        return "Tesoura";
    }

    @Override
    public String compara(Mao mao) {
        String quem = mao.quemSouEu(); //poliformismo
            switch(quem){
                case "Tesoura": return "Tesoura empata Tesoura";
                case "Papel": return "Tesoura ganha Papel";
                case "Pedra": return "Tesoura ganha Pedra";
                default: return "Não sabemos responder";
            }
        
    }

    
    
}
