import java.util.Scanner;
public class OrdenamientoM {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args)
    {
        getData();
    }
    public static void getData()
    {
        int _tam = 0;
        System.out.println("Menu\n1. Burbuja\n2. Inserccion\n3. Seleccion Directa\n4. Shaker\n5. Quick sort");
        int opc = reader.nextInt();

        switch(opc)
        {
            case 1:
                System.out.print("Cantidad de datos: ");
                _tam = reader.nextInt();
                Burbuja obj = new Burbuja(_tam);
                obj.rellenarA();
                obj.imprimirA();
                obj.ordenarA();
                obj.imprimirA();
        }
    }
}
