import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombre = "Tommy Stark";
        String tipoDeCuenta = "corriente";
        double saldo = 1599.99;
        int opcion =0;

        System.out.println("********************************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("El tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("Su saldo disponible es: " + saldo + " Soles");
        System.out.println("\n********************************************");

        String menu = """
                *** Escribe el numero de la opción deseada ***
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El saldo actualizado es " + saldo + " soles");
                    break;
                case 2:
                    System.out.println("Cual es el valor que desea retirar");
                    double valorRetirar = teclado.nextDouble();

                    if (valorRetirar > saldo) {
                        System.out.println("Saldo insuficiente");

                    } else {
                        saldo -= valorRetirar;
                        System.out.println("El salso actualizado es: " + saldo);

                    }
                    break;
                case 3:
                    System.out.println("¿Cual es el valor que sea depositar");
                    double valorADepositar = teclado.nextDouble();

                    saldo += valorADepositar;
                    System.out.println("El saldo actualizado es: " + saldo);
                    break;

                case 9:
                    System.out.println("Saliendo del programa, gracias por utilizar nuestros servicios");
                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;


            }



        }



    }
}