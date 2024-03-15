public class Rectangulo {
    int base;
    int altura;
    Rectangulo (int Y, int Z) {
        base = Y;
        altura = Z;
    }
    double calcArea() {
        return base * altura;
    }
    double calcPerimetro() {
        return (2 * base) + (2 * altura);
    }
}
