/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1_tp5;

/**
 *
 * @author MILEABI
 */
public class Subsidio {
    private double monto;
    private String motivo;
    private boolean otorgado;

    public Subsidio(double monto, String motivo) {
        this.monto = monto;
        this.motivo = motivo;
        otorgado=false;
    }

    public void setOtorgado(boolean otorgado) {
        this.otorgado = otorgado;
    }

    public double getMonto() {
        return monto;
    }

    public boolean getOtorgado() {
        return otorgado;
    }
    
    
}
