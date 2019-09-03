import java.io.PrintWriter;
import java.util.Scanner;

public class problem_368 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out, false);
        int h, c;
        while((h=e.nextInt()) >0 && (c=e.nextInt()) >0)
        {
            int coccion = 10;
            for(; true;)
            {
                if(h<=c){
                pw.println(coccion);
                break;}
            else
                coccion+=10;
                h=h-c;
            }
            
        }
        pw.close();
    }
}
