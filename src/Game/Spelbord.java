package Game;
public class Spelbord {
    public static void ToonSpelbord(int[][] coordinaten, int[][] kaart)
    {
        System.out.println("  | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |");
        System.out.println("__|____________________________________");
        for (int i = 0; i < coordinaten.length; i++)
        {
            System.out.print((i + 1) + " | " ) ;
            for (int j = 0; j < coordinaten[i].length; j++)
            {
                if (coordinaten[i][j] == 0){
                    System.out.print(coordinaten[i][j]);
                    System.out.print(" \t");
                }
                else
                {
                    System.out.print(" \t");
                    System.out.print(" * ");
                }
            }
            System.out.println();

        }
        System.out.println();
    }
    public static void main(String[] args) {

    }

}
