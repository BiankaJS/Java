import java.util.Scanner;
public class Main {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args)
    {
        //Instanciamos un objeto de tipo Arbol
        Arbol a = new Arbol();
        //Insertamos nuevos nodos al arbol
        //a.insertar(18,"Bianka");
        //a.insertar(20,"Pepe");
        //a.insertar(21,"Luis");
        //a.insertar(15,"Luna");
        //a.insertar(22,"Mary");
        //a.insertar(20,"Jose");
        //a.insertar(10,"Panfilo");
        //a.insertar(1,"Baby");
        ObtenerDatos(a);
        //Encabezada
        System.out.println("*********** Recorrido en Preorden ***********");
        //LLamamos al
        a.preorden(a.raiz);
        System.out.println("*********** Recorrido en Inorden ***********");
        a.inorden(a.raiz);
        System.out.println("*********** Recorrido en Postorden ***********");
        a.postorden(a.raiz);
    }

    public static void ObtenerDatos(Arbol a)
    {
        //Variables aux para guardar los valores
        int _e;
        String _n;
        int opc = 0;
        //Ciclo para repetir un menu y permitir la insercion
        do {
            System.out.println("1.Ingresar dato\n2.Eliminar dato\n3.Salir");
            opc = reader.nextInt();
            switch (opc)
            {
                case 1:
                    System.out.println("Nombre: ");
                    _n = reader.next();
                    System.out.println("Edad: ");
                    _e = reader.nextInt();
                    a.insertar(_e,_n);
                    break;
            }

        }while(opc != 3);
    }
}
