/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class EstacionRecarga {
    private String nombreEstacion;
    
    public EstacionRecarga(String nombreEstacion){
        this.nombreEstacion = nombreEstacion;
    }
    
    public String getNombreEstacion(){
        return nombreEstacion;
    }
    
    public void setNombreEstacion(){
        this.nombreEstacion = nombreEstacion;
    }
    
    public int calcularTiempoRecarga(IRecargable o){
        int tiempoRecarga = o.getPorcentajeBateria()/2;
        return tiempoRecarga;
    }
}
