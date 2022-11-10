public class Profesor {
    private String Nombre;
    private String CURP;
    private String genero;
    private String nivel;
    private String escuela;
    private int edad;
    private boolean positivo;
    public int prio;

    public Profesor(String _name, String _curp, String _gen, String _nivel, String _school, int _edad, boolean _prue, int _prio)
    {
        this.Nombre = _name;
        this.CURP = _curp;
        this.genero = _gen;
        this.nivel = _nivel;
        this.escuela = _school;
        this.edad = _edad;
        this.positivo = _prue;
        this.prio = _prio;
        if(edad > 50) prio += 1;
        if(positivo) prio += 1;
        nivel.toLowerCase();
        if(nivel == "primaria" || nivel == "secundaria") prio += 1;
    }

    public String getNombre(){
        return this.Nombre;
    }
    public String getCURP(){
        return this.CURP;
    }
    public String getGenero(){
        return this.genero;
    }
    public String getNivel(){
        return this.nivel;
    }
    public String getEscuela(){
        return this.escuela;
    }
    public int getEdad(){return this.edad;}
    public boolean isPositivo() {
        return positivo;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public void setCURP(String CURP) {
        this.CURP = CURP;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setPositivo(boolean positivo) {
        this.positivo = positivo;
    }
}
