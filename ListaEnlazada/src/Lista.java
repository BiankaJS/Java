public class Lista {
    Nodo inicio = null;
    Nodo aux = null;
    Nodo ant = null;

    public void Insertar(String _name, String _pad, String _nss)
    {
        //Instanciamos un objeto de tipo Nodo con los parametros que recibio el metodo
        Nodo nuevo = new Nodo(_name,_pad,_nss,1);
        //Evaluamos si inicio es igual a nulo
        if(inicio == null)
        {
            //Cuando la condicion se cumple inicio es igual al objeto nuevo
            inicio = nuevo;
        }
        else
        {
            //Evaluamos si inicio es difente a nulo
            if(inicio != null)
            {
                //Cuando la condicion se cumple aux toma el valor de inicio
                aux = inicio;
                //Mientras aux.sig es diferente a nulo
                while(aux.sig != null)
                {
                    //Si la condicion se cumple aux es igual a aux.sig
                    aux = aux.sig;
                }
                //Si no entra en el while aux.sig es igual a nuevo
                aux.sig = nuevo;
            }
        }
    }
    public void Eliminar()
    {
        //El valor de aux es igual a inicio
        aux = inicio;
        //Si inicio es igual a nulo
        if(inicio == null)
        {
            //Si se cumple la condicion se envia un mensaje
            System.out.println("Lista enlazada vacia");
        }
        else
        {
            //Mientras aux sea diferente a null y no sea igual al numero social
            while(aux != null)
            {
                //ant toma el valor de aux
                ant = aux;
                //aux toma el valor del aux.sig
                aux = aux.sig;
            }
            //Si aux es igual a nulo
            if(aux == null)
            {
                //Si se cumple la condicion enviamos una mensaje
                System.out.println("No se encuentra el elemento");
            }
            else
            {
                //Si ant es igual a nulo
                if (ant == null)
                {
                    System.out.println(inicio.getNSS()+" ||\t"+inicio.getNombre()+"|| \t"+inicio.getPadecimiento());
                    //Si se cumple la condicion nicio toma el valor de inicio.sig
                    inicio = inicio.sig;
                }
                else
                {
                    System.out.println(ant.getNSS()+" ||\t"+ant.getNombre()+"|| \t"+ant.getPadecimiento());
                    //Si no se cumple la condicion ant.sig toma el valor de aux.sig
                    ant.sig = aux.sig;
                }
            }
        }
    }
    public void ImprimirLista()
    {
        //aux toma el valor de inicio
        aux = inicio;
        //imprimimos los encabezados
        System.out.println("NSS ||\t Nombre || \t Padecimiento || \t Prioridad");
        //Mientras aux.sig sea diferente a nulo
        while(aux.sig != null)
        {
            //Imprimimos el elemento aux
            System.out.println(aux.getNSS()+" ||\t"+aux.getNombre()+"|| \t"+aux.getPadecimiento()+"|| \t"+aux.prio);
            //aux toma el valor de aux.sig
            aux = aux.sig;
        }
        //Imprimimos el elemento aux
        System.out.println(aux.getNSS()+" ||\t"+aux.getNombre()+"|| \t"+aux.getPadecimiento()+"|| \t"+aux.prio);
    }
}