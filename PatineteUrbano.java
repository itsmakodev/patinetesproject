/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class PatineteUrbano extends Patinete {

    public PatineteUrbano(String id, String modelo, int bateria) {
        super(id, modelo, bateria);
    }
    
    @Override
    public int calcularAutonomia(){
    int autonomia = (CARGA_BASE + (getPorcentajeBateria()/10));
    return autonomia;
    }
    
    @Override
    public int consumoPorAvanzar(){
        return (getPorcentajeBateria() - 10);
    }
    
    @Override
    public String toString(){
        String s = ("Patinete Urbano - " + super.toString());
        return s;
    }
}
