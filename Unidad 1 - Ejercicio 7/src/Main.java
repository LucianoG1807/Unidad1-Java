public class Main {
    static void main(String[] args) {

        /*
        En el método main, crear un objeto TomoManga (por ejemplo, volumen 3),
        marcarlo como leído y mostrar su estado actualizado en consola.
         */

        TomoManga volumen3 = new TomoManga(
                "Spider Man vs The fantastic four",
                3,
                10000
        );

        volumen3.estadoLectura();
        volumen3.marcarComoLeido();
        volumen3.estadoLectura();
    }
}
