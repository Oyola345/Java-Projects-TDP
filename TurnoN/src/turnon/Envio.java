/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turnon;

/**
 *
 * @author MILEABI
 */
public class Envio {
    private String origen;
    private String destino;
    private double monto;
    private double costoOp;

    public Envio(String origen, String destino, double monto, double costoOp) {
        this.origen = origen;
        this.destino = destino;
        this.monto = monto;
        this.costoOp = costoOp;
    }

    public double getMonto() {
        return monto;
    }

    public double getCostoOp() {
        return costoOp;
    }
    
    
}
