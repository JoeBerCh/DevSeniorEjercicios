import java.util.Scanner ;
public class VariablesTipoDatos {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Ingrese un valor: ");
        var text = scanner.nextLine();

        System.out.printf("El valor ingresado es: %s%n", text);

        scanner.close();
    }

}

