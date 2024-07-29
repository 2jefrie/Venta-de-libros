package VentaDeLibros;

public class libros{
    public static void main(String[] args) {
        Libro libro1 = new Libro("Romeo y Julieta", "William Shakespeare", 220.00);
        libro1.mostrarDetalles();
    
        libro1.actualizarPrecio(  120.00);
        libro1.mostrarDetalles();
    }
}