package poo.retoUnoDos.salud;
import java.util.Scanner;

public class Persona {
    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private double peso;
    private double estatura;
    private int edad;
    private String sexo;
    
    public void pedirDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tipo de documento: ");
        this.tipoDoc = sc.nextLine();
        System.out.print("Ingrese el número de documento: ");
        this.documento = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer de entrada
        System.out.print("Ingrese el nombre: ");
        this.nombre = sc.nextLine();
        System.out.print("Ingrese el apellido: ");
        this.apellido = sc.nextLine();
        System.out.print("Ingrese el peso en kg: ");
        this.peso = sc.nextDouble();
        System.out.print("Ingrese la estatura en m: ");
        this.estatura = sc.nextDouble();
        System.out.print("Ingrese la edad: ");
        this.edad = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer de entrada
        System.out.print("Ingrese el sexo: ");
        this.sexo = sc.nextLine();
        sc.close();
    }
    
    public void mostrarPersona() {
        System.out.println("Tipo de documento: " + this.tipoDoc);
        System.out.println("Número de documento: " + this.documento);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Peso: " + this.peso + " kg");
        System.out.println("Estatura: " + this.estatura + " m");
        System.out.println("Edad: " + this.edad);
        System.out.println("Sexo: " + this.sexo);
    }
    
    /*public void calcularImc() {
        double pesoActual = this.peso / Math.pow(this.estatura, 2);
        if (pesoActual < 20) {
            System.out.println("El peso está por debajo de lo ideal.");
        } else if (pesoActual >= 20 && pesoActual <= 25) {
            System.out.println("El peso es ideal.");
        } else {
            System.out.println("Tiene sobrepeso.");
        }
    }*/

    public String calcularImc() {
        double pesoActual = peso / Math.pow(estatura, 2);
        if (pesoActual < 20) {
            return "PESOBAJO";
        } else if (pesoActual >= 20 && pesoActual <= 25) {
            return "PESOIDEAL";
        } else {
            return "SOBREPESO";
        }
    }
    
    
    public boolean mayorEdad() {
        return edad >= 18;
    }
}