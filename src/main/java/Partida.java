import java.io.*;
public class Partida
{
    private int num;
    private String finalPartida;
    public Partida(){
    }
    public Partida(int num,String estado){
        this.num=num;
        finalPartida=estado;
    }
    public void setFinal_Partida(int pc,int jugador){
        if (jugador == pc)
                 finalPartida= "Empate";
        if ((jugador==1&&pc==3)||(jugador==2&&pc==1)||(jugador==3&&pc==2))
                 finalPartida="Ganaste";
        finalPartida="Perdiste";
    }
    public String getFinal_Partida(){
        return finalPartida;
    }
    public void setNum(int num){
        this.num=num;
    }
    public int getNum(){
        return num;
    }
    public void guardarHistorial(Partida act,String direc_historial) {
        File archivoHistorial=new File(direc_historial);
        FileWriter escribir;
        PrintWriter linea;
        try {
            escribir = new FileWriter(archivoHistorial,true);
            linea = new PrintWriter(escribir);
            if(archivoHistorial.length() == 0)
                escribir.write(act.getNum()+"|"+act.getFinal_Partida());
            else
                escribir.write("\n"+act.getNum()+"|"+act.getFinal_Partida());
            linea.close();
        } catch (IOException e) {
            System.out.println("Ocurrió un error al guardar la partida en el archivo: " + e.getMessage());
        }
    }
}

