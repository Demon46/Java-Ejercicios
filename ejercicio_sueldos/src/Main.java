import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int tipo = 0;
        double sueldo = 0;

        System.out.println("Tipo de empleado: ");
        System.out.println("1.- Repositor");
        System.out.println("2.- Cajero");
        System.out.println("3.- Supervisor");

        System.out.print("Ingresa el tipo de empleado que quieras ingresar: ");
        tipo = entrada.nextInt();

        switch (tipo){

            case 1:

                System.out.print("Ingresa sueldo: ");
                sueldo = entrada.nextDouble();

                sueldo += (sueldo * .10);

                System.out.print("El repositor gana ");
                System.out.printf("%.2f", sueldo);

                break;

            case 2:

                System.out.print("Ingresa sueldo: ");
                sueldo = entrada.nextDouble();

                System.out.print("El cajero gana ");
                System.out.printf("%.2f", sueldo);

                break;

            case 3:

                System.out.print("Ingresa sueldo: ");
                sueldo = entrada.nextDouble();

                sueldo -= (sueldo * .11);

                System.out.print("El supervisor gana ");
                System.out.printf("%.2f", sueldo);

                break;

            default:

                System.out.println("ERROR: Opcion no valida");

                break;

        }

    }

}