package Game;

import java.util.Scanner;

public class Spel {
    public static  void MemorySpelLevel1()
    {
        int[][] coordinaten = new int[3][3];
        int[][] kaart = new int[3][3];
        Scanner keyboard = new Scanner(System.in);
        //Speeltijd speeltijd = new Speeltijd();
        //speeltijd.start();
        Spelbord.RandomGenererenLevel1(kaart);
        // SPEL START
        int anoniemePlaatsjes = 9;
        while (anoniemePlaatsjes > 0)
        {
            System.out.println("Geef het eerste Cooridnaat");
            String Coordinaat1 = keyboard.next();
            int x = Integer.valueOf(Coordinaat1.substring(0,1))-1;
            int y = Integer.valueOf(Coordinaat1.substring(1,2))-1;
            System.out.println(kaart[x][y]);
            System.out.println("Geef het tweede Coordinaat");
            String Cordinaat2 = keyboard.next();
            int x2 = Integer.valueOf(Cordinaat2.substring(0,1)) -1;
            int y2 = Integer.valueOf(Cordinaat2.substring(1,2)) -1;
            System.out.println(kaart[x2][y2]);
            if (coordinaten[x][y] == coordinaten[x2][y2])
            {
                System.out.println("U hebt een combinatie gevonden! ");
                coordinaten[x][y] = kaart[x][y];
                coordinaten[x2][y2] = kaart[x2][y2];
                anoniemePlaatsjes -= 2;
            }
        }
    }
    public static void MemorySpelLevel2()
    {
        int[][] coordinaten = new int[6][6];
        int[][] kaart = new int[6][6];
        Scanner keyboard = new Scanner(System.in);
        Spelbord.RandomGenererenLevel2(kaart);
        // SPEL START
        int anoniemePlaatsjes = 81;
        while (anoniemePlaatsjes > 0)
        {
            System.out.println("Geef het eerste Cooridnaat");
            String Coordinaat1 = keyboard.next();
            int x = Integer.valueOf(Coordinaat1.substring(0,1))-1;
            int y = Integer.valueOf(Coordinaat1.substring(1,2))-1;
            System.out.println(kaart[x][y]);
            System.out.println("Geef het tweede Coordinaat");
            String Cordinaat2 = keyboard.next();
            int x2 = Integer.valueOf(Cordinaat2.substring(0,1)) -1;
            int y2 = Integer.valueOf(Cordinaat2.substring(1,2)) -1;
            System.out.println(kaart[x2][y2]);
            if (coordinaten[x][y] == coordinaten[x2][y2])
            {
                System.out.println("U hebt een combinatie gevonden! ");
                coordinaten[x][y] = kaart[x][y];
                coordinaten[x2][y2] = kaart[x2][y2];
                anoniemePlaatsjes -= 2;
            }
        }
    }
    public static void MemorySpelLevel3()
    {
        int[][] coordinaten = new int[9][9];
        int[][] kaart = new int[9][9];
        Scanner keyboard = new Scanner(System.in);
        Spelbord.RandomGenererenLevel3(kaart);
        // SPEL START
        int anoniemePlaatsjes = 81;
        while (anoniemePlaatsjes > 0)
        {
            System.out.println("Geef het eerste Cooridnaat");
            String Coordinaat1 = keyboard.next();
            int x = Integer.valueOf(Coordinaat1.substring(0,1))-1;
            int y = Integer.valueOf(Coordinaat1.substring(1,2))-1;
            System.out.println(kaart[x][y]);
            System.out.println("Geef het tweede Coordinaat");
            String Cordinaat2 = keyboard.next();
            int x2 = Integer.valueOf(Cordinaat2.substring(0,1)) -1;
            int y2 = Integer.valueOf(Cordinaat2.substring(1,2)) -1;
            System.out.println(kaart[x2][y2]);
            if (coordinaten[x][y] == coordinaten[x2][y2])
            {
                System.out.println("U hebt een combinatie gevonden! ");
                coordinaten[x][y] = kaart[x][y];
                coordinaten[x2][y2] = kaart[x2][y2];
                anoniemePlaatsjes -= 2;
            }
        }
    }
}
