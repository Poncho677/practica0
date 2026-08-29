import java.util.Scanner;

public class Programa {

    static double promedio;
    static double calificacion1;
    static double calificacion2;
    static double calificacion3;
    static boolean estado;
    static int validacion;
    
    public static void calculaPromedio(double calificacion1, double calificacion2, double calificacion3) {
	promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
    }

    public static void mostrarEstado(double promedio) {
	if (promedio >= 6) estado = true;
    }

    public static int validaCalificacion(double calificacion) {
        if (calificacion < 0 || calificacion > 10) {
            return 0;
        }
        return 1;
    }
    
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

        System.out.print("Sistema escolar.\nEscribe tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Escribe tu primer calificación: ");
        calificacion1 = sc.nextDouble();
	validacion = validaCalificacion(calificacion1);
	if (validacion == 0) {
	    System.out.println("Tu calificación no debe ser negativa ni mayor a 10");
	    System.exit(1);
	}

	System.out.print("Escribe tu segunda calificación: ");
        calificacion2 = sc.nextDouble();
	validacion = validaCalificacion(calificacion2);
	if (validacion == 0) {
	    System.out.println("Tu calificación no debe ser negativa ni mayor a 10");
	    System.exit(1);
	}

	System.out.print("Escribe tu tercer calificación: ");
        calificacion3 = sc.nextDouble();
	validacion = validaCalificacion(calificacion3);
	if (validacion == 0) {
	    System.out.println("Tu calificación no debe ser negativa ni mayor a 10");
	    System.exit(1);
	}
	
	calculaPromedio(calificacion1, calificacion2, calificacion3);
	mostrarEstado(promedio);
	System.out.println("Nombre: " + nombre + ", calificación 1: " + calificacion1 + ", calificación 2: " + calificacion2 + ", calificación 3: " + calificacion3 + ", promedio: " + promedio + ", estado: " + estado);
    }
}
