public class Empleado {
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private int Edad;
    private String Cargo;
    public Empleado(String nombre, String apellido, String direccion , int edad , String cargo )
    {
        nombre = Nombre;
        apellido = Apellido;
        direccion = Direccion;
        edad = Edad;
        cargo = Cargo;    
    
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
    public void setDireccion(String direccion) {
        Direccion = direccion;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
    public void setCargo(String cargo) {
        Cargo = cargo;
    }
    public String getNombre() {
        return Nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public String getDireccion() {
        return Direccion;
    }
    public int getEdad() {
        return Edad;
    }
    public String getCargo() {
        return Cargo;
    }
    
}
