package jardines_sincronizado;

// Clase derivada de Thread que define un hilo
public class Entra_Jardin extends Thread {

    private RecursoJardin jardin; // Recurso compartido

    public Entra_Jardin(String nombre, RecursoJardin jardin) {
        this.setName(nombre); // Establece el nombre del hilo, setName es un método de la clase Thread
        this.jardin = jardin;
    }

    // Método que ejecuta el hilo
    public void run() {
        jardin.incrementaCuenta(); // Incrementa la cuenta de personas en el jardín
    }

}
