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

//não pode ser instanciada - serve de modelo para as filhas (ABSTRACT)
public abstract class Esporte {
    protected String historia;
    protected Date inicio;
    protected String local;
    
    public Esporte(){
    }

    public Esporte(String historia, Date inicio, String local) {
        this.historia = historia;
        this.inicio = inicio;
        this.local = local;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Esporte{" + "historia=" + historia + ", inicio=" + inicio + ", local=" + local + '}';
    }
    
   
}


