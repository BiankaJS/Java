import java.util.Scanner;
public class ExamenSP_BSJS {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args)
    {
        Pila obj = new Pila(10);
        obj.insertar(new Auto("DFT023","Ranger",4,"2003"));
        obj.insertar(new Auto("KLI911","Jeep",4,"2012"));
        imprimir(obj);
        obj.insertar(new Auto("LRD394","T-Cross",5,"2008"));
        imprimir(obj);
    }

    public static Auto leerPedido(){
        Auto a = new Auto();
        System.out.print("Ingresa el modelo: ");
        a.modelo = reader.next();
        System.out.print("Ingresa las placas: ");
        a.placa = reader.next();
        System.out.print("Ingresa el num de puertas: ");
        a.noPuertas = reader.nextInt();
        System.out.print("Ingresa el año que salio: ");
        a.year = reader.next();
        return a;
    }

    public static void imprimir(Pila obj)
    {
        Auto a = obj.eliminar();
        System.out.println(a.modelo+"\t"+a.placa+"\t"+a.noPuertas+"\t"+a.year);
    }
}