public class main {
    static void main(String[] args) {

        Vino cabernetFranc = new Vino(
                "Cabernet Franc",
                "Tinto",
                5500,
                60
        );

        cabernetFranc.mostrarInventario();

        cabernetFranc.venderBotellas(30);

        cabernetFranc.reponerStock(15);

        cabernetFranc.mostrarInventario();
    }
}
