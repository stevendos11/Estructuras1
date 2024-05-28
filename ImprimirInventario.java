import javax.swing.JOptionPane;
import java.util.LinkedList;

public class ImprimirInventario {
    // Método para imprimir el inventario total de registros
    public static String imprimir(LinkedList<Registro> lista) {
        // Crear una cadena con la información de todos los registros
        StringBuilder inventario = new StringBuilder();

        // Recorrer la lista y construir la cadena
        for (Registro reg : lista) {
            inventario.append(reg.toString()).append("\n\n");
        }

        // Devolver el inventario completo como cadena de texto
        return inventario.toString();
    }
}