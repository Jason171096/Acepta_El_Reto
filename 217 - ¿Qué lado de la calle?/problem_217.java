import java.util.Scanner;

public class problem_217 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int num;
        do
        {
            num = e.nextInt();
            if(num == 0)
                break;
            else if(num%2==0)
                System.out.println("DERECHA");
            else
                System.out.println("IZQUIERDA");
        }while(num != 0);
    }
}
