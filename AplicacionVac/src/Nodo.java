public class Nodo {
    Profesor nuevoP;
    Nodo sig;

    public Nodo(String name, String _curp, String _gen, String _nivel, String _school, int _edad, boolean _positivo, int _prio)
    {
        nuevoP = new Profesor(name, _curp, _gen, _nivel, _school, _edad, _positivo, _prio);
    }
}
