/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unifacef.exe0;

import java.util.Date;

/**
 *
 * @author Ramon
 */
public class Futebol extends Esporte{
    private String modalidade;
    private String penalti;

    public Futebol(){
    }
    
    public Futebol(String modalidade, String penalti, String historia, Date inicio, String local){
        super(historia,inicio,local);
        this.modalidade = modalidade;
        this.penalti = penalti;
        
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getPenalti() {
        return penalti;
    }

    public void setPenalti(String penalti) {
        this.penalti = penalti;
    
    }

    @Override
    public String toString() {
        return "Futebol{" + "modalidade=" + modalidade + ", penalti=" + penalti + super.toString() + '}';
    }
    
}
