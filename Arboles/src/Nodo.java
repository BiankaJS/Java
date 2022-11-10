public class Nodo {
    //Atributos
    private String nombre;
    private int edad;
    public Nodo izq, der;
    //Constructor para crear un nuevo nodo a partir de parametros
    public Nodo(int _edad, String _nombre)
    {
        this.edad = _edad;
        this.nombre = _nombre;
        izq = null;
        der = null;
    }

    //Metodos de viualización
    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    //Metodos de modificación
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
