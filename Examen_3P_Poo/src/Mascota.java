public class Mascota {
    private String nombre;
    private String raza;
    private int edad;
    private double alt;
    private double peso;
    public Mascota izq, der;

    public Mascota(String _name, String _raza, int _edad, double _alt, double _peso)
    {
        this.nombre = _name;
        this.raza = _raza;
        this.edad = _edad;
        this.alt = _alt;
        this.peso = _peso;
    }

    public String getNombre() {
        return nombre;
    }
    public String getRaza() {
        return raza;
    }
    public int getEdad() {
        return edad;
    }
    public double getAltura() {
        return alt;
    }
    public double getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setAltura(double altura) {
        this.alt = altura;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
}
