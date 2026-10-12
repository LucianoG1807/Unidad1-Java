public class TermometroIoT {
    private double tempraturaCelsius;

    public TermometroIoT (double tempraturaCelsius) {
        this.tempraturaCelsius = tempraturaCelsius;
    }

    public double getTempraturaCelsius() {
        return tempraturaCelsius;
    }

    double obtenerFahrenheit() {
        return tempraturaCelsius * 9 / 5 + 32;
    }
}
