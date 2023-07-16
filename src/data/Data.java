package data;

import java.util.ArrayList;
import java.util.Scanner;
import classes.*;
import interfaces.Perawatan;

public class Data 
{
    public static ArrayList<Tanaman> tanamans;    
    public static ArrayList<Integer> lokasi;
    public static Scanner in;
    private static int masaTanaman;

    public static void invoke()
    {
        tanamans = new ArrayList<>();
        lokasi = new ArrayList<>();
        in = new Scanner(System.in);
    }

    public static void mulai()
    {
        System.out.println("-".repeat(40));
        System.out.println("SISTEM UAP PBO 23");
        System.out.println("MADE BY DEVAN FERREL");
        System.out.println("225150600111031");
        System.out.println("-".repeat(40));

        int bulan = inputInt("Masukkan masa tanam (bulan)");
        int hari = bulan * 30;
        masaTanaman = hari;

        for (int i = 0; i < 3; i++)
        {
            System.out.println("-".repeat(40));
            System.out.printf("Pilihlah tanaman yang mau ditanam\n");
            System.out.printf("1. Tomat\n");
            System.out.printf("2. Stroberi\n");
            System.out.printf("3. Persik \n");
            char choice = inputChar("Masukkan pilihan");
            handlerChoice(choice);
        }

        prosessing();
    }

    public static void menanam()
    {
        System.out.println("-".repeat(40));
        System.out.println("INFO KOMANDAN");
        System.out.println("Tanaman telah mati");
        System.out.println("-".repeat(40));
        System.out.printf("Pilihlah tanaman yang mau ditanam\n");
        System.out.printf("1. Tomat\n");
        System.out.printf("2. Stroberi\n");
        System.out.printf("3. Persik \n");
        char choice = inputChar("Masukkan pilihan");
        handlerChoice(choice);   
    }

    public static void info()
    {
        int i  = 0;
        System.out.println("-".repeat(40));
        System.out.println("INFO TANAMAN");
        System.out.println("-".repeat(40));
        for(Tanaman plant : tanamans)
        {
            System.out.printf("TANAMAN KE %d\n",++i);
            System.out.println(plant);
            System.out.println("-".repeat(40));
        }
    }

    private static void prosessing()
    {
        for (int i = 1; i <= masaTanaman; i++)
        {
            for(int j = 0; j < tanamans.size(); j++)
            {
                if(isVerified(tanamans.get(j), j))
                {
                    tanamans.get(j).tambahLamaHidup();
                    tanamans.get(j).berkembang();
                    if(i % 90 == 0)
                    {
                        ((Perawatan)tanamans.get(j)).treatment();
                    }
        
                    continue;
                }
                if(lokasi.contains(j))
                    continue;
                lokasi.add(j);
                menanam();
            }
        }

        System.out.println("-".repeat(40));
        System.out.println("PROSES PERKEMBANGAN"); 
        System.out.println("-".repeat(40));
    }

    private static boolean isVerified(Tanaman tanaman, int index)
    {
        return tanaman.isAlive();
    }

    private static void handlerChoice(char choice)
    {
        switch(choice)
        {
            case '1' : 
                tanamans.add(new Tomat());
                break;
    
            case '2' :
                tanamans.add(new Stroberi());
                break;
            
            case '3' :
                tanamans.add(new Persik());
                break;
        }
    }

    private static int inputInt(String message) 
    {
        System.out.printf("%s : ", message);
        int a = in.nextInt(); in.nextLine();
        return a;
    }

    private static char inputChar(String message) 
    {
        System.out.printf("%s : ", message);
        char a = in.nextLine().charAt(0);
        return a;
    }
}
