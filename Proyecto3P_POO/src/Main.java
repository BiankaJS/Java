import java.util.Scanner;
/*import java.util.Scanner;
public class Main {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args)
    {
        Arbol arbol = new Arbol();

    }
    public static void obtenerDatos(Arbol nA)
    {
        int opc;
        do
        {
            System.out.println("\tMenu\n1.Ingresar familiar\n2.Buscar familiar\n3.Salir");
            opc = reader.nextInt();

        }while(opc != 3);
    }
}*/
public class Main{
public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
        //Instaciar la clase arbol
        Arbol arbol = new Arbol();
        //Llamado del método menu
        menu(arbol);
        }

public static void menu (Arbol gr){
        Scanner lector = new Scanner(System.in);
        int a;
        System.out.println("|-----------------------------------------------------------------------|");//diseño
        System.out.println("|-------------------Ingresa la raiz de la familia---------------------- |");
        System.out.println("|------------------------------Ingresa el nombre------------------------|");//encabezado
        String name=lector.next();
        System.out.println("|------------------------------Ingresa la edad -------------------------|");//encabezado
        int year=lector.nextInt();
        System.out.println("|------------------------Ingresa el lugar de nacimiento-----------------|");//encabezado
        String placeBorn=lector.next();
        System.out.println("|------------------------------Ingresa el sexo--------------------------|");//encabezado
        String sex=lector.next();
        Nodo abuelo=gr.insertar(name, year, placeBorn, sex, null);

        System.out.println("|-----------------------------------------------------------------------|");//diseño
        System.out.println("|-----------------Ingresa la un padre tuyo de la familia----------------|");
        System.out.println("|------------------------------Ingresa el nombre------------------------|");
        String n=lector.next();
        System.out.println("|------------------------------Ingresa la edad -------------------------|");
        int y=lector.nextInt();
        System.out.println("|------------------------Ingresa el lugar de nacimiento-----------------|");
        String pBorn=lector.next();
        System.out.println("|------------------------------Ingresa el sexo--------------------------|");
        String sx=lector.next();
        Nodo padre=gr.insertar(n, y, pBorn, sx, abuelo);

        System.out.println("|-----------------------------------------------------------------------|");//diseño
        System.out.println("|-----------------Ingresa un hermano tuyo de la familia---------------- |");
        System.out.println("|------------------------------Ingresa el nombre------------------------|");
        String ne=lector.next();
        System.out.println("|------------------------------Ingresa la edad -------------------------|");
        int yr=lector.nextInt();
        System.out.println("|------------------------Ingresa el lugar de nacimiento-----------------|");
        String pB=lector.next();
        System.out.println("|------------------------------Ingresa el sexo--------------------------|");
        String sexx=lector.next();
        Nodo hermano=gr.insertar(ne, yr, pB, sexx, padre);
        do{
        System.out.println("");//espacio
        System.out.println("|-----------------------------------------------------------------------|");//diseño
        System.out.println("|-------------------Escoge una de las siguientes opciones-------------- |");//encabezado
        System.out.println("|-----------------------------------------------------------------------|");//diseño
        System.out.println("|                               [1]insertar                             |");//opcion 1 insertar
        System.out.println("|                               [2]imprimir                             |");//opcion 3 imprimir
        System.out.println("|                               [3]Buscar                               |");//opcion 4 salir
        System.out.println("|                               [4]salir                                |");//opcion 4 salir
        System.out.println("|-----------------------------------------------------------------------|");//diseño
        System.out.println("");//espacio
        a = lector.nextInt();//se lee la opcion
        String nombre;
        int edad;
        String lugar;
        String sexo;
        String nombreBus;

        //String nombreBus;
        //Nodo nodo;

        switch(a){//inicia switch
        case 1://opcion 1
        //Nodo p=new Nodo();//crea un objeto de tipo paciente

        System.out.println("|------------Inserta la información en los siguientes campos------------|");//encabezado
        System.out.println("|-----------------------------------------------------------------------|");//diseño
        System.out.println("|------------------------------Ingresa el nombre------------------------|");//encabezado
        nombre = lector.next();//ingresa nombre
        System.out.println("");//espacio
        System.out.println("|-----------------------------------------------------------------------|");//diseño
        System.out.println("|------------------------------Ingresa la edad--------------------------|");//encabezado
        edad = lector.nextInt();//ingresa edad
        System.out.println("|-----------------------------------------------------------------------|");//diseño
        System.out.println("|------------------------------Ingresa el lugar de nacimiento--------------------------|");//encabezado
        lugar = lector.next();//ingresa el lugar de nacimiento
        System.out.println("|-----------------------------------------------------------------------|");//diseño
        System.out.println("|------------------------------Ingresa el sexo--------------------------|");//encabezado
        sexo = lector.next();//ingresa el sexo de la persona

        System.out.println("|-----------Ingresa el nombre del familiar al que hace referencia-------|");//encabezado
        System.out.println("|                               [1]abuelo                               |");//opcion 1 insertar
        System.out.println("|                               [2]padre                                |");//opcion 3 imprimir
        System.out.println("|                               [3]hermano                              |");
        int relacion=lector.nextInt();
        switch(relacion){
        case 1:
        gr.insertar(nombre, edad, lugar, sexo,abuelo);
        break;
        case 2:
        gr.insertar(nombre, edad, lugar, sexo,padre);
        break;
        case 3:
        gr.insertar(nombre, edad, lugar, sexo,hermano);

        break;
        }
        break;
        case 2:
        System.out.println("|-----------------------------------------------------------------------|");//diseño
        System.out.println("|------------------------Elige el recorrido a realizar------------------|");//encabezado
        System.out.println("                                        [1]PostOrden                                  ");
        System.out.println("                                        [2]PreOrden                                  ");
        int b = lector.nextInt();
        switch(b){
        case 1:
        gr.TransversaPostO(gr.raiz);
        break;
        case 2:
        gr.TransversaPreO(gr.raiz);
        break;
        }
        break;
        case 3://opcion 4
        System.out.println("|----------------------Para realizar una búsqueda-----------------------|");//encabezado
        System.out.println("|-----------------------------------------------------------------------|");//diseño
        System.out.println("|------------------------------Ingresa el nombre------------------------|");//encabezado
        nombreBus = lector.next();//ingresa nombre
        //int c = Integer.parseInt(nombreBus);
        Nodo encontrado =gr.Buscar(nombreBus, gr.raiz);
        if(encontrado == null) System.out.println("Miembro no registrado");
        else System.out.println("Nombre: "+encontrado.nombre +" Sexo : " + encontrado.sexo + " Edad : " + encontrado.edad + " Nacido en: " + encontrado.lugarNacimento);
                    /*switch(c){
                        case 1:
                            gr.Buscar(nombreBus, gr.raiz);
                            break;
                    }*/
        break;
        case 4:
        System.out.println("|-----------------------------------------------------------------------|");//diseño
        System.out.println("|--------------------------Saliendo del sistema...----------------------|");//encabezado
        System.out.println("|                                 Gracias                               |");//mensaje
        System.out.println("");//espacio
        break;//fin de opcion 4
        }//fin de switch
        }  while (a!=4);//fin de do while
        //}//fin de método menú

        }
}


/*Nodo raiz=arbol.insertar("a", null);

        arbol.insertar("b", raiz);
        arbol.insertar("c", raiz);

        //arbol.TransversaPreO(raiz);

        Nodo n =arbol.insertar("d", raiz);
        arbol.insertar("h", n);

        n=arbol.insertar("e", raiz);
        arbol.insertar("i", n);
        n=arbol.insertar("j", n);
        arbol.insertar("p", n);
        arbol.insertar("q", n);

        //arbol.TransversaPreO(raiz);

        n=arbol.insertar("f",raiz);
        arbol.insertar("k", n);
        arbol.insertar("l", n);
        arbol.insertar("m", n);

        n=arbol.insertar("g", raiz);
        arbol.insertar("n", n);

        arbol.TransversaPreO(raiz);
        System.out.println("------");
        arbol.TransversaPostO(raiz);
        System.out.println("------");

        Nodo encontrado=arbol.Buscar("z",raiz);
        if(encontrado!=null){
            System.out.println(encontrado.dato);
        }
        else{
            System.out.println("No existe en la familia");
        }
        System.out.println("------");


        System.out.println("En donde deseas insertar");
        String donde=lector.next();
        System.out.println("Que deseas insertar");
        String que=lector.next();

        encontrado=arbol.Buscar(donde, raiz);
        arbol.insertar(que, encontrado);
        arbol.TransversaPreO(raiz);*/