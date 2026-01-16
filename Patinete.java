/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public abstract class Patinete implements IRecargable{
    //Atributos
    protected String id;
    protected String modelo;
    protected int bateria;
    public static final int CARGA_BASE = 5;
   
    //Constructor
    public Patinete(String id, String modelo, int bateria){
        this.id = id;
        this.modelo = modelo;
        this.bateria = bateria;
    }
    
    //Getter
    public String getId(){
        return id;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    @Override
    public int getPorcentajeBateria(){
        return bateria;
    }
    
    //Setter 
    public void setId(String id){
        this.id = id;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public void setBateria(int bateria){
        this.bateria = bateria;
    }
    
    //Recargar
    @Override
    public int recargar(){
        this.bateria = 100;
        return bateria;
    }
    
    //Avanzar
    public int avanzar(){
        if(0 <= getPorcentajeBateria() && getPorcentajeBateria() <= 100){
        bateria = consumoPorAvanzar();
        }
        else {
         System.out.println("No se puede avanzar");
        }
        return bateria;
    }
    
    //Métodos abstractos
    public abstract int calcularAutonomia();
    public abstract int consumoPorAvanzar();
            
    //toString
    @Override
    public String toString(){
        String s = ("ID :" + getId() + ", Modelo: " + getModelo() + ", Batería: " + getPorcentajeBateria() + "%, Autonomía:" + calcularAutonomia() + "km");
        return s;
    }
}
