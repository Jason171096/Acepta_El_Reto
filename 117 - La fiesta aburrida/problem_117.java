import java.util.Scanner;
public class problem_117 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int casos = e.nextInt();
        String[] nombres = new String [casos];
        for(int i=0; i<casos; i++)
        {
            e.next();
            nombres[i] = e.nextLine();
        }
        for(int i=0; i<casos; i++)
        {
            System.out.println("Hola," + nombres[i] + ".");
        }
    }
}
