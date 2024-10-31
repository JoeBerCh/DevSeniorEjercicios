public class ejercicio5 {
    public static void main(String[] args) {
        var totalPrecio= 660;
        var precioDescuento= totalPrecio * 0.1;
        var precioFinal= totalPrecio - precioDescuento;
        System.out.printf("El precio con descuento es %.2f%n: ", precioFinal);
    }
}
