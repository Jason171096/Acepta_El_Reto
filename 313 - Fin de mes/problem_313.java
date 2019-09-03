import java.io.PrintWriter;
import java.util.Scanner;
public class problem_313 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out,false);
        int casos = e.nextInt();
        int aux, aux2;
        for(int i=0; i<casos; i++)
        {
            aux = e.nextInt();
            aux2 = e.nextInt();
            if(aux+aux2 >= 0)
                pw.println("SI");
            else
                pw.println("NO");
        }
        pw.close();
    }
}
