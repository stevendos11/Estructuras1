public class EstudianteDiseno {
    public String cedula;  // Almacena la cédula del estudiante
    public String nombre;  // Almacena el nombre del estudiante
    public String apellido;  // Almacena el apellido del estudiante
    public String telefono;  // Almacena el número de teléfono del estudiante
    public String modalidadEstudio;  // Almacena la modalidad de estudio (virtual/presencial)
    public int cantidadAsignaturas;  // Almacena la cantidad de asignaturas que está viendo el estudiante
    public String serial;  // Almacena el serial del equipo asignado al estudiante

    // Constructor para inicializar un nuevo estudiante de diseño
    public EstudianteDiseno(String cedula, String nombre, String apellido, String telefono, String modalidadEstudio, int cantidadAsignaturas, String serial) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.modalidadEstudio = modalidadEstudio;
        this.cantidadAsignaturas = cantidadAsignaturas;
        this.serial = serial;
    }

    // Método para convertir la información del estudiante a una cadena de texto
    @Override
    public String toString() {
        return "Cédula: " + cedula + ", Nombre: " + nombre + ", Apellido: " + apellido + ", Teléfono: " + telefono + ", Modalidad: " + modalidadEstudio + ", Asignaturas: " + cantidadAsignaturas + ", Serial: " + serial;
    }
}
