import javax.swing.JOptionPane;
import java.util.LinkedList;

public class BuscarEquipo {
    // Método para buscar un equipo por serial o cédula para estudiantes de ingeniería
    public static String buscar(LinkedList<Registro> lista) {
        // Solicitar identificador (serial o cédula)
        String identificador = JOptionPane.showInputDialog("Ingrese el serial o cédula del equipo:");

        // Buscar el registro en la lista
        for (Registro reg : lista) {
            if (reg.estudianteIngenieria != null && (reg.estudianteIngenieria.cedula.equals(identificador) || reg.computadorPortatil.serial.equals(identificador))) {
                // Mostrar la información del registro si se encuentra
                return "Equipo encontrado: \n" + reg.toString();
            } else if (reg.estudianteDiseno != null && (reg.estudianteDiseno.cedula.equals(identificador) || reg.tabletaGrafica.serial.equals(identificador))) {
                // Mostrar la información del registro si se encuentra
                return "Equipo encontrado: \n" + reg.toString();
            }
        }
        // Mostrar mensaje si no se encuentra el registro
        return "Equipo no encontrado.";
    }
}
