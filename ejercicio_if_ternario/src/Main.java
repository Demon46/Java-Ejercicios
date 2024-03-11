import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double promedio;
        String condicionFinal;

        System.out.print("Ingresa el promedio general: ");
        promedio = entrada.nextDouble();

        condicionFinal = promedio >= 6 ? "Aprobado" : "Reprobado";

        System.out.println("El alumno tiene un estatus de " + condicionFinal);

    }
}