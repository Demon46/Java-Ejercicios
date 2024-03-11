import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int vector [] = new int[15];
        int cont = 0;

        for (int i = 0; i < vector.length; i++){

            System.out.print("Ingresa el valor de la posicipm " + i);
            vector[i] = entrada.nextInt();

            if (vector[i] == 3){

                cont += 1;

            }

        }

        System.out.println("Hay " + cont + " numeros 3 dentro del arreglo");

    }
}