import java.util.Scanner;
public class ejercicio10 {
    static  Scanner sc = new Scanner(System.in); 
    public static void main(String[] args) {
        System.out.println("Por favor ingrese el primer numero a operar: ");
        var n1= sc.nextFloat();
        System.out.println("Por favor ingrese el segundo numero a operar: ");
        var n2= sc.nextFloat();
        System.out.println("Por favor ingrese el tercer numero a operar: ");
        var n3= sc.nextFloat();
        System.out.println("La media aritmetica de los numeros ingresados es: ");
        
        System.out.printf("%.2f%n", (n1 + n2 + n3) / 3);

        

    } 
    
}
