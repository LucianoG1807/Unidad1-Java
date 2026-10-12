public class Main {
    static void main(String[] args) {

        TermometroIoT termometro = new TermometroIoT(
               530
        );

        System.out.println("TEMPERATURA EN CELSIUS: " + termometro.getTempraturaCelsius() + " °C");
        System.out.println("TEMPERATURA EN FAHRENHEIT: " + termometro.obtenerFahrenheit() + " °F");
    }
}
