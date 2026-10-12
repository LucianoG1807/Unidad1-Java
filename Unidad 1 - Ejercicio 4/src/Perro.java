import jdk.swing.interop.SwingInterOpUtils;

public class Perro {

    private String nombre ;
    private String raza;
    private int edadAnios;
    private double pesoKg;

    Perro (String nonbre, String raza, int edadAnios, double pesoKg) {
        this.nombre = nonbre;
        this.raza = raza;
        this.edadAnios = edadAnios;
        this.pesoKg = pesoKg;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdadAnios() {
        return edadAnios;
    }
    public void setEdadAnios(int edadAnios) {
        this.edadAnios = edadAnios;
    }

    public double getPesoKg() {
        return pesoKg;
    }
    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    void requiereRevisionAnual() {
        if (edadAnios > 7) {
            System.out.println("===== VETERINARIA DOGCAT =====");
            System.out.println("ANIMAL : PERRO");
            System.out.println("RAZA: " + raza);
            System.out.println("NOMBRE: " + nombre);
            System.out.println("EDAD: " + edadAnios);
            System.out.println("SE REQUIERE UNA REVISION ANUAL.");
            System.out.println("===============================");
        }
        else {
            System.out.println("===== VETERINARIA DOGCAT =====");
            System.out.println("ANIMAL : PERRO");
            System.out.println("RAZA: " + raza);
            System.out.println("NOMBRE: " + nombre);
            System.out.println("EDAD: " + edadAnios);
            System.out.println("===============================");
            System.out.println("=== COMPROBANTE DE CONSULTA ===");
            System.out.println("===============================");
        }
    }
}
