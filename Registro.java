public class Registro {
    public EstudianteIngenieria estudianteIngenieria;  // Registro de un estudiante de ingeniería
    public EstudianteDiseno estudianteDiseno;  // Registro de un estudiante de diseño
    public ComputadorPortatil computadorPortatil;  // Registro de un computador portátil
    public TabletaGrafica tabletaGrafica;  // Registro de una tableta gráfica

    // Constructor para un registro de ingeniería
    public Registro(EstudianteIngenieria estudianteIngenieria, ComputadorPortatil computadorPortatil) {
        this.estudianteIngenieria = estudianteIngenieria;
        this.computadorPortatil = computadorPortatil;
    }

    // Constructor para un registro de diseño
    public Registro(EstudianteDiseno estudianteDiseno, TabletaGrafica tabletaGrafica) {
        this.estudianteDiseno = estudianteDiseno;
        this.tabletaGrafica = tabletaGrafica;
    }

    // Método para convertir la información del registro a una cadena de texto
    @Override
    public String toString() {
        if (estudianteIngenieria != null) {
            return estudianteIngenieria.toString() + "\n" + computadorPortatil.toString();
        } else {
            return estudianteDiseno.toString() + "\n" + tabletaGrafica.toString();
        }
    }
}
