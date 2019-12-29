package Game;
import java.time.Duration;
import java.time.LocalDateTime;

public class Speeltijd {
    private static Duration totaleSpeeltijd;
   private static LocalDateTime startTijd;
   private static LocalDateTime eindTijd;
   public void start(){
       startTijd = LocalDateTime.now();
    }
    public void einde()
    {
        eindTijd = LocalDateTime.now();
    }
    public static int berekenSpeeltijd()
    {
        totaleSpeeltijd = Duration.between(eindTijd, startTijd);
        totaleSpeeltijd.toSeconds();
        return 0;
    }
}
