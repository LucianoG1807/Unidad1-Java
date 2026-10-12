public class main {
    static void main(String[] args) {

        EstudianteUniversitario estudiante1 = new EstudianteUniversitario(
                "A123456",
                "Luciano Gonzalez",
                5
        );

        EstudianteUniversitario estudiante2 = new EstudianteUniversitario(
                "B123456",
                "Fiamma Sosa",
                10
        );


        System.out.println("ESTUDIANTE 1. CALIFICACION FINAL:");
        System.out.println(estudiante1.getCalificacionFinal());
        System.out.println("APRUEBA:");
        System.out.println(estudiante1.estaAprobado());

        System.out.println("ESTUDIANTE 2. CALIFICACION FINAL:");
        System.out.println(estudiante2.getCalificacionFinal());
        System.out.println("APRUEBA:");
        System.out.println(estudiante2.estaAprobado());
    }
}
