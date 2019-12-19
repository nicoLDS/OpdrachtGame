package Game;

public class Level {

    public static void LevelBepalen(int keuzeLevel)
    {
        String naamLevel;
       if (keuzeLevel == 1)
       {
           naamLevel = "BEGINNER";
           LevelKopelenMetSpelbord(naamLevel);
       }
       else if (keuzeLevel == 2)
       {
           naamLevel = "GEMIDDELD";
           LevelKopelenMetSpelbord(naamLevel);
       }
       else if (keuzeLevel == 3)
       {
           naamLevel = "ERVAREN";
           LevelKopelenMetSpelbord(naamLevel);
       }
    }
    public static void LevelKopelenMetSpelbord(String naamLevel)
    {
        if (naamLevel == "ERVAREN")
        {
            int[][] coordinaten = new int[9][9];
            int[][] kaart =  new int[9][9];
            Spelbord.RandomGenererenLevel3(kaart);
            Spelbord.ToonSpelbordLevel3(coordinaten , kaart);
        }
        else if (naamLevel == "BEGINNER")
        {
            int [][] coordinaten = new int[3][3];
            int [][] kaart = new int[3][3];
            Spelbord.RandomGenererenLevel1(kaart);
            Spelbord.ToonSpelbordLevel1(coordinaten,kaart);
        }
        else if (naamLevel == "GEMIDDELD")
        {
            int [][] coordinaten = new int[6][6];
            int [][] kaart = new int[6][6];
            Spelbord.RandomGenererenLevel2(kaart);
            Spelbord.ToonSpelbordLevel2(coordinaten, kaart);
        }
    }
    public static void GameStartLevel(int keuzeLevel)
    {
        if (keuzeLevel == 1)
        {
            Spel.MemorySpelLevel1();
        }
        else if (keuzeLevel == 2)
        {
            Spel.MemorySpelLevel2();
        }
        else if (keuzeLevel == 3)
        {
            Spel.MemorySpelLevel3();
        }
    }


}
