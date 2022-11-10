import java.util.Scanner;
public class Burbuja {
    int[] num;
    int tam;

    public Burbuja(int _tam)
    {
        tam = _tam;
        num = new int[_tam];
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
        int aux;
        for(int f = 0; f < num.length - 1; f++)
        {
            for(int c = 0; c < num.length - f - 1; c++)
            {
                if(num[c + 1] < num[c])
                {
                    aux = num[c + 1];
                    num[c + 1] = num[c];
                    num[c] = aux;
                }
            }
        }
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
