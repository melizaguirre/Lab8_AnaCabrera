
import java.awt.Color;
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BAC
 */
public class Auto implements Serializable{
    private int identificacion;
    private double distanciaRecorrida;
    private String nombreCorredor;
    private Color color; 
    
    

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Auto(int identificacion, double distanciaRecorrida, String nombreCorredor, Color color) {
        this.identificacion = identificacion;
        this.distanciaRecorrida = distanciaRecorrida;
        this.nombreCorredor = nombreCorredor;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public double getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(double distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public String getNombreCorredor() {
        return nombreCorredor;
    }

    public void setNombreCorredor(String nombreCorredor) {
        this.nombreCorredor = nombreCorredor;
    }

    @Override
    public String toString() {
        return "Auto{" + "identificacion=" + identificacion + ", distanciaRecorrida=" + distanciaRecorrida + ", nombreCorredor=" + nombreCorredor + '}';
    }
   
    
}
