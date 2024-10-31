import java.util.Scanner;
public class ejercicio9 {
    static  Scanner sc = new Scanner(System.in); 
    public static void main(String[] args) {
        System.out.println("Ingrese una temperatura en grados celcius:");
        var temperatura = sc.nextDouble();
        var temperaturaFahrenheit = (temperatura * 9/5) + 32;
        System.out.printf("La temperatura en grados fahrenheit es: %.2f%n", temperaturaFahrenheit);
        var temperaturaKelvin =(temperatura +273.15) ;
        System.out.printf("La temperatura en grados kelvin es: %.2f%n", temperaturaKelvin);
    }
}
