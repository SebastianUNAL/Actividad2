import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) throws Exception {  
        double pagototal;
        double horas_extra;
        double horas_extra2;
        Trabajador employee = new Trabajador();
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre del trabajador: ");
        employee.nombre = input.nextLine();
        System.out.println("Ingrese el numero de horas trabajadas: ");
        employee.horas_trabajadas = input.nextDouble();
        System.out.println("Ingrese el valor por hora de trabajo: ");
        employee.valor_porhora = input.nextDouble();

        if (employee.horas_trabajadas > 40 && employee.horas_trabajadas <= 48) {
            horas_extra = employee.horas_trabajadas - 40;
            pagototal = (horas_extra * (employee.valor_porhora * 2)) + (employee.valor_porhora * (employee.horas_trabajadas - horas_extra));

        } else if (employee.horas_trabajadas > 48) {
            horas_extra = 8;
            horas_extra2 = employee.horas_trabajadas - 48;
            pagototal = (horas_extra*(employee.valor_porhora * 2)) + (horas_extra2 * (employee.valor_porhora * 3)) + (employee.valor_porhora * (employee.horas_trabajadas - (horas_extra+horas_extra2)));
        } else {
            pagototal = (employee.horas_trabajadas*employee.valor_porhora);
        }       
        System.out.println("El nombre del trabajador es: " + employee.nombre);
        System.out.println("El valor del salario devengado es de: " + pagototal);       
        input.close();

    }
}
