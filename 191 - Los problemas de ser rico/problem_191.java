import java.io.PrintWriter;
import java.util.Scanner;
public class problem_191 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int casos = e.nextInt();
        PrintWriter pw = new PrintWriter(System.out, false);
        int pecera, capacidad, dif_adyacente, total=0;
        for(int i=0; i<casos; i++)
        {
              total=0;
              pecera = e.nextInt();
              capacidad = e.nextInt();
              dif_adyacente = e.nextInt();
              for(int j=0; j<pecera; j++)
              {
                  total += capacidad;
                  capacidad -= dif_adyacente;
              }
              pw.println(total);
              
        }
        pw.close();
    }
}
