package Game;
import java.util.Scanner;
public class Memorie{
    public static void main(String[] args) {
        int[][] coordinaten = new int[9][9];
        int[][] kaart = new int[9][9];
        boolean gevonden = false;
        Spelbord.RandomGenereren(kaart);
        Spelbord.ToonSpelbord(coordinaten, kaart);
        Scanner keyboard = new Scanner(System.in);
        // SPEL START
        int anoniemePlaatsjes = 81;
        while (anoniemePlaatsjes > 0)
        {
            System.out.println("Geef de eerste Cooridnaat");
            String Coordinaat1 = keyboard.next();
            int x = Integer.valueOf(Coordinaat1.substring(0,1))-1;
            int y = Integer.valueOf(Coordinaat1.substring(1,2))-1;
            System.out.println(kaart[x][y]);

            System.out.println("Geef de tweede Coordinaat");
            String Cordinaat2 = keyboard.next();
            int x2 = Integer.valueOf(Cordinaat2.substring(0,1)) -1;
            int y2 = Integer.valueOf(Cordinaat2.substring(1,2)) -1;
            System.out.println(kaart[x2][y2]);
            if (kaart[x][y] == kaart[x2][y2])
            {
                    System.out.println("U hebt een combinatie gevonden! ");
                    coordinaten[x][y] = 0;
                    coordinaten[x2][y2] = 0;
                    anoniemePlaatsjes -= 2;
            }
            }
        }
    }




