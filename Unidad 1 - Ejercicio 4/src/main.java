public class main {
    static void main(String[] args) {

        Perro perro1 = new Perro(
                "Milanesa",
                "Dogo argentino",
                9,
                75
        );

        Perro perro2 = new Perro(
                "Arena",
                "Pitbull",
                2,
                20
        );

        perro1.requiereRevisionAnual();
        System.out.println(" ");
        perro2.requiereRevisionAnual();
    }
}
