import java.io.*;
import java.util.ArrayList;
public class Logro
{
    private String nombre;
    private String descripcion;
    private int criterio;
    private boolean estado;
    private String tipo;
    public Logro(){
    }
    public Logro(String nombre,String descripcion,int criterio,String tipo){
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.criterio=criterio;
        this.estado=false;
        this.tipo=tipo;
    }
    public String getNombre(){
        return nombre;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public boolean getEstado(){
        return estado;
    }
    public int getRequerimiento(){
        return criterio;
    }
    public String getTipo(){
        return tipo;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    public void setEstado(int racha, int partida) {
        if(tipo.equals("Partida") && criterio==partida)
                estado=true;
        else if(criterio==racha)
                estado=true;
    }
    public void setRequerimiento(int criterio){
        this.criterio=criterio;
    }
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    public void cambiar_estado(boolean estado){
        this.estado=estado;
    }
    public void guardarLogros(ArrayList<Logro> logros,String direc_logros) {
        File archivoLogros=new File(direc_logros
        );
        try (BufferedWriter escritorLogros = new BufferedWriter(new FileWriter(archivoLogros))) {
            for (Logro l : logros) {
                escritorLogros.write(l.getNombre() + "|" + l.getEstado() + "|" + l.getDescripcion());
                escritorLogros.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<Logro> lista_logros() {
        ArrayList<Logro> logros = new ArrayList<>();
        Logro act = new Logro("Primeros pasos", "Jugar 3 partidas", 3, "Partida");
        logros.add(act);
        Logro act1 = new Logro("Estas ardiendo", "Tener una racha de 3", 3, "Racha");
        logros.add(act1);
        Logro act2 = new Logro("Puedes hacerlo mejor", "Tener una racha de 0", 0, "Racha");
        logros.add(act2);
        Logro act3 = new Logro("Estas mejorando", "Jugar 6 partidas", 6, "Partida");
        logros.add(act3);
        Logro act4 = new Logro("Toma un descanso", "Jugar 12 partidas", 12, "Partida");
        logros.add(act4);
        return logros;
    }
    
    public Logro cargar_estado(String contenido,Logro act){
        int aux=0;
        int aux2=0;
        int cont=0;
        int n=0;
        for(char c: contenido.toCharArray()){
            if(c=='|' && cont==0 ){
                aux=n+1;
                cont++;
            }
            if(c=='|' && cont==1)
                aux2=n;
            n++;
        }
        String estado=contenido.substring(aux,aux2);
        if(estado.equals("true"))
            act.cambiar_estado(true);
        return act;
    }
    
    public ArrayList<Logro> cargar_Logros(String direc_logros) {
        File archivo=new File(direc_logros);
        String contenido;
        ArrayList<Logro> lista = new ArrayList<>();
        lista=lista_logros();
        int aux=0;
        try (BufferedReader lectura = new BufferedReader(new FileReader(archivo))) {
            contenido = lectura.readLine();
            while (contenido != null) {
                lista.set(aux,cargar_estado(contenido,lista.get(aux)));
                contenido = lectura.readLine();
                aux++;
            }
        } catch (IOException excepcion) {
            excepcion.printStackTrace();
        }
        return lista;
    }
}
