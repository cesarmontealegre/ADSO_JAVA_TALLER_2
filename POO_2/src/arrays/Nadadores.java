package arrays;

import java.util.Scanner;

public class Nadadores {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese la cantidad de competidores: ");
    int numCompetidores = sc.nextInt();

    String[] nombres = new String[numCompetidores];
    double[] tiempos = new double[numCompetidores];

    for (int i = 0; i < numCompetidores; i++) {
      System.out.print("Ingrese el nombre del competidor " + (i + 1) + ": ");
      nombres[i] = sc.next();
      System.out.print("Ingrese el tiempo del competidor " + (i + 1) + ": ");
      tiempos[i] = sc.nextDouble();
    }

    // Mostrar los resultados
    for (int i = 0; i < numCompetidores; i++) {
      System.out.println(nombres[i] + ": " + tiempos[i] + " segundos");
    }

    // Determinar el ganador
    int indiceGanador = 0;
    double menorTiempo = tiempos[0];
    for (int i = 1; i < numCompetidores; i++) {
      if (tiempos[i] < menorTiempo) {
        menorTiempo = tiempos[i];
        indiceGanador = i;
      }
    }

    System.out.println(
        "El ganador es " + nombres[indiceGanador] + " con un tiempo de " + tiempos[indiceGanador] + " segundos.");

    sc.close();
  }
}
