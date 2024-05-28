import javax.swing.JOptionPane;
import java.util.LinkedList;

public class ModificarPrestamo {
    // Método para modificar un préstamo de equipo para estudiantes de ingeniería
    public static String modificar(LinkedList<Registro> lista) {
        // Solicitar identificador (serial o cédula)
        String identificador = JOptionPane.showInputDialog("Ingrese el serial o cédula del equipo:");

        // Buscar el registro en la lista
        for (Registro reg : lista) {
            if (reg.estudianteIngenieria != null && (reg.estudianteIngenieria.cedula.equals(identificador) || reg.computadorPortatil.serial.equals(identificador))) {
                // Solicitar los nuevos datos del préstamo
                String nuevaCedula = JOptionPane.showInputDialog("Ingrese la nueva cédula:", reg.estudianteIngenieria.cedula);
                String nuevoSerial = JOptionPane.showInputDialog("Ingrese el nuevo serial del equipo:", reg.computadorPortatil.serial);
                
                // Verificar si la nueva cédula o serial ya existen
                for (Registro r : lista) {
                    if ((r.estudianteIngenieria != null && !r.equals(reg) && r.estudianteIngenieria.cedula.equals(nuevaCedula)) ||
                        (r.computadorPortatil != null && !r.equals(reg) && r.computadorPortatil.serial.equals(nuevoSerial))) {
                        return "La nueva cédula o el nuevo serial ya existen.";
                    }
                }
                
                reg.estudianteIngenieria.cedula = nuevaCedula;
                reg.computadorPortatil.serial = nuevoSerial;

                reg.estudianteIngenieria.nombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre:", reg.estudianteIngenieria.nombre);
                reg.estudianteIngenieria.apellido = JOptionPane.showInputDialog("Ingrese el nuevo apellido:", reg.estudianteIngenieria.apellido);
                reg.estudianteIngenieria.telefono = JOptionPane.showInputDialog("Ingrese el nuevo teléfono:", reg.estudianteIngenieria.telefono);
                reg.estudianteIngenieria.numeroSemestre = solicitarEntero("Ingrese el nuevo número de semestre:", reg.estudianteIngenieria.numeroSemestre);
                reg.estudianteIngenieria.promedioAcumulado = solicitarFlotante("Ingrese el nuevo promedio acumulado:", reg.estudianteIngenieria.promedioAcumulado);
                reg.computadorPortatil.marca = JOptionPane.showInputDialog("Ingrese la nueva marca del equipo:", reg.computadorPortatil.marca);
                reg.computadorPortatil.tamano = solicitarFlotante("Ingrese el nuevo tamaño del equipo en pulgadas:", reg.computadorPortatil.tamano);
                reg.computadorPortatil.precio = solicitarFlotante("Ingrese el nuevo precio del equipo:", reg.computadorPortatil.precio);
                reg.computadorPortatil.sistemaOperativo = ComputadorPortatil.seleccionarSistemaOperativo();
                reg.computadorPortatil.procesador = ComputadorPortatil.seleccionarProcesador();
                return "Préstamo modificado exitosamente.";
            } else if (reg.estudianteDiseno != null && (reg.estudianteDiseno.cedula.equals(identificador) || reg.tabletaGrafica.serial.equals(identificador))) {
                // Solicitar los nuevos datos del préstamo
                String nuevaCedula = JOptionPane.showInputDialog("Ingrese la nueva cédula:", reg.estudianteDiseno.cedula);
                String nuevoSerial = JOptionPane.showInputDialog("Ingrese el nuevo serial del equipo:", reg.tabletaGrafica.serial);
                
                // Verificar si la nueva cédula o serial ya existen
                for (Registro r : lista) {
                    if ((r.estudianteDiseno != null && !r.equals(reg) && r.estudianteDiseno.cedula.equals(nuevaCedula)) ||
                        (r.tabletaGrafica != null && !r.equals(reg) && r.tabletaGrafica.serial.equals(nuevoSerial))) {
                        return "La nueva cédula o el nuevo serial ya existen.";
                    }
                }
                
                reg.estudianteDiseno.cedula = nuevaCedula;
                reg.tabletaGrafica.serial = nuevoSerial;

                reg.estudianteDiseno.nombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre:", reg.estudianteDiseno.nombre);
                reg.estudianteDiseno.apellido = JOptionPane.showInputDialog("Ingrese el nuevo apellido:", reg.estudianteDiseno.apellido);
                reg.estudianteDiseno.telefono = JOptionPane.showInputDialog("Ingrese el nuevo teléfono:", reg.estudianteDiseno.telefono);
                reg.estudianteDiseno.modalidadEstudio = JOptionPane.showInputDialog("Ingrese la nueva modalidad de estudio:", reg.estudianteDiseno.modalidadEstudio);
                reg.estudianteDiseno.cantidadAsignaturas = solicitarEntero("Ingrese la nueva cantidad de asignaturas:", reg.estudianteDiseno.cantidadAsignaturas);
                reg.tabletaGrafica.marca = JOptionPane.showInputDialog("Ingrese la nueva marca de la tableta:", reg.tabletaGrafica.marca);
                reg.tabletaGrafica.tamano = solicitarFlotante("Ingrese el nuevo tamaño de la tableta en pulgadas:", reg.tabletaGrafica.tamano);
                reg.tabletaGrafica.precio = solicitarFlotante("Ingrese el nuevo precio de la tableta:", reg.tabletaGrafica.precio);
                reg.tabletaGrafica.almacenamiento = TabletaGrafica.seleccionarAlmacenamiento();
                reg.tabletaGrafica.peso = solicitarFlotante("Ingrese el nuevo peso de la tableta en kg:", reg.tabletaGrafica.peso);
                return "Préstamo modificado exitosamente.";
            }
        }
        // Mostrar mensaje si no se encuentra el registro
        return "Registro no encontrado.";
    }

    // Método para solicitar un valor entero con validación
    private static int solicitarEntero(String mensaje) {
        while (true) {
            try {
                return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Dato erróneo. Por favor, ingrese un número entero.");
            }
        }
    }

    // Método para solicitar un valor flotante con validación
    private static float solicitarFlotante(String mensaje) {
        while (true) {
            try {
                return Float.parseFloat(JOptionPane.showInputDialog(mensaje));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Dato erróneo. Por favor, ingrese un número decimal.");
            }
        }
    }
}

