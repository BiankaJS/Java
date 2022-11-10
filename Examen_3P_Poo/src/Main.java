//Universidad de la salle bajio
//Bianka saray Juarez Sanchez
//Matricula: 74859
//Motivo: Cuando insertamos un nuevo nodo se va ordenando por criterio y es mas facil realizar la busqueda
import java.util.Scanner;
public class Main {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args)
    {
        Arbol mascotas = new Arbol();
        obtenerDatos(mascotas);
    }
    public static void obtenerDatos(Arbol m)
    {
        String _n, _r;
        int _e, opc;
        double _a,_p;

        do {
            System.out.println("1.Ingresar mascota\n2.Ordenar\n3.Buscar\n4.Salir");
            opc = reader.nextInt();
            switch (opc)
            {
                case 1:
                    System.out.println("Nombre: ");
                    _n = reader.next();
                    System.out.println("Edad: ");
                    _e = reader.nextInt();
                    System.out.println("Raza: ");
                    _r = reader.next();
                    System.out.println("Altura: ");
                    _a = reader.nextDouble();
                    System.out.println("Peso: ");
                    _p = reader.nextDouble();
                    m.insertar(_n,_r,_e,_a,_p);
                    System.out.println("Mascota agregada");
                    break;
                case 2:
                    System.out.println("1.InOrden\n2.PostOrden\n3.PreOrden");
                    opc = reader.nextInt();
                    switch (opc)
                    {
                        case 1:
                            m.inorden(m.raiz);
                            break;
                        case 2:
                            m.postorden(m.raiz);
                            break;
                        case 3:
                            m.preorden(m.raiz);
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Nombre de la mascota a buscar: ");
                    String name = reader.next();
                    boolean flag = m.Buscar(name,m.raiz);
                    if(flag == false) System.out.println("Mascota no encontrada");
                    break;
            }
        }while(opc != 4);
    }
}
