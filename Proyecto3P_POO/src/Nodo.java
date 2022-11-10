/*public class Nodo {
    //Atributos
    public Persona nuevaP;
    public Nodo hijo;
    public Nodo hermano;
    //Constructor
    public Nodo(String _name, int _old, String _placeBorn, String _sexo)
    {
        this.nuevaP = new Persona(_name,_old,_placeBorn,_sexo);
        this.hermano = null;
        this.hijo = null;
    }
}*/
public class Nodo {
    //Creación de atributos de tipo público
    public int edad; // atributo tipo publico
    public String nombre; // atributo tipo String
    public String sexo;// atributo tipo String
    public String lugarNacimento;// atributo tipo String
    public Nodo hijo; //atributo de tipo Nodo
    public Nodo hermano; //atributo tipo nodo


    //Constructor Nodo
    public Nodo(){
        //Atributos instanciados
        this.nombre="";
        this.hijo=null;
        this.hermano=null;
    }

    //Constructor que recibe parametros
    public Nodo(String name, int year, String sex, String placeBorn){
        //Atributos reciben el parametro
        this.nombre=name;
        this.edad=year;
        this.sexo=sex;
        this.lugarNacimento=placeBorn;
        this.hermano=null;
        this.hijo=null;
    }

}