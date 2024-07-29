package VentaDeLibros; nm

public class Libro {
    String titulo;
    String autor;
    double precio; // Changed to double for better precision

    public Libro(String titulo, String autor, double precio){
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public void mostrarDetalles() {
        System.out.println("El titulo del libro es " + titulo + " el autor del libro es " + autor + " y cuesta Q " + precio);
    }

    public void actualizarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }
}