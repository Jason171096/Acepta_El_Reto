import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
public class problem_140 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out,false);
        String cadnum;
        int num;
        char[] cadena = new char[0];
        int total;
        do
        {
            cadnum = e.next();
            num = Integer.parseInt(cadnum);
            cadena = new char[cadnum.length()];
            total = 0;
            if(num<0)
                break;
            cadena = cadnum.toCharArray();
            
            int[] numeros = new int[cadnum.length()];
            
            for(int i=0; i<cadnum.length(); i++)
            {
                numeros[i] = (int)cadena[i] - 48;
            }
            
            for (int i = 0; i < numeros.length; i++) {
                total += numeros[i];
            }

            for (int i = 0; i < cadnum.length() - 1; i++) {
                pw.print(cadena[i] + " + ");
            }
            pw.print(cadena[cadnum.length() - 1]);
            pw.print(" = " + total);
            pw.println();
        } while (num >= 0);

        pw.close();
    }
}
