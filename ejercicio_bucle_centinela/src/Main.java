import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String palabra = "";

        System.out.println("Ingresa la palabra hasta salir del bucle");

        while (!palabra.equals("salir")){

            palabra = entrada.next();
            palabra = palabra.toLowerCase();
            System.out.println("!" + palabra);

        }

        

    }

}