import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) throws Exception {
        double valor_compra;
        double valor_final;
        double descuento;
        String colorbola;
        Scanner input = new Scanner(System.in);
        bolita bola = new bolita();
        System.out.println("Ingrese el color de la bolita: ");
        bola.color = input.nextLine();
        colorbola = bola.color;
        System.out.println("Ingrese el valor de la compra: ");
        valor_compra = input.nextDouble();
        
        if (colorbola.equals("blanca")) {
            descuento = (0);
            valor_final = (valor_compra - descuento);
        } else if (colorbola.equals("verde")) {
            descuento = (valor_compra *10/100);
            valor_final = valor_compra - descuento;
        } else if (colorbola.equals("amarilla")) {
            descuento = (valor_compra *25/100);
            valor_final = (valor_compra - descuento);
        } else if (colorbola.equals("azul")) {
            descuento = (valor_compra *50/100);
            valor_final = (valor_compra - descuento);
        } else {
            descuento = valor_compra;
            valor_final = valor_compra - descuento;
        }
        System.out.println("El valor a pagar es de: " + valor_final);
        input.close();
    }
}
