import javax.swing.JOptionPane;

public class ComputadorPortatil {
    public String serial;  // Almacena el serial del computador portátil
    public String marca;  // Almacena la marca del computador portátil
    public float tamano;  // Almacena el tamaño del computador portátil en pulgadas
    public float precio;  // Almacena el precio del computador portátil
    public String sistemaOperativo;  // Almacena el sistema operativo del computador portátil
    public String procesador;  // Almacena el procesador del computador portátil

    // Constructor para inicializar un nuevo computador portátil
    public ComputadorPortatil(String serial, String marca, float tamano, float precio, String sistemaOperativo, String procesador) {
        this.serial = serial;
        this.marca = marca;
        this.tamano = tamano;
        this.precio = precio;
        this.sistemaOperativo = sistemaOperativo;
        this.procesador = procesador;
    }

    // Método para convertir la información del computador portátil a una cadena de texto
    @Override
    public String toString() {
        return "Serial: " + serial + ", Marca: " + marca + ", Tamaño: " + tamano + " pulgadas, Precio: " + precio + ", Sistema Operativo: " + sistemaOperativo + ", Procesador: " + procesador;
    }

    // Método para seleccionar el sistema operativo
    public static String seleccionarSistemaOperativo() {
        // Opciones de sistemas operativos disponibles
        String[] opciones = {"Windows 7", "Windows 10", "Windows 11"};
        // Mostrar un cuadro de diálogo para que el usuario seleccione una opción
        return (String) JOptionPane.showInputDialog(null, "Seleccione el sistema operativo:", "Sistema Operativo", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
    }

    // Método para seleccionar el procesador
    public static String seleccionarProcesador() {
        // Opciones de procesadores disponibles
        String[] opciones = {"AMD Ryzen", "Intel® Core™ i5"};
        // Mostrar un cuadro de diálogo para que el usuario seleccione una opción
        return (String) JOptionPane.showInputDialog(null, "Seleccione el procesador:", "Procesador", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
    }
}
