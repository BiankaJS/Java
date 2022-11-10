import java.util.Scanner;
public class Main {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args)
    {
        Lista enlazada = new Lista();
        readerData(enlazada);
    }
    public static void readerData(Lista gr)
    {
        //Declaracion de variables
        String nombre;
        String curp;
        String genero;
        int edad;
        String nivel;
        String escuela;
        Boolean pos=false;
        int opcion;
        //Ciclo de repeticion
        do{
            //Impresion de menu
            System.out.println("");
            System.out.println("[1] Agregar paciente");
            System.out.println("[2] Eliminar registro");
            System.out.println("[3] Imprimir lista");
            System.out.println("[4] Salir\n");
            opcion = reader.nextInt();
            switch(opcion){
                case 1:
                    //Lectura de datos del usuario
                    System.out.print("Nombre: ");
                    nombre = reader.next();
                    System.out.print("CURP: ");
                    curp = reader.next();
                    System.out.print("Edad: ");
                    edad = reader.nextInt();
                    System.out.print("Genero: \nFemenino\nMasculino\n");
                    genero = reader.next();
                    if (genero.equals("Femenino")||genero.equals("femenino")){
                        System.out.print("¿Estas embarazada? ");
                        if(reader.nextLine() == "si" || reader.nextLine() == "Si") pos = true;
                    }
                    System.out.print("Nivel: ");
                    nivel = reader.next();
                    System.out.print("Escuela: ");
                    escuela = reader.next();
                    gr.Insertar(nombre,curp,genero,nivel,escuela,edad,pos,0);
                    System.out.println("<<Profesor registrado>>");
                    break;
                case 2:
                    System.out.println("<<<Eliminar elemento>>");
                    //Invocacion de metodo de eliminar
                    System.out.println("Profesor vacunado: "+Lista.Eliminar());
                    break;
                case 3:
                    System.out.println("<<<Imprimiendo Lista>>>");
                    //Invocacion de metodo de impresion lista
                    gr.ImprimirLista();
                    break;
                case 4:
                    System.out.println("<<<GRACIAS>>>");
            }
        }while(opcion!=4);
    }
}