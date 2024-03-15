import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) throws Exception {
        double salario_total;
        Scanner input = new Scanner(System.in);
        Empleado employee = new Empleado();
        System.out.println("Ingrese el nombre del empleado: ");
        employee.nombre = input.nextLine();
        System.out.println("Ingrese el salario por hora: ");
        employee.salario_hora = input.nextDouble();
        System.out.println("Ingrese el numero de horas trabajadas: ");
        employee.horas_trabajadas = input.nextDouble();
        
        salario_total = (employee.horas_trabajadas * employee.salario_hora);

        if (salario_total > 450000) {
            System.out.println("El nombre del empleado es: " + employee.nombre);
            System.out.println("El salario mensual es de: " + salario_total);
        } else {
            System.out.println("El nombre del empleado es: " + employee.nombre);
        }
        input.close();
    }
}
