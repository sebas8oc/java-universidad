void main() {
    Persona persona1 = new Persona();
    persona1.MostrarPersona();

    System.out.println("--------------------");

    Alumno alumno1 = new Alumno("Juan Perez", "102030", 20, "Ingeniería");
    alumno1.MostrarAlumno();

    persona1.setNombre("Carlos Andres");
    persona1.setIdentificacion("54321567891");
    persona1.setEdad(23);

    System.out.println("--------------------");

    Alumno alumno2 = new Alumno(persona1, "Medicina");
    alumno2.MostrarAlumno();

}
