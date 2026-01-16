/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ndiaz
 */


public class Principal {
    public static void main(String[] args) {
        // Crear y mostrar un patinete urbano
        PatineteUrbano urbano = new PatineteUrbano("PUO01", "Urbarox", 50);
        System.out.println("\nInformación Patinete Urbano:");
        System.out.println("-ID: " + urbano.getId() + "Batería: " + urbano.getPorcentajeBateria());
        System.out.println("Autonomía: " + urbano.calcularAutonomia() + " km");
        
        // Demostración de avanzar en el patinete urbano
        urbano.avanzar();
        System.out.println("\nDespués de avanzar:");
        System.out.println("El patinete ha avanzado. Batería restante: " + urbano.getPorcentajeBateria());
        
        // Crear y mostrar un patinete deportivo
        PatineteDeportivo deportivo = new PatineteDeportivo("PDO01", "Sportx", 25, 120) ;
        System.out.println("\nInformación Patinete Deportivo:");
        System.out.println("-ID: " + deportivo.getId() + "Batería¨: " + deportivo.getPorcentajeBateria() + "Potencia: " + deportivo.getPotenciaMotor());
        System.out.println("Autonomía: " + deportivo.getPorcentajeBateria() + " km");
        
        // Demostración de avanzar en el patinete deportivo
        deportivo.avanzar();
        System.out.println("\nDespués de avanzar:");
        System.out.println("El patinete ha avanzado. Batería restante: " + deportivo.getPorcentajeBateria());
        
        // Demostración de la estación de recarga y cálculo del tiempo de recarga
        EstacionRecarga estacion = new EstacionRecarga("Estación Central");
        int tiempoUrbano = 120;
        int tiempoDeportivo = 150;
        System.out.println("\nEstación de recarga: " +  estacion.getNombreEstacion());
        System.out.println("Tiempo de recarga para Patinete Urbano: " + tiempoUrbano + " minutos");
        System.out.println("Tiempo de recarga para Patinete Deportivo: " + tiempoDeportivo + " minutos");
        
        // Demostración del método recargar
        urbano.recargar();
        deportivo.recargar();
        System.out.println("\nDespués de recargar:");
        System.out.println(urbano.toString());
        System.out.println(deportivo.toString());
    }
}


