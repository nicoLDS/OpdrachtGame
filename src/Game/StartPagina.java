package Game;

import java.util.Scanner;

public class StartPagina {
    public static void main(String[] args)
    {
             String gebruikersnaam = null;
             int keuzeLevel;
            Scanner keyboard = new Scanner(System.in);
            System.out.println("WELKOM OP HET MEMORYSPEL VAN SID EN NICOLAAS");
            System.out.println("GELIEVE JE GEBRUIKERSNAAM IN TE GEVEN");
            gebruikersnaam = keyboard.nextLine();
            System.out.println("MAAK EEN KEUZE WELK LEVEL JE WILT SPELEN " + gebruikersnaam + " !");
            System.out.println("MOGELIJKE LEVELS:");
            System.out.println("1. BEGINNER");
            System.out.println("2. GEMIDDELD");
            System.out.println("3. ERVAREN");
            keuzeLevel = keyboard.nextInt();
            Level.LevelBepalen(keuzeLevel);
            System.out.println("UITSTEKEND! ,  KEUZE : " + keuzeLevel);
            System.out.println("WIJ WENSEN U VEEL PLEZIER !!!");
            System.out.println("LATEN WE BEGINNEN");
            Level.GameStartLevel(keuzeLevel);
    }
}
