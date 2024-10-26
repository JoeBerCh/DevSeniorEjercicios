import java.util.Scanner;

public class Palabras {
    static  Scanner sc = new Scanner(System.in);    
    public static void main(String[] args) {
        
        System.out.println("Introduzca palabra 1:");
        var palabra1 = sc.nextLine();
        System.out.println("Introduzca palabra 2:");
        var palabra2 = sc.nextLine();
        System.out.println("Introduzca palabra 3:");
        var palabra3 = sc.nextLine();
        System.out.println(palabra1 + " " + palabra2 + " " + palabra3);
    }
}
