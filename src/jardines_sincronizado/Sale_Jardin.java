package jardines_sincronizado;

public class Sale_Jardin extends Thread {

    private RecursoJardin jardin; // Recurso compartido

    public Sale_Jardin(String nombre, RecursoJardin jardin) {
        this.setName(nombre); // Establece el nombre del hilo, setName es un método de la clase Thread
        this.jardin = jardin;
    }

    // Método que ejecuta el hilo
    public void run() {
        jardin.decrementaCuenta(); // Decrementa la cuenta de personas en el jardín
    }

}

