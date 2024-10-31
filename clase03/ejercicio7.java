import java.util.Scanner;
public class ejercicio7 {
    static  Scanner sc = new Scanner(System.in);  
    public static void main(String[] args) {
        System.out.println("Por favor ingrese el primer numero a operar: ");
        var n1= sc.nextFloat();
        System.out.println("Por favor ingrese el segundo numero a operar: ");
        var n2= sc.nextFloat();
        System.out.println("Los resultados de los numeros ingresados son: ");
        System.out.printf("Suma: %.0f%n", n1 + n2);
        System.out.printf("Resta: %.0f%n", n1 - n2);
        System.out.printf("Multiplicacion: %.0f%n", n1 * n2);
        System.out.printf("Division: %.2f%n",  (n1 / n2));
    }
}
