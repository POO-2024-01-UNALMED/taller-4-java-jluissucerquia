package classroom;

public class Persona {

    public long cedula = 0;
    String nombre;
    static int totalPersonas;
    static int sinCedula;
    
    static {
        totalPersonas = 0;
    }
    
    public Persona() {
    	this.nombre = "";
    	sinCedula = 0;
    	this.cedula = sinCedula;
    	totalPersonas++;
    }

    public Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    public Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    public Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        sinCedula++;
        this.cedula = sinCedula;
        totalPersonas++;
    }
    
    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
