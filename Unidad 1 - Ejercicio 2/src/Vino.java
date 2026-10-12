public class Vino {

    String etiqueta;
    String varietal;
    double precio;
    int stockBotellas;

    // Incorporar un constructor que reciba todos los parámetros, asegurando que el stock inicial no sea negativo.

    public Vino (String etiqueta, String varietal, double precio, int stockBotellas){
        this.etiqueta = etiqueta;
        this.varietal = varietal;
        this.precio = precio;

        if (stockBotellas > 0) {
            this.stockBotellas = stockBotellas;
        }
        else {
            System.out.println("STOCK INVALIDO.");
        }
    }

   // Implementar los métodos venderBotellas(int cantidad) (verificando que haya stock suficiente) y reponerStock(int cantidad).

    void venderBotellas(int cantidad) {
        if (stockBotellas >= cantidad) {
            System.out.println("VENTA EXITOSA.");
            stockBotellas = stockBotellas - cantidad;
            System.out.println("DISPONIBLES: " + stockBotellas);
        }
        else {
            System.out.println("STOCK INSUFICIENTE.");
        }
    }

    void reponerStock (int cantidad) {
        stockBotellas = stockBotellas + cantidad;
        System.out.println("REPOSITORIO EXITOSO.");
        System.out.println("STOCK ACTUAL: " + stockBotellas);
    }

    void mostrarInventario() {
        System.out.println("VINO: " + etiqueta);
        System.out.println("VARIETAL: " + varietal);
        System.out.println("PRECIO: $" + precio);
        System.out.println("STOCK DISPONIBLE: " + stockBotellas);
    }

}
