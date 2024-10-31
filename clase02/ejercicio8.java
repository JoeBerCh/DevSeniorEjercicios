import java.util.Scanner;

public class ejercicio8 {
    static  Scanner sc = new Scanner(System.in); 
    public static void main(String[] args) {
        System.out.println("Por favor ingrese el ancho del rectangulo: ");
        var ancho= sc.nextInt();
        System.out.println("Por favor ingrese la longitud del rectangulo: ");
        var longitud= sc.nextInt();
        System.out.println("Los resultados del rectangulo son: ");
        System.out.printf("Area: %d%n", ancho * longitud);
        System.out.printf("Perimetro: %d%n", 2*(ancho + longitud));
    }
}
