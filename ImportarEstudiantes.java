import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class ImportarEstudiantes {

    // Método para importar la lista de registros de estudiantes desde un archivo
    public static LinkedList<Registro> importarEstudiantes() {
        LinkedList<Registro> lista = new LinkedList<>();
        try {
            // Crear o abrir el archivo "RegistrosEstudiantes.txt"
            File archivo = new File("RegistrosEstudiantes.txt");
            // BufferedReader permite leer el contenido del archivo línea por línea
            BufferedReader importar = new BufferedReader(new FileReader(archivo));
            String linea;
            // Leer cada línea del archivo
            while ((linea = importar.readLine()) != null) {
                if (linea.contains("Ingenieria")) {
                    // Leer los datos del estudiante de ingeniería
                    String cedula = importar.readLine().split(": ")[1];
                    String nombre = importar.readLine().split(": ")[1];
                    String apellido = importar.readLine().split(": ")[1];
                    String telefono = importar.readLine().split(": ")[1];
                    int numeroSemestre = Integer.parseInt(importar.readLine().split(": ")[1]);
                    float promedioAcumulado = Float.parseFloat(importar.readLine().split(": ")[1]);
                    String serial = importar.readLine().split(": ")[1];
                    String marca = importar.readLine().split(": ")[1];
                    float tamano = Float.parseFloat(importar.readLine().split(": ")[1]);
                    float precio = Float.parseFloat(importar.readLine().split(": ")[1]);
                    String sistemaOperativo = importar.readLine().split(": ")[1];
                    String procesador = importar.readLine().split(": ")[1];

                    // Verificar si el registro ya existe por cédula o serial
                    boolean existe = false;
                    for (Registro reg : lista) {
                        if ((reg.estudianteIngenieria != null && reg.estudianteIngenieria.cedula.equals(cedula)) || 
                            (reg.computadorPortatil != null && reg.computadorPortatil.serial.equals(serial))) {
                            existe = true;
                            break;
                        }
                    }

                    // Crear objetos correspondientes y agregar a la lista si no existe
                    if (!existe) {
                        EstudianteIngenieria estudiante = new EstudianteIngenieria(cedula, nombre, apellido, telefono, numeroSemestre, promedioAcumulado, serial);
                        ComputadorPortatil equipo = new ComputadorPortatil(serial, marca, tamano, precio, sistemaOperativo, procesador);
                        lista.add(new Registro(estudiante, equipo));
                    }
                } else if (linea.contains("Diseño")) {
                    // Leer los datos del estudiante de diseño
                    String cedula = importar.readLine().split(": ")[1];
                    String nombre = importar.readLine().split(": ")[1];
                    String apellido = importar.readLine().split(": ")[1];
                    String telefono = importar.readLine().split(": ")[1];
                    String modalidadEstudio = importar.readLine().split(": ")[1];
                    int cantidadAsignaturas = Integer.parseInt(importar.readLine().split(": ")[1]);
                    String serial = importar.readLine().split(": ")[1];
                    String marca = importar.readLine().split(": ")[1];
                    float tamano = Float.parseFloat(importar.readLine().split(": ")[1]);
                    float precio = Float.parseFloat(importar.readLine().split(": ")[1]);
                    String almacenamiento = importar.readLine().split(": ")[1];
                    float peso = Float.parseFloat(importar.readLine().split(": ")[1]);

                    // Verificar si el registro ya existe por cédula o serial
                    boolean existe = false;
                    for (Registro reg : lista) {
                        if ((reg.estudianteDiseno != null && reg.estudianteDiseno.cedula.equals(cedula)) || 
                            (reg.tabletaGrafica != null && reg.tabletaGrafica.serial.equals(serial))) {
                            existe = true;
                            break;
                        }
                    }

                    // Crear objetos correspondientes y agregar a la lista si no existe
                    if (!existe) {
                        EstudianteDiseno estudiante = new EstudianteDiseno(cedula, nombre, apellido, telefono, modalidadEstudio, cantidadAsignaturas, serial);
                        TabletaGrafica equipo = new TabletaGrafica(serial, marca, tamano, precio, almacenamiento, peso);
                        lista.add(new Registro(estudiante, equipo));
                    }
                }
                importar.readLine(); // Leer la línea en blanco
            }
            // Cerrar el BufferedReader para liberar recursos
            importar.close();
            // Mostrar mensaje de éxito
            JOptionPane.showMessageDialog(null, "Datos de estudiantes importados correctamente", "Importar", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            // Mostrar mensaje de error en caso de excepción
            JOptionPane.showMessageDialog(null, "Error al importar los datos: " + e.getMessage(), "Importar", JOptionPane.ERROR_MESSAGE);
        }
        return lista;
    }
}
