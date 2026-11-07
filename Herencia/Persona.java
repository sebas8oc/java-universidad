public class Persona {

    String Nombre;
    private String Identificacion;
    private Integer Edad;

    public Persona() {
        this.Nombre = "";
        this.Identificacion = "";
        this.Edad = null;
    }

    public Persona(String nombre, String identificacion, Integer edad) {
        this.Nombre = nombre;
        this.Identificacion = identificacion;
        this.Edad = edad;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setIdentificacion(String identificacion) {
        this.Identificacion = identificacion;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setEdad(Integer edad) {
        this.Edad = edad;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void IngresarPersona(String nombre, String identificacion, Integer edad) {
        this.Nombre = nombre;
        this.Identificacion = identificacion;
        this.Edad = edad;
    }

    public void MostrarPersona() {
        System.out.println("Nombre: " + this.Nombre);
        System.out.println("Identificacion: " + this.Identificacion);
        System.out.println("Edad: " + this.Edad);
    }
}
