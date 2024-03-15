import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        double lado;
        double perimetro;
        double altura;
        double area;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor del lado del triangulo equilatero");
        lado = entrada.nextDouble();
        perimetro = lado * 3;
        altura = ((lado * Math.sqrt(3)) / 2);
        area = ((lado * altura) / 2);
        System.out.println("El perimetro es: " + perimetro);
        System.out.println("La altura es de: " + altura);
        System.out.println("El area es de: " + area);
        entrada.close();
    }
}
