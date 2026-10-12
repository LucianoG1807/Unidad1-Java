public class MembresiaGimnasio {

    private String dniSocio;
    private String nombreCompleto;
    private boolean cuotaAlDia;

    public MembresiaGimnasio(String dniSocio, String nombreCompleto) {
        this.dniSocio = dniSocio;
        this.nombreCompleto = nombreCompleto;
        this.cuotaAlDia = false;
    }

    public void pagarCuota() {
        cuotaAlDia = true;
    }

    public void registrarVencimiento() {
        cuotaAlDia = false;
    }

    public void mostrarInformacion() {
        System.out.println("DNI: " + dniSocio);
        System.out.println("Nombre: " + nombreCompleto);
        System.out.println("Cuota al día: " + cuotaAlDia);
    }
}