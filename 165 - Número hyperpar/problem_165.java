import java.io.PrintWriter;
import java.util.Scanner;
public class problem_165 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out,false);
        int num;
        do
        {
            Boolean ban = true;
            String Stnum = e.nextLine();
           num = Integer.parseInt(Stnum);
           if(num<0)
               break;
           for(int i=0; i<Stnum.length(); i++)
           {
               int n = (int)Stnum.charAt(i);
               if(n%2==0) {
               } else
                   ban = false;
           }
           
           if(ban)
               pw.println("SI");
           else
               pw.println("NO");
        }while(num>=0);
        pw.close();
    }
}
