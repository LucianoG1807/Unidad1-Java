public class ReservarAirbnb {

    // atributos
    private String nombreHuesped ;
    private int noches ;
    private double precioPorNoche ;


    // constructor
    public ReservarAirbnb (String nombreHuesped, int noches, double precioPorNoche) {
        this.nombreHuesped = nombreHuesped;
         {
             if (noches > 0 && precioPorNoche > 0)  {
                 this.noches = noches;
                 this.precioPorNoche = precioPorNoche;
             }
             else {
                 System.out.println("NOCHES Y/O PRECIO INVALIDO.");
             }
        }
    }

    // metodos
    double calcularTotal () {
      var total =  noches * precioPorNoche;
        System.out.println("PRECIO FINAL: $" + total);
        return total;
    }

    void mostrarDetalle() {

        System.out.println("NOMBRE: " + nombreHuesped);
        System.out.println("CANITDAD DE NOCHES: " + noches);
        System.out.println("PRECIO: " + precioPorNoche);
        calcularTotal();
    }

}

