import java.io.File;
import java.io.FileWriter;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class ExportarEstudiantes {

    // Método para exportar la lista de registros de estudiantes a un archivo
    public static void exportarEstudiantes(LinkedList<Registro> lista) {
        try {
            // Crear o abrir el archivo "RegistrosEstudiantes.txt"
            File archivo = new File("RegistrosEstudiantes.txt");
            // FileWriter permite escribir caracteres en el archivo
            FileWriter exportar = new FileWriter(archivo, archivo.exists());

            // Recorrer la lista de registros y escribir sus datos en el archivo
            for (Registro reg : lista) {
                if (reg.estudianteIngenieria != null) {
                    exportar.write("Ingenieria\n");
                    exportar.write("Cédula: " + reg.estudianteIngenieria.cedula + "\n");
                    exportar.write("Nombre: " + reg.estudianteIngenieria.nombre + "\n");
                    exportar.write("Apellido: " + reg.estudianteIngenieria.apellido + "\n");
                    exportar.write("Teléfono: " + reg.estudianteIngenieria.telefono + "\n");
                    exportar.write("Número de Semestre: " + reg.estudianteIngenieria.numeroSemestre + "\n");
                    exportar.write("Promedio Acumulado: " + reg.estudianteIngenieria.promedioAcumulado + "\n");
                    exportar.write("Serial: " + reg.computadorPortatil.serial + "\n");
                    exportar.write("Marca: " + reg.computadorPortatil.marca + "\n");
                    exportar.write("Tamaño: " + reg.computadorPortatil.tamano + "\n");
                    exportar.write("Precio: " + reg.computadorPortatil.precio + "\n");
                    exportar.write("Sistema Operativo: " + reg.computadorPortatil.sistemaOperativo + "\n");
                    exportar.write("Procesador: " + reg.computadorPortatil.procesador + "\n");
                } else if (reg.estudianteDiseno != null) {
                    exportar.write("Diseño\n");
                    exportar.write("Cédula: " + reg.estudianteDiseno.cedula + "\n");
                    exportar.write("Nombre: " + reg.estudianteDiseno.nombre + "\n");
                    exportar.write("Apellido: " + reg.estudianteDiseno.apellido + "\n");
                    exportar.write("Teléfono: " + reg.estudianteDiseno.telefono + "\n");
                    exportar.write("Modalidad de Estudio: " + reg.estudianteDiseno.modalidadEstudio + "\n");
                    exportar.write("Cantidad de Asignaturas: " + reg.estudianteDiseno.cantidadAsignaturas + "\n");
                    exportar.write("Serial: " + reg.tabletaGrafica.serial + "\n");
                    exportar.write("Marca: " + reg.tabletaGrafica.marca + "\n");
                    exportar.write("Tamaño: " + reg.tabletaGrafica.tamano + "\n");
                    exportar.write("Precio: " + reg.tabletaGrafica.precio + "\n");
                    exportar.write("Almacenamiento: " + reg.tabletaGrafica.almacenamiento + "\n");
                    exportar.write("Peso: " + reg.tabletaGrafica.peso + "\n");
                }
                exportar.write("\n");
            }
            // Cerrar el FileWriter para liberar recursos
            exportar.close();
            // Mostrar mensaje de éxito
            JOptionPane.showMessageDialog(null, "Datos de estudiantes exportados correctamente", "Exportar", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            // Mostrar mensaje de error en caso de excepción
            JOptionPane.showMessageDialog(null, "Error al exportar los datos: " + e.getMessage(), "Exportar", JOptionPane.ERROR_MESSAGE);
        }
    }
}
