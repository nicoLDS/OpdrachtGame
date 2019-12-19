package Game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StartPagina {
    public static void main(String[] args) throws Exception {
        paginaLaden();

    }
    public static void paginaLaden()
    {
        String gebruikersnaam = null;
        int keuzeLevel = 0;
        try{
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
            if (keuzeLevel > 3 || keuzeLevel < 1)
            {
                throw new Exception("verkeerde invoer");
            }else {
                Level.LevelBepalen(keuzeLevel);

                System.out.println("UITSTEKEND! ,  KEUZE : " + keuzeLevel);
                System.out.println("WIJ WENSEN U VEEL PLEZIER !!!");
                System.out.println("LATEN WE BEGINNEN");
                //Speeltijd speeltijd = new Speeltijd();
                //speeltijd.start();
                Level.GameStartLevel(keuzeLevel);
            }
        }
        catch (Exception ex){
            System.out.println("foutieve invoer, je meot een level tussen 1 en 3 kiezen");
            System.out.println();
paginaLaden();
        }
    }
}
