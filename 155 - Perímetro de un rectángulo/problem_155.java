import java.io.PrintWriter;
import java.util.Scanner;


public class problem_155 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out, false);
        int x, y;
        int perimetro;
        while((x = e.nextInt())>=0 && (y = e.nextInt())>=0)
        {
            perimetro = 2*(x + y);
            System.out.println(perimetro);
        }
        pw.close();
    }
}
