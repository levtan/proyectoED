package data;

public class Evento
{
    private String nombre;
    private Persona coordinador;
    private String lugar;
    private int tipo; // tipo de evento (Academico, cultural, deportivo, etc)
    private String hora;
    private String fecha;
    private String recomendacion = "";



    public Evento(String nombre, Persona coordinador,String lugar, int tipo, String hora, String fecha)
    {
        this.nombre = nombre;
        this.coordinador=coordinador;
        this.lugar = lugar;
        this.tipo = tipo;
        this.hora = hora;
        this.fecha = fecha;
    }

    public Evento(String nombre, Persona coordinador,String lugar, int tipo, String hora, String fecha, String recomendacion)
    {
        this.nombre = nombre;
        this.coordinador=coordinador;
        this.lugar = lugar;
        this.tipo = tipo;
        this.hora = hora;
        this.fecha = fecha;
        this.recomendacion = recomendacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(String recomendacion) {
        this.recomendacion = recomendacion;
    }

    @Override
    public String toString()
    {
        return ""+nombre+
               "Organiza: "+ coordinador+
               "Lugar: "+ lugar+
               "Hora: "+ hora +
               "Fecha: "+ fecha+
               "Recomendacion: "+recomendacion;
    }

}
