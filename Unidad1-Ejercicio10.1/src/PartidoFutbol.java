public class PartidoFutbol {

    private String equipoLocal;
    private String equipoVisitante;
    private int golesLocal;
    private int golesVisitante;

    public PartidoFutbol(String equipoLocal, String equipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.golesLocal = 0;
        this.golesVisitante = 0;
    }

    public void golLocal() {
        golesLocal++;
    }

    public void golVisitante() {
        golesVisitante++;
    }

    public void mostrarResultado() {
        System.out.println(equipoLocal + " " + golesLocal + " - " + golesVisitante + " " + equipoVisitante);
    }
}