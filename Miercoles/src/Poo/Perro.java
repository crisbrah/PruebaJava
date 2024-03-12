package Poo;

public class Perro {
    private String nombre;
    private String raza;
    private String edad1;
    //definir un metodo ladrar que retorne la cantidad de ladridos
    //imprimir guau guau
    /*void ladrar(int ladridos)
    {
        for (int i = 0; i < ladridos ; i++) {
            System.out.println("guau");

        }
    }

    public Perro(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    void saludarPersona(String nombre)
    {
        System.out.println("Hola " + nombre);
    }*/
    public String getNombre()
    {
        return nombre;
    }
    public String getRaza()
    {
        return raza;
    }
    public String getEdad1()
    {
       return edad1;
    }

    //seters
    public void SetNombre(String nombre)
    {
        this.nombre=nombre;
    }

    public void SetRaza(String raza)
    {
        this.raza=raza;
    }
    public void SetEdad1(String edad_) {
        this.edad1 = edad_;
    }
}
