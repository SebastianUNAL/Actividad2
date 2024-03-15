public class TrianguloRectangulo {
    int base;
    int altura;
    public TrianguloRectangulo(int G, int H) {
        base = G;
        altura = H;
    }
    double calcArea() {
        return(base * altura / 2);
    }
    double calcPerimetro() {
        return (base + altura + calcHipotenusa());
    }
    double calcHipotenusa() {
        return Math.pow(base * base + altura * altura, 0.5);
    }
    void determinarTipoTriángulo() {
        if ((base == altura) && (base == calcHipotenusa()) && (altura == calcHipotenusa())) {
            System.out.println("Es un triangulo equilátero");

        } else if ((base != altura) && (base != calcHipotenusa()) && (altura != calcHipotenusa())) {
            System.out.println("Es un triangulo escaleno");
            
        } else {
            System.out.println("Es un triángulo isósceles");
        }
    }
}