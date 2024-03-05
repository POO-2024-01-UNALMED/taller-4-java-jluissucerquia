package classroom;

public class Persona {
	
	long cedula;
    String nombre;
    static int totalPersonas;
    
    static {
        totalPersonas = 0;
    }
    
    public Persona() {
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
    	this.cedula = 1;
    	this.nombre = nombre;
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

public enum Tipo {
	DISCIPLINAR(10, "DISCIPLINAR"), FUNDAMENTACION(20, "FUNDAMENTACION"), ELECTIVA(30, "ELECTIVA");
	
	private int codigo;
	private String nombre;
	
	Tipo(int codigo,String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
		
	}
}
