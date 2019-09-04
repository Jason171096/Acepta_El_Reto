import java.util.Calendar;
import java.util.Scanner;

public class problem_157 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        
        int casos = e.nextInt();
        
        for(int i = 0; i<casos; i++)
        {
        int dia = e.nextInt();
        int mes = e.nextInt();
        int year = 1;
        int NocheDia = 31, NocheMes = 12, Nocheyear = 1;
        System.out.println(Calcular(dia, mes, year, NocheDia, NocheMes, Nocheyear));
        }
    }
    public static int Calcular(int dia, int mes, int year, int NocheDia, int NocheMes, int Nocheyear)
    {
        Calendar fechaPedida = Calendar.getInstance();
        fechaPedida.set(year, mes - 1, dia);
        
        Calendar nocheVieja = Calendar.getInstance();
        nocheVieja.set(Nocheyear, NocheMes -1, NocheDia);
        long fin = nocheVieja.getTimeInMillis();
        long inicio = fechaPedida.getTimeInMillis();
        int dias = (int)((Math.abs(fin-inicio))/(86400000));
        return dias;
    }
}
