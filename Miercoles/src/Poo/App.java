package Poo;

public class App {
    public static void main(String[] args) {
/*        Usuario usuario1=new Usuario();
        Usuario usuario2=new Usuario();
        usuario1.nombre="George";
        usuario2.nombre="Maria";

        usuario1.apellido="Maxi";
        usuario2.apellido="Paredes";

        usuario1.edad=24;
        usuario2.edad=30;*/

        //System.out.println(usuario1.nombre +" "+usuario1.apellido);
        //System.out.println(usuario2.nombre +" "+usuario2.apellido+usuario2.edad);

        //String respuesta = usuario1.login("George", "1234");
        //System.out.println(respuesta);
        /*usuario1.saludar();
        usuario2.saludarPersona(usuario1.nombre);*/

        Usuario user01=new Usuario("Mario","Lopez", 34);
        System.out.println(user01.nombre);


    }
}
