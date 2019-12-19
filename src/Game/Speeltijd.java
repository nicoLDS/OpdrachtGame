package Game;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;

public class Speeltijd {
    Duration totaleSpeeltijd;
    LocalDateTime startTijd;
    LocalDateTime eindTijd;
   public void start(){
       startTijd = LocalDateTime.now();
    }
    public void einde()
    {
        eindTijd = LocalDateTime.now();
    }
    public void berekenSpeeltijd()
    {
        totaleSpeeltijd = Duration.between(eindTijd, startTijd);
        totaleSpeeltijd.toSeconds();
    }
}
