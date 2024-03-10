import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int limite = 0;

        System.out.print("Ingresa un numero: ");
        limite = entrada.nextInt();

        if (limite >= 1){

            System.out.println("Los numeros desde el 1 hasta " + limite + " son: ");

            for (int i = 1; i <= limite; i++){

                System.out.print(i + " | ");

            }

        } else {

            System.out.println("ERROR: Numero invalido. El limite debe ser mayor o igual a 1");

        }

    }

}