import javax.swing.JOptionPane;
import java.util.LinkedList;

public class RegistrarPrestamo {
    // Método para registrar un préstamo de equipo para estudiantes de ingeniería
    public static String registrarIngenieria(LinkedList<Registro> lista) {
        // Solicitar datos del estudiante
        String cedula = JOptionPane.showInputDialog("Ingrese la cédula:");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido:");
        String telefono = JOptionPane.showInputDialog("Ingrese el teléfono:");
        int numeroSemestre = solicitarEntero("Ingrese el número de semestre:");
        float promedioAcumulado = solicitarFlotante("Ingrese el promedio acumulado:");

        // Solicitar datos del equipo
        String serial = JOptionPane.showInputDialog("Ingrese el serial del equipo:");
        String marca = JOptionPane.showInputDialog("Ingrese la marca del equipo:");
        float tamano = solicitarFlotante("Ingrese el tamaño del equipo en pulgadas:");
        float precio = solicitarFlotante("Ingrese el precio del equipo:");
        String sistemaOperativo = ComputadorPortatil.seleccionarSistemaOperativo();
        String procesador = ComputadorPortatil.seleccionarProcesador();

        ComputadorPortatil equipo = new ComputadorPortatil(serial, marca, tamano, precio, sistemaOperativo, procesador);

        // Verificar si el registro ya existe por cédula o serial
        for (Registro reg : lista) {
            if ((reg.estudianteIngenieria != null && reg.estudianteIngenieria.cedula.equals(cedula)) || 
                (reg.computadorPortatil != null && reg.computadorPortatil.serial.equals(serial))) {
                return "El registro ya existe.";
            }
        }

        // Crear un nuevo registro de préstamo y agregarlo a la lista
        EstudianteIngenieria nuevoEstudiante = new EstudianteIngenieria(cedula, nombre, apellido, telefono, numeroSemestre, promedioAcumulado, serial);
        Registro nuevoRegistro = new Registro(nuevoEstudiante, equipo);
        lista.add(nuevoRegistro);
        return "Registro exitoso.";
    }

    // Método sobrecargado para registrar un préstamo de equipo para estudiantes de diseño
    public static String registrarDiseno(LinkedList<Registro> lista) {
        // Solicitar datos del estudiante
        String cedula = JOptionPane.showInputDialog("Ingrese la cédula:");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido:");
        String telefono = JOptionPane.showInputDialog("Ingrese el teléfono:");
        String modalidadEstudio = JOptionPane.showInputDialog("Ingrese la modalidad de estudio (virtual/presencial):");
        int cantidadAsignaturas = solicitarEntero("Ingrese la cantidad de asignaturas:");

        // Solicitar datos del equipo
        String serial = JOptionPane.showInputDialog("Ingrese el serial del equipo:");
        String marca = JOptionPane.showInputDialog("Ingrese la marca de la tableta:");
        float tamano = solicitarFlotante("Ingrese el tamaño de la tableta en pulgadas:");
        float precio = solicitarFlotante("Ingrese el precio de la tableta:");
        String almacenamiento = TabletaGrafica.seleccionarAlmacenamiento();
        float peso = solicitarFlotante("Ingrese el peso de la tableta en kg:");

        TabletaGrafica equipo = new TabletaGrafica(serial, marca, tamano, precio, almacenamiento, peso);

        // Verificar si el registro ya existe por cédula o serial
        for (Registro reg : lista) {
            if ((reg.estudianteDiseno != null && reg.estudianteDiseno.cedula.equals(cedula)) || 
                (reg.tabletaGrafica != null && reg.tabletaGrafica.serial.equals(serial))) {
                return "El registro ya existe.";
            }
        }

        // Crear un nuevo registro de préstamo y agregarlo a la lista
        EstudianteDiseno nuevoEstudiante = new EstudianteDiseno(cedula, nombre, apellido, telefono, modalidadEstudio, cantidadAsignaturas, serial);
        Registro nuevoRegistro = new Registro(nuevoEstudiante, equipo);
        lista.add(nuevoRegistro);
        return "Registro exitoso.";
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
