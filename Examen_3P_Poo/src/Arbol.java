public class Arbol{
    Mascota raiz;

    public void insertar(String _name, String _raza, int _edad, double _alt, double _peso)
    {
        Mascota mascota;
        //Instanciamos un nuevo nodo
        mascota = new Mascota(_name,_raza,_edad,_alt,_peso);
        //Evaluamos si raiz es igual a null y raiz toma el valor de nuevo
        if(raiz == null)
        {
            raiz = mascota;
        }
        else
        {
            Mascota ant = null;
            Mascota aux;
            aux = raiz;
            while(aux != null)
            {
                ant = aux;
                if(_edad <= aux.getEdad()) aux = aux.izq;
                else aux = aux.der;
            }
            if(_edad <= ant.getEdad()) ant.izq = mascota;
            else ant.der = mascota;
        }
    }
    public void preorden(Mascota r)
    {
        if(r != null)
        {
            System.out.println(r.getNombre()+" tiene "+r.getEdad());
            preorden(r.izq);
            preorden(r.der);
        }
    }
    public void inorden(Mascota r)
    {
        if(r != null)
        {
            inorden(r.izq);
            System.out.println(r.getNombre()+" tiene "+r.getEdad());
            inorden(r.der);
        }
    }
    public void postorden(Mascota r)
    {
        if(r != null)
        {
            postorden(r.izq);
            postorden(r.der);
            System.out.println(r.getNombre()+" tiene "+r.getEdad());
        }
    }
    public boolean Buscar(String _name, Mascota r)
    {
        boolean flag = false;
        if(r != null)
        {
            Buscar(_name,r.izq);
            Buscar(_name,r.der);
            if(r.getNombre().equals(_name))
            {
                System.out.println(r.getNombre() + " tiene " + r.getEdad());
                return flag = true;
            }
        }
        return flag = false;
    }
}