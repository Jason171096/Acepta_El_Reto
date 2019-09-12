import java.util.Scanner;
public class problem_293 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int casos = e.nextInt();
        int insecto, aracnido, crustaceos, 
                escolopendras, anillos, total=0;
        for(int j=0; j<casos; j++)
        {
            total=0;
            insecto = e.nextInt();
            aracnido = e.nextInt();
            crustaceos = e.nextInt();
            escolopendras = e.nextInt();
            anillos = e.nextInt();
            total = (insecto*6)+(aracnido*8)+
                    (crustaceos*10)+
                    (escolopendras*(anillos*2));
            System.out.println(total);
        } 
    }
}
