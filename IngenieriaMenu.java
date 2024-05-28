import javax.swing.JOptionPane;

public class IngenieriaMenu {
    public static void showMenu() {
        while (true) {
            String option = JOptionPane.showInputDialog(null, "ESTUDIANTES DE INGENIERIA\n"
                    + "1. Registrar préstamo de equipo.\n"
                    + "2. Modificar préstamo de equipo. (Por serial o cédula).\n"
                    + "3. Devolución de equipo (se elimina el registro). (Por serial o cédula).\n"
                    + "4. Buscar equipo (Por serial o cédula).\n"
                    + "5. Volver al menú principal.");

            switch (option) {
                case "1":
                    JOptionPane.showMessageDialog(null, RegistrarPrestamo.registrarIngenieria(MainMenu.registroList)); // Registrar préstamo de equipo
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, ModificarPrestamo.modificar(MainMenu.registroList)); // Modificar préstamo de equipo
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, DevolverEquipo.devolver(MainMenu.registroList)); // Devolución de equipo
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, BuscarEquipo.buscar(MainMenu.registroList)); // Buscar equipo
                    break;
                case "5":
                    return; // Volver al menú principal
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Intente de nuevo."); // Opción inválida
            }
        }
    }
}
