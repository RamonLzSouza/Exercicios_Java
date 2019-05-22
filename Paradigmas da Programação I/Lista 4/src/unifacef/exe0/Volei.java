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
public class Volei extends Esporte{
    private String libero;
    private String saque;

    public Volei() {
    }

    public Volei(String libero, String saque, String historia, Date inicio, String local) {
        super(historia, inicio, local);
        this.libero = libero;
        this.saque = saque;
    }

    public String getLibero() {
        return libero;
    }

    public void setLibero(String libero) {
        this.libero = libero;
    }

    public String getSaque() {
        return saque;
    }

    public void setSaque(String saque) {
        this.saque = saque;
    }

    @Override
    public String toString() {
        return "Volei{" + "libero=" + libero + ", saque=" + saque + super.toString() + '}';
    }
    
    
    
}
