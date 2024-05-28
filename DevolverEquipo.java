import javax.swing.JOptionPane;
import java.util.LinkedList;

public class DevolverEquipo {
    // Método para devolver un equipo (eliminar el registro) para estudiantes de ingeniería
    public static String devolver(LinkedList<Registro> lista) {
        // Solicitar identificador (serial o cédula)
        String identificador = JOptionPane.showInputDialog("Ingrese el serial o cédula del equipo:");

        // Buscar el registro en la lista y eliminarlo
        for (Registro reg : lista) {
            if (reg.estudianteIngenieria != null && (reg.estudianteIngenieria.cedula.equals(identificador) || reg.computadorPortatil.serial.equals(identificador))) {
                lista.remove(reg);
                return "Equipo devuelto exitosamente.";
            } else if (reg.estudianteDiseno != null && (reg.estudianteDiseno.cedula.equals(identificador) || reg.tabletaGrafica.serial.equals(identificador))) {
                lista.remove(reg);
                return "Equipo devuelto exitosamente.";
            }
        }
        // Mostrar mensaje si no se encuentra el registro
        return "Registro no encontrado.";
    }
}
