public class main {

    public static void main(String[] args) {

        PartidoFutbol partido = new PartidoFutbol("Argentina", "Francia");

        partido.golLocal();
        partido.golLocal();
        partido.golVisitante();
        partido.golVisitante();
        partido.golLocal();

        partido.mostrarResultado();
    }
}