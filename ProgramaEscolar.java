import java.util.Scanner;

public class ProgramaEscolar {
    
    public static double calculaPromedio(String calificacion1, String calificacion2, String calificacion3) {
	double cal1 = Double.parseDouble(calificacion1);
	double cal2 = Double.parseDouble(calificacion2);
	double cal3 = Double.parseDouble(calificacion3);
	return ((cal1 + cal2 + cal3) / 3);
    }

    public static String mostrarEstado(double promedio) {
	if (promedio >= 6) return "APROBADO";
	return "NO APROBADO";
    }

    public static boolean validaCalificacion(String calificacion) {
	if (calificacion.trim().isEmpty()) return false;
	double calificacionNumerica;
	try {
	    calificacionNumerica = Double.parseDouble(calificacion);
	} catch (NumberFormatException e) {
	    return false;
	}
	return validaRango(calificacionNumerica);
    }
    
    public static boolean validaRango(double calificacion) {
	if (calificacion < 0 || calificacion > 10) return false;
	else return true;
    }

    public static boolean validaNombre(String nombre) {
        if (nombre.trim().isEmpty()) return false;
	for (int i = 0; i < nombre.length(); i++) {
	    char letraActual = nombre.charAt(i);
	    if (!Character.isLetter(letraActual) && letraActual != ' ') return false;
	}
	return true;
    }
    
    public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int validacion;
	
        System.out.print("\nPROGRAMA ESCOLAR\n\nEscribe tu NOMBRE: ");
        String nombre = sc.nextLine();
	while (!validaNombre(nombre)) {
	    System.out.println("Por favor ingresa un nombre con sólo letras y sin espacios");
	    nombre = sc.nextLine();
	}

        System.out.print("\nEscribe tu primer CALIFICACIÓN: ");
        String calificacion1 = sc.nextLine();
	while (!validaCalificacion(calificacion1)) {
	    System.out.println("Por favor ingresa un número entre 0 y 10");
	    calificacion1 = sc.nextLine();
	}

	System.out.print("\nEscribe tu segunda CALIFICACIÓN: ");
        String calificacion2 = sc.nextLine();
	while (!validaCalificacion(calificacion2)) {
	    System.out.println("Por favor ingresa un número entre 0 y 10");
	    calificacion2 = sc.nextLine();
	}

	System.out.print("\nEscribe tu tercer CALIFICACIÓN: ");
        String calificacion3 = sc.nextLine();
	while (!validaCalificacion(calificacion3)) {
	    System.out.println("Por favor ingresa un número entre 0 y 10");
	    calificacion3 = sc.nextLine();
	}

	System.out.println("\nNombre: " + nombre + ", calificación 1: " + calificacion1 + ", calificación 2: " + calificacion2 + ", calificación 3: " + calificacion3 + ", promedio: " + calculaPromedio(calificacion1, calificacion2, calificacion3) + ", estado: " + mostrarEstado(calculaPromedio(calificacion1, calificacion2, calificacion3)) + "\n");
    }
}
