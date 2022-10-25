package jardines_sincronizado;

public class Main {

    public static void main(String[] args) {
        RecursoJardin jardin = new RecursoJardin(); // Recurso compartido

        // Entran 10 hilos al jardín
        for (int i = 0; i < 10; i++) {
            Entra_Jardin hilo = new Entra_Jardin("Entra " + i, jardin);
            hilo.start();
        }

        // Salen 15 hilos del jardín
        for (int i = 0; i < 15; i++) {
            Sale_Jardin hilo = new Sale_Jardin("Sale " + i, jardin);
            hilo.start();
        }
    }
}
