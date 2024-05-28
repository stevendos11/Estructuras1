import javax.swing.JOptionPane;
import java.util.LinkedList;

public class MainMenu {
    public static LinkedList<Registro> registroList = new LinkedList<>();

    public static void main(String[] args) {
        while (true) {
            String option = JOptionPane.showInputDialog(null, "MENÚ PRINCIPAL\n"
                    + "1. ESTUDIANTES DE INGENIERIA\n"
                    + "2. ESTUDIANTES DE DISEÑO\n"
                    + "3. IMPRIMIR INVENTARIO TOTAL\n"
                    + "4. EXPORTAR DATOS\n"
                    + "5. IMPORTAR DATOS\n"
                    + "6. SALIR DEL PROGRAMA");

            switch (option) {
                case "1":
                    IngenieriaMenu.showMenu(); // Mostrar menú de ingeniería
                    break;
                case "2":
                    DisenoMenu.showMenu(); // Mostrar menú de diseño
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, imprimirInventario()); // Imprimir inventario total
                    break;
                case "4":
                    exportarDatos(); // Exportar datos
                    break;
                case "5":
                    importarDatos(); // Importar datos
                    break;
                case "6":
                    System.exit(0); // Salir del programa
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Intente de nuevo."); // Opción inválida
            }
        }
    }

    // Método para imprimir el inventario total
    public static String imprimirInventario() {
        StringBuilder inventario = new StringBuilder();
        inventario.append("Inventario:\n");
        for (Registro reg : registroList) {
            inventario.append(reg.toString()).append("\n");
        }
        return inventario.toString();
    }

    // Método para exportar los datos
    public static void exportarDatos() {
        ExportarEstudiantes.exportarEstudiantes(registroList);
    }

    // Método para importar los datos
    public static void importarDatos() {
        registroList = ImportarEstudiantes.importarEstudiantes();
    }
}
