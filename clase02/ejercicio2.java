public class ejercicio2 {
    public static void main(String[] args) {
        var precioPorKilo= 29.75;
        var precioPor100Gramos= 5.95;
        var precioPorKiloReal= precioPor100Gramos * 10;
        System.out.printf("El precio por kilo es: %.2f%n", precioPorKilo);
        System.out.printf("El precio por kilo segun el precio por 100 gramos es: %.2f%n", precioPorKiloReal);
    }
}
