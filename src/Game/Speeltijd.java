package Game;
import java.util.Timer;
import java.util.TimerTask;

public class Speeltijd {
    int seconden = 0;
    Timer timer = new Timer();
    TimerTask task= new TimerTask() {
        @Override
        public void run() {
            seconden+=10;
            System.out.println("gepasseerde seconden "+ seconden);
        }
    };
    public void start(){
        timer.scheduleAtFixedRate(task,10000,10000);
    }
}
