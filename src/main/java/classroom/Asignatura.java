package classroom;

public class Asignatura {

    public String nombre;
    String n = nombre;
    public int codigoInterno;
    public int codigoExterno;
    public Tipo tipo;

    public Asignatura() {
        this("Sin nombre",Tipo.FUNDAMENTACION);
        this.codigoExterno = 0;
        this.codigoInterno = 0;
    }

    public Asignatura(double codigoInterno,Tipo tipo) {
        this("Sin nombre", codigoInterno , 0,tipo);
    }
    
    public Asignatura(int codigoExterno,Tipo tipo) {
    	this("Sin nombre", 0, codigoExterno, tipo);
    	
    }
    

    public Asignatura(String nombre, Tipo tipo) {
        this(nombre, 0, 0,tipo);
    }

    public Asignatura(String nombre, double codigoInterno, int codigoExterno,Tipo tipo) {
        this.nombre = nombre;
        this.codigoInterno = (int)codigoInterno;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }
    
    public void cambiarDatos(double codigoInterno, int codigoExterno, String nombre,Tipo tipo) {
    	this.codigoInterno = (int)codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
    public void cambiarDatos(double codigoInterno ) {
    	this.codigoInterno = (int)codigoInterno;
    	
    }

    public void cambiarDatos(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    public void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    } 
    
    public void setCodigoInterno(double codigoInterno) {
        this.codigoInterno = (int) codigoInterno;
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

}

