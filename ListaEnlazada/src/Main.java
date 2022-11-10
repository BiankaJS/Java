import java.util.Scanner;
public class Main {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args)
    {
        //Instanciamos un objeto de tipo Lista
        Lista l = new Lista();
        //LLamamos el metodo insertar para ingresar un paciente
        //l.Insertar("Paulina","Temperatura alta", "839482",4);
        //l.Insertar("Jose","Diarrea", "839483",3);
        //l.Insertar("Pedro","Fractura", "839484",1);
        //l.Insertar("Jacinto","Temperatura alta", "839485",4);
        //Mostramos la lista de los pacientes
        //l.ImprimirLista();
        ReadData(l);
    }

    public static void ReadData(Lista l)
    {
        int opc= 0;
        do {
            System.out.println("\nHospital Los Angeles\n1.Nuevo paciente\n2.Atender paciente\n3.Salir");
            opc = reader.nextInt();

            switch (opc)
            {
                case 1:
                    System.out.print("Nombre del paciente: ");
                    String n = reader.next();
                    System.out.print("Padecimiento: ");
                    String p = reader.next();
                    System.out.print("Num.social: ");
                    String ns = reader.next();
                    l.Insertar(n,p,ns);
                    l.ImprimirLista();
                    System.out.print("Paciente ingresado\n");
                    break;
                case 2:
                    l.ImprimirLista();
                    //System.out.println("Ingresa el num.social: ");
                    //String nss = reader.next();
                    l.Eliminar();
                    break;
            }
        }while(true);
    }
}