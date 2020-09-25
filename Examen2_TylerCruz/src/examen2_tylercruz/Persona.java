package examen2_tylercruz;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private String numeroCel;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String numeroCel) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroCel = numeroCel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroCel() {
        return numeroCel;
    }

    public void setNumeroCel(String numeroCel) {
        this.numeroCel = numeroCel;
    }
    
    public void Enviar(){};

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", numeroCel=" + numeroCel + '}';
    }
    
    
    
}
