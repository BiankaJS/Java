public class Nodo {
    private String Nombre;
    private String padecimiento;
    private String NSS;
    public int prio;
    public Nodo sig;

    public Nodo(String _name, String _pad, String _nss, int _prio)
    {
        this.Nombre = _name;
        this.padecimiento = _pad;
        this.NSS = _nss;
        this.prio = _prio;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setPadecimiento(String padecimiento) {
        this.padecimiento = padecimiento;
    }
    public String getPadecimiento() {
        return padecimiento;
    }
    public void setNSS(String NSS) {
        this.NSS = NSS;
    }
    public String getNSS() {
        return NSS;
    }

}
