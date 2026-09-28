import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String cliente;
        int compra;
        double descuento;
        double valorDescontado;
        double totalPagar;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre del cliente: ");
        cliente = scanner.nextLine();
        System.out.println("Ingrese el valor de la compra:");
        compra = scanner.nextInt();

        scanner.close();

        if (compra >= 300000) {
            descuento = 0.2;
        } else if (compra >=  200000) {
            descuento = 0.15;
        } else if (compra >= 100000) {
            descuento = 0.1;
        } else {
            descuento = 0;
        }

        valorDescontado = compra*descuento;
        totalPagar = compra-valorDescontado;

        System.out.println("========= RESUMEN DE COMPRA =========\n");
        System.out.println("Cliente: " + cliente);
        System.out.println("Valor de compra: $" + compra);
        System.out.println("Descuento: " + descuento*100 + "%");
        System.out.println("Valor descontado: $" + valorDescontado);
        System.out.println("Total a pagar: $" + totalPagar + "\n");
        System.out.println("===== ¡Gracias por su compra! =====");

    }
}