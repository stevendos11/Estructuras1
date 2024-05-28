import javax.swing.JOptionPane;

public class TabletaGrafica {
    public String serial;  // Almacena el serial de la tableta gráfica
    public String marca;  // Almacena la marca de la tableta gráfica
    public float tamano;  // Almacena el tamaño de la tableta gráfica en pulgadas
    public float precio;  // Almacena el precio de la tableta gráfica
    public String almacenamiento;  // Almacena la capacidad de almacenamiento de la tableta gráfica
    public float peso;  // Almacena el peso de la tableta gráfica en kg

    // Constructor para inicializar una nueva tableta gráfica
    public TabletaGrafica(String serial, String marca, float tamano, float precio, String almacenamiento, float peso) {
        this.serial = serial;
        this.marca = marca;
        this.tamano = tamano;
        this.precio = precio;
        this.almacenamiento = almacenamiento;
        this.peso = peso;
    }

    // Método para convertir la información de la tableta gráfica a una cadena de texto
    @Override
    public String toString() {
        return "Serial: " + serial + ", Marca: " + marca + ", Tamaño: " + tamano + " pulgadas, Precio: " + precio + ", Almacenamiento: " + almacenamiento + ", Peso: " + peso + " kg";
    }

    // Método para seleccionar el almacenamiento
    public static String seleccionarAlmacenamiento() {
        // Opciones de almacenamiento disponibles
        String[] opciones = {"256 GB", "512 GB", "1 TB"};
        // Mostrar un cuadro de diálogo para que el usuario seleccione una opción
        return (String) JOptionPane.showInputDialog(null, "Seleccione el almacenamiento:", "Almacenamiento", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
    }
}

