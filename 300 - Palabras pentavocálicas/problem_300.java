import java.io.PrintWriter;
import java.util.Scanner;
public class problem_300 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out, false);
        int casos = e.nextInt();
        for(int i = 0; i<casos; i++)
        {
            String cadena = e.next();
                if ((cadena.contains("a")) && (cadena.contains("e")) && (cadena.contains("i")) && (cadena.contains("o")) && (cadena.contains("u")))
                    pw.println("SI");
                else
                    pw.println("NO");
        }
        pw.close();
    }
}
