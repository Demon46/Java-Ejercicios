import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double matriz[][] = new double [4][4];
        double suma = 0;
        double prom = 0;

        for (int i = 0; i < matriz.length; i++){

            System.out.println("Ingresa las calificaciones del alumno numero " + (i+1));

            for (int j = 0; j < matriz.length-1; j++){

                System.out.print("Ingresa la calificacion: ");
                matriz[i][j] = entrada.nextDouble();
                suma += matriz[i][j];

            }

            matriz[i][3] = suma / (matriz.length - 1);
            suma = 0;

        }

        System.out.println();

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                System.out.print(" | " + matriz[i][j] + " | ");
            }
            System.out.println();
        }


    }
}