public class main {

    public static void main(String[] args) {

        MembresiaGimnasio membresia = new MembresiaGimnasio(
                "42863987",
                "Lionel Messias"
        );

        membresia.pagarCuota();
        membresia.mostrarInformacion();
        System.out.println(" ");
        membresia.registrarVencimiento();
        membresia.mostrarInformacion();
    }
}