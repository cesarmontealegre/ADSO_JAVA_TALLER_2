package poo.retoUnoDos.principal;

import poo.retoUnoDos.salud.Persona;

public class Inicio {
  public static void main(String[] args) {
    // Crear objetos de la clase Persona
    /*Persona persona1 = new Persona();
    Persona persona2 = new Persona();*/

    // Llamar a los métodos de la clase Persona para cada objeto
    /*
     * persona1.pedirDatos();
     * persona1.mostrarPersona();
     * persona1.calcularImc();
     * persona1.mayorEdad();
     * 
     * persona2.pedirDatos();
     * persona2.mostrarPersona();
     * persona2.calcularImc();
     * persona2.mayorEdad();
     */

    Persona persona1 = new Persona();
    persona1.pedirDatos();
    persona1.mostrarPersona();

    String imc = persona1.calcularImc();
    if (imc.equals("PESOBAJO")) {
      System.out.println("El peso está por debajo de lo ideal");
    } else if (imc.equals("PESOIDEAL")) {
      System.out.println("El peso es ideal");
    } else {
      System.out.println("Tiene sobrepeso");
    }

    if (persona1.mayorEdad()) {
      System.out.println("Es mayor de edad");
    } else {
      System.out.println("Es menor de edad");
    }
  }
}