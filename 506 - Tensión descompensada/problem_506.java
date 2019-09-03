import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
public class problem_506 {
    public static void main(String[] args) throws IOException{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out,false);
        Scanner e = new Scanner(System.in);
        int num1, num2;
        int casos = e.nextInt();
        for(int i=0; i<casos; i++)
        {         
            num1 = e.nextInt();
            e.next();
            num2 = e.nextInt();
            
            if(num1>=num2)
                pw.println("BIEN");
            else
                pw.println("MAL");   
        }
        pw.close();
    }     
}
