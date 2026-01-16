/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class PatineteDeportivo extends Patinete implements IRecargable{
    
    //Atributos
    private int potenciaMotor;
    private static final int MAX_POTENCIA = 150;

    //Constructor
    public PatineteDeportivo(String id, String modelo, int bateria, int potenciaMotor) {
        super(id, modelo, bateria);
        this.potenciaMotor = potenciaMotor;
    }

    //getPotenciaMotor y setPotenciaMotor
    
    public int getPotenciaMotor(){
        if(potenciaMotor < 0 || potenciaMotor > MAX_POTENCIA){ 
            System.out.println("Error: La potencia debe estar comprendida entren 0 y 150");
        }
        return potenciaMotor;
    }
    
    public void setPotenciaMotor(int potenciaMotor){
        this.potenciaMotor = potenciaMotor;
    }
    //CalcularAutonomía
    
    @Override
    public int calcularAutonomia(){
        int autonomia = ((CARGA_BASE) + (getPorcentajeBateria()/10) + (getPotenciaMotor()/50));
        return autonomia;
    }
    
    @Override
    public int consumoPorAvanzar(){
        return (getPorcentajeBateria() - 15);
    }
    
    @Override
    public int recargar(){
        this.bateria = 100;
        return bateria;
    }
    
    @Override
    public String toString(){
        String s = ("Patinete Deportivo - " + super.toString() + ", Potencia:" + getPotenciaMotor());
        return s;
    }
}
