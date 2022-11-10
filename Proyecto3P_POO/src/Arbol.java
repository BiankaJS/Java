/*public class Arbol {
    public Nodo raiz;
    public Nodo trabajo;
    public int i=0;

    public Nodo insertar(String _name, int _old, String _placeBorn, String _sexo,Nodo nodo){
        //Si no hay nodo donde insertar, tomamos como si fuera en la raiz
        if(nodo==null){
            raiz = new Nodo(_name,_old,_placeBorn,_sexo);
            //No hay hijo
            raiz.hijo=null;
            //No hay hermano
            raiz.hermano=null;
            return raiz;
        }

        //Verificamos si no tiene hijo
        //Insertamos el dato como hijo
        if(nodo.hijo==null){

            Nodo temp = new Nodo(_name,_old,_placeBorn,_sexo);
            //Conectamos el nuevo nodo como hijo
            nodo.hijo=temp;
            return temp;
        }
        else{//ya tiene un hijo tenemos que insertarlo como hermano
            this.trabajo=nodo.hijo;

            //Avanzamos hasta el último hermano
            while(trabajo.hermano!=null){
                trabajo=trabajo.hermano;
            }

            //creamos nodo temporal
            Nodo temp = new Nodo(_name,_old,_placeBorn,_sexo);
            //Unimos el temp al ultimo hermano
            trabajo.hermano=temp;

            return temp;
        }
    }

    //Transverda preorder
    public void TransversaPreO(Nodo nodo){
        if(nodo==null){
            return;
        }

        //Me proceseso primero a mi
        for(int n=0;n<i;n++){
            System.out.print(" ");
        }
        System.out.println(nodo);



        //Luego proceso a mi hijo
        if(nodo.hijo!=null){
            i++;
            TransversaPreO(nodo.hijo);
            i--;
        }

        //Si tengo hermanos los proceso
        if(nodo.hermano!=null){
            TransversaPreO(nodo.hermano);
        }

    }

    //TransversaPostOrder
    public void TransversaPostO(Nodo nodo){
        if(nodo==null){
            return;
        }

        //Primero proceso a mi hijo
        if(nodo.hijo!=null){
            i++;
            TransversaPostO(nodo.hijo);
            i--;
        }

        //Si tengo hermanos los proceso;
        if(nodo.hermano!=null){
            TransversaPostO(nodo.hermano);
        }

        //Luego me proceso a mi
        for(int n=0; n<i; n++){
            System.out.print(" ");
        }
        System.out.println(nodo);
    }

    public Nodo Buscar(String pDato, Nodo raiz){
        Nodo encontrado = null;

        if(raiz==null){
            return encontrado;
        }

        if(raiz.nuevaP.nombre.compareTo(pDato)==0){
            encontrado = raiz;
            return encontrado;
        }

        //Luego proceso a mi hijo
        if(raiz.hijo!=null){
            encontrado=Buscar(pDato,raiz.hijo);

            if(encontrado!=null){
                return encontrado;
            }
        }

        //Si tengo hermanos los proceso
        if(raiz.hermano!=null){
            encontrado=Buscar(pDato, raiz.hermano);

            if(encontrado!=null){
                return encontrado;
            }
        }
        return encontrado;
    }
}*/
public class Arbol {
    //Creación de atributos de tipo público
    public Nodo raiz;
    public Nodo trabajo;
    public int i=0;

    //Constructor de arbol
    public Arbol(){
        //Instaciamiento de atributo raiz
        raiz=new Nodo();
    }

    //Método para insertar nuevos nodos
    public Nodo insertar(String _name, int _old, String _sexo, String _placeBorn,Nodo nodo){
        //Condicional. Si no hay nodo donde insertar, tomamos como si fuera en la raiz
        if(nodo==null){
            raiz=new Nodo(_name,_old,_sexo,_placeBorn);
            raiz.nombre=_name;

            //No hay hijo
            raiz.hijo=null;

            //No hay hermano
            raiz.hermano=null;

            //Retorna el nodo raiz
            return raiz;
        }
        //Condicional
        //Verificamos si no tiene hijo
        //Insertamos el dato como hijo
        if(nodo.hijo==null){
            //Nodo temporal recibe el valor del nuevo nodo
            Nodo temp = new Nodo(_name,_old,_sexo,_placeBorn);
            //El temporal en el atributo nombre, es igual al parametro de nombre
            temp.nombre=_name;

            //Conectamos el nuevo nodo como hijo
            nodo.hijo=temp;

            return temp;
        }
        else{//ya tiene un hijo tenemos que insertarlo como hermano
            this.trabajo=nodo.hijo;

            //Avanzamos hasta el último hermano
            while(trabajo.hermano!=null){
                trabajo=trabajo.hermano;
            }

            //creamos nodo temporal
            Nodo temp = new Nodo(_name,_old,_sexo,_placeBorn);

            //El temporal en el atributo nombre, es igual al parametro de nombre
            temp.nombre=_name;

            //Unimos el temp al ultimo hermano
            trabajo.hermano=temp;

            return temp;
        }
    }

    //Transverda preorder
    public void TransversaPreO(Nodo nodo){
        //Condicional, si el nodo es igual a nulo
        if(nodo==null){
            //No retorna nada
            return;
        }

        //Me proceseso primero a mi
        for(int n=0;n<i;n++){
            System.out.print(" ");
        }
        System.out.println(nodo.nombre);//Impresión



        //Condicional. Luego proceso a mi hijo
        if(nodo.hijo!=null){
            i++;
            //Se llama a si mismo
            TransversaPreO(nodo.hijo);
            i--;
        }

        //Condicional. Si tengo hermanos los proceso
        if(nodo.hermano!=null){
            TransversaPreO(nodo.hermano);
        }

    }

    //TransversaPostOrder
    public void TransversaPostO(Nodo nodo){
        if(nodo==null){
            return;
        }

        //Condicional. Primero proceso a mi hijo
        if(nodo.hijo!=null){
            i++;
            TransversaPostO(nodo.hijo);
            i--;
        }

        //Condicional. Si tengo hermanos los proceso;
        if(nodo.hermano!=null){
            TransversaPostO(nodo.hermano);
        }

        //Luego me proceso a mi
        for(int n=0; n<i; n++){
            System.out.print(" ");
        }
        //Impresión pantalla
        System.out.println(nodo.nombre);
    }

    //Método para buscar
    public Nodo Buscar(String _name, Nodo nodo){
        //Instancia nodo encontrado en nulo
        Nodo encontrado = null;
        //Condicional. Si Nodo es igual a nulo
        if(nodo==null){
            //Retorna el valor encontrado
            return encontrado;
        }
        //Condicional, compración del atributo nombre que esta en el nodo
        if(nodo.nombre.compareTo(_name)==0){
            //Variable encontrado toma el valor del nodo
            encontrado=nodo;
            //Retorna el valor encontrado
            return encontrado;
        }

        //Condicional. Luego proceso a mi hijo
        if(nodo.hijo!=null){
            encontrado=Buscar(_name,nodo.hijo);
            //Condicional, si encontrado es diferentes a nulo
            if(encontrado!=null){
                //Retorna el valor encontrado
                return encontrado;
            }
        }

        //Condicional. Si tengo hermanos los proceso
        if(nodo.hermano!=null){
            encontrado=Buscar(_name, nodo.hermano);
            //Condicional, si encontrado es diferentes a nulo
            if(encontrado!=null){
                //Retorna el valor encontrado
                return encontrado;
            }
        }
        //Retorna el valor encontrado
        return encontrado;
    }
}