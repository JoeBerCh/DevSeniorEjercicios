public class ejercicio6 {
    public static void main(String[] args) {
        var precioPantalonDescuento= 34;
        var descuento= 0.15;
        var precioSinDescuento= precioPantalonDescuento/(1-(descuento/1)) ;
        System.out.printf("El precio sin descuento es %.2f%n: ", precioSinDescuento);
    }
}
