public class Arbol {
    Nodo raiz;

    public Arbol() {
        raiz = null;
    }

    public void insertar(int _e, String _n)
    {
        Nodo nuevo;
        //Instanciamos un nuevo nodo
        nuevo = new Nodo(_e,_n);
        //Evaluamos si raiz es igual a null y raiz toma el valor de nuevo
        if(raiz == null)
        {
            raiz = nuevo;
        }
        else
        {
            //Creamos un objeto llamado ant y lo igualamos a nulo
            Nodo ant = null;
            //Creamos un nodo aux y toma el valor de raiz
            Nodo aux;
            aux = raiz;
            //Mientras el aux sea diferente a null
            while(aux != null)
            {
                //Ant toma el valor de aux y evalua si la edad del nuevo nodo es menor a aux
                ant = aux;
                if(_e <= aux.getEdad()) aux = aux.izq;
                else aux = aux.der;
            }
            //el nuevo nodo se ingrega a la derecha de caso contrario se inserta a la derecha
            if(_e <= ant.getEdad()) ant.izq = nuevo;
            else ant.der = nuevo;
        }
    }
    //Imprime,nodo izquierdo,nodo derecho
    public void preorden(Nodo r)
    {
        if(r != null)
        {
            System.out.println(r.getNombre()+" tiene "+r.getEdad());
            preorden(r.izq);
            preorden(r.der);
        }
    }
    //Nodo izquierdod,Imprime,Nodo derecho
    public void inorden(Nodo r)
    {
        if(r != null)
        {
            inorden(r.izq);
            System.out.println(r.getNombre()+" tiene "+r.getEdad());
            inorden(r.der);
        }
    }
    //Nodo izquierdo,Nodo derecho,Imprime
    public void postorden(Nodo r)
    {
        if(r != null)
        {
            postorden(r.izq);
            postorden(r.der);
            System.out.println(r.getNombre()+" tiene "+r.getEdad());
        }
    }
}
