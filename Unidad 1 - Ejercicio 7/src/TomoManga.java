public class TomoManga {

    String tituloObra;
    int numeroVolumen;
    double precioCompra;
    boolean leido;

    public TomoManga (String tituloObra, int numeroVolumen, double precioCompra) {

        this.tituloObra = tituloObra;

        if (precioCompra > 0 && numeroVolumen > 0) {
            this.numeroVolumen = numeroVolumen;
            this.precioCompra = precioCompra;
        }

        this.leido = false;
    }

    void marcarComoLeido() {
        this.leido = true;
    }

    void estadoLectura() {
        if (leido) {
            System.out.println("LECTURA FINALIZADA.");
        }
        else {
            System.out.println("LECTURA PENDIENTE.");
        }
    }
}
