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
public class Papel extends Mao{
    
    @Override
    public String quemSouEu(){
     return "Papel";   
    }

    @Override
    public String compara(Mao mao) {
            // QUEM ESTA SENDO PASSADO COMO PARAMETRO
            String quem = mao.quemSouEu(); //poliformismo
            switch(quem){
                case "Papel": return "Papel empata Papel";
                case "Pedra": return "Papel ganha Pedra";
                case "Tesoura": return "Papel perde Tesoura";
                default: return "Não sabemos responder";
            }
    }
    

    
        
        
}
    
