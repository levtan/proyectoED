package data;

public class Persona
{
    private String nombre;
    private int id;
    private int celular;
    private String correo;
    private String contraseña;

    public Persona(String nombre, int id, int celular, String correo, String contraseña)
    {
        this.nombre = nombre;
        this.id = id;
        this.celular = celular;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public void crearEvento(String nombre, Persona coordinador,String lugar, int tipo, String hora, String fecha)
    {
        Evento evn= new Evento(nombre,coordinador,lugar,tipo,hora,fecha);
    }


}
