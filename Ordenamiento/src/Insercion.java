import java.util.Scanner;

public class Insercion {
    int[] num;
    int tam;

    public Insercion(int _tam)
    {
        num = new int[_tam];
        tam = _tam;
    }
    public void rellenarA()
    {
        Scanner reader = new Scanner(System.in);
        for(int c = 0; c < num.length; c++)
        {
            System.out.print("Numero "+ (c + 1) +":");
            num[c] = reader.nextInt();
        }
    }

    public void ordenarA()
    {
        
    }

    public void imprimirA()
    {
        System.out.print("\n");
        for(int c = 0; c < num.length; c++)
        {
            System.out.print(num[c]+",");
        }
    }
}
