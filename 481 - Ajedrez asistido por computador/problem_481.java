import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class problem_481 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out,false);
        String[] cadena;
        String fila, columna;     
        do
        {
            cadena = buf.readLine().split(" ");
            fila = cadena[0]; 
            columna = cadena[1];   
            if(fila.equals("1")){
                fila = fila.replace("1", "h");
                pw.println(fila + "" + columna); }
            else if(fila.equals("2")){
                fila = fila.replace("2", "g");
                pw.println(fila + "" + columna);}               
            else if(fila.equals("3")){
                fila = fila.replace("3", "f");
                pw.println(fila + "" + columna);}
            else if(fila.equals("4")){
                fila = fila.replace("4", "e");
                pw.println(fila + "" + columna);}
            else if(fila.equals("5")){
                fila = fila.replace("5", "d");
                pw.println(fila + "" + columna);}
            else if(fila.equals("6")){
                fila = fila.replace("6", "c");
                pw.println(fila + "" + columna);}
            else if(fila.equals("7")){
                fila = fila.replace("7", "b");
                pw.println(fila + "" + columna);}
            else if(fila.equals("8")){
                fila = fila.replace("8", "a");
                pw.println(fila + "" + columna);}
            
        }while(!"0".equals(columna) && !"0".equals(fila));
        pw.close();
    }
}
