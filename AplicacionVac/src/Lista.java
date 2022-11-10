public class Lista {
    static Nodo inicio = null;
    static Nodo aux = null;
    public void Insertar(String _name,String _curp,String _gen, String _nivel, String _escuela, int _edad, boolean _resl,int prio)
    {
        Nodo nuevo =  new Nodo(_name,_curp,_gen,_nivel,_escuela,_edad,_resl,0);

        if (inicio == null) {
            inicio = nuevo;
            return;
        }
        Nodo temp = inicio;
        Nodo prev = null;
        while (temp != null && temp.nuevoP.prio > 0) {
            prev = temp;
            temp = temp.sig;
        }
        if (temp == null) {
            prev.sig = nuevo;
        } else {
            if (prev == null) {
                nuevo.sig = inicio;
                inicio = nuevo;
            } else {
                nuevo.sig = temp;
                prev.sig = nuevo;
            }
        }
    }
    public static String Eliminar()
    {
        if (inicio != null) {
            String data = inicio.nuevoP.getNombre();
            // eliminando el elemento de mayor prioridad
            inicio = inicio.sig;
            return data;
        }
        return "" + -1;
    }
    public static void ImprimirLista()
    {
        aux = inicio;
        if(inicio != null && aux != null){ //Si inicio no esta vacio y auxiliar tampoco esta vacio
            System.out.println("NOMBRE" + "||\t" + "CURP" +  "||\t" + "GENERO" + "||\t" + "NIVEL" + "||\t" + "ESCUELA"); //Muestra el encabezado de nuestra tabla
            while(aux.sig != null){ //Mientras auxiliar siguiente no este vacia
                System.out.println(aux.nuevoP.getNombre() + "||\t" + aux.nuevoP.getCURP() + "||\t" + aux.nuevoP.getGenero() + "||\t" + aux.nuevoP.getNivel() + "||\t" + aux.nuevoP.getEscuela()); //Se muestran los elementos
                aux = aux.sig; //Y auxiliar tomara el valor de auxiliar siguiente
            }
            System.out.println(aux.nuevoP.getNombre() + "||\t" + aux.nuevoP.getCURP() + "||\t" + aux.nuevoP.getGenero() + "||\t" + aux.nuevoP.getNivel() + "||\t" + aux.nuevoP.getEscuela()); //Si lo anteriro no se cumple se le muestra al usuario los elementos
        }
        else{//Si no se cumple lo anterior no se cumple
            System.out.println("No hay elementos en la lista"); //significa que la lista esta vacia y por lo tanto no se puede mostrar nada y se le dice al usuario que nop hay elemtos en la lista
        }

    }
}


//if(_edad >= 50 && _resl && _nivel.equals("primaria") || _nivel.equals("secundaria")) nuevo.nuevoP.prio = 6;
//if(_edad >= 50 && _resl) nuevo.nuevoP.prio = 5;
//if(_edad >= 50 && _nivel.equals("primaria") || _nivel.equals("secundaria")) nuevo.nuevoP.prio = 4;
//if(_edad >= 50 || _resl && _nivel.equals("primaria") || _nivel.equals("secundaria")) nuevo.nuevoP.prio = 3;
//if(_resl) nuevo.nuevoP.prio = 2;
//if(_nivel.equals("primaria") || _nivel.equals("secundaria")) nuevo.nuevoP.prio = 1;

        /*if(inicio == null)
        {
            inicio = nuevo;
        }
        else
        {
            if(inicio != null)
            {
                aux = inicio;
                while(aux.sig != null)
                {
                    aux = aux.sig;
                }
            }
        }*/