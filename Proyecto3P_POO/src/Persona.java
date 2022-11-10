public class Persona {
    public String nombre;//atributo para designar el nombre
    public int edad;//atributo para designar la edad
    public String lugarNacimiento;//atributo par saber el lugar donde nació
    public String sexo;//para designar el sexo

    public Persona(String name, int yearsOld, String placeBorn, String sex){
        this.nombre=name;
        this.edad=yearsOld;
        this.lugarNacimiento=placeBorn;
        this.sexo=sex;
    }
}
