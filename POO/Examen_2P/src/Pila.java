public class Pila {
    Auto[] autos;
    int tope;
    int tam;

    public Pila(int _tam)
    {
        autos = new Auto[_tam];
        tam = _tam;
        tope = -1;
    }

    public void insertar(Auto a)
    {
        if(tope < autos.length -1)
        {
            tope++;
            autos[tope] = a;
        }
        else
        {
            System.out.print("No hay espacio");
        }
    }

    public Auto eliminar()
    {
        Auto a = new Auto();
        if(tope >= 0)
        {
            a.modelo = autos[tope].modelo;
            a.placa = autos[tope].placa;
            a.noPuertas = autos[tope].noPuertas;
            a.year = autos[tope].year;
            tope--;

            return a;
        }
        else
        {
            System.out.println("No hay mas elementos en el arreglo");
        }
        return a;
    }

}