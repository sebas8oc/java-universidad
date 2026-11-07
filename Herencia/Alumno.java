class Alumno extends Persona {
    private String Programa;

    public Alumno(String nombre, String identificacion, Integer edad, String programa) {
        super(nombre, identificacion, edad);
        this.Programa = programa;
    }

    public Alumno(Persona persona, String programa) {
        super(persona.getNombre(), persona.getIdentificacion(), persona.getEdad());
        this.Programa = programa;
    }

    public void IngrsarAlumno(String programa) {
        this.Programa = programa;
    }

    public void MostrarAlumno() {
        MostrarPersona();
        System.out.println("Programa: " + this.Programa);
    }
}
