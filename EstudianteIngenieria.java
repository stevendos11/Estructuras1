public class EstudianteIngenieria {
    public String cedula;  // Almacena la cédula del estudiante
    public String nombre;  // Almacena el nombre del estudiante
    public String apellido;  // Almacena el apellido del estudiante
    public String telefono;  // Almacena el número de teléfono del estudiante
    public int numeroSemestre;  // Almacena el número de semestre del estudiante
    public float promedioAcumulado;  // Almacena el promedio acumulado del estudiante
    public String serial;  // Almacena el serial del equipo asignado al estudiante

    // Constructor para inicializar un nuevo estudiante de ingeniería
    public EstudianteIngenieria(String cedula, String nombre, String apellido, String telefono, int numeroSemestre, float promedioAcumulado, String serial) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.numeroSemestre = numeroSemestre;
        this.promedioAcumulado = promedioAcumulado;
        this.serial = serial;
    }

    // Método para convertir la información del estudiante a una cadena de texto
    @Override
    public String toString() {
        return "Cédula: " + cedula + ", Nombre: " + nombre + ", Apellido: " + apellido + ", Teléfono: " + telefono + ", Semestre: " + numeroSemestre + ", Promedio: " + promedioAcumulado + ", Serial: " + serial;
    }
}
