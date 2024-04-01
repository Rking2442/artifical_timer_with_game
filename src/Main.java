import javax.swing.*;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends MyFrame {
    public static void main(String[] args) {
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            int Counter = 10;

            @Override
            public void run() {
                //System.out.println("Task Is complete");
                if (Counter > 0) {
                    System.out.println(Counter + " seconds");
                    Counter--;

                } else {
                    System.out.println("New Game For You");
                    MyFrame frame = new MyFrame();
                    timer.cancel();
                    if (frame.label.getX() == 200 && frame.label.getY() == 200)
                    {
                        frame.dispose();
                        System.out.println("You Won Good Job");


                    }
                }

            }
        };
        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, 2024);
        date.set(Calendar.MONTH, Calendar.MARCH);
        date.set(Calendar.DAY_OF_MONTH, 31);
        date.set(Calendar.HOUR_OF_DAY, 12);
        date.set(Calendar.MINUTE, 12);
        date.set(Calendar.SECOND, 50);
        date.set(Calendar.MILLISECOND, 0);
        int timer2 = 25;
        timer2--;


        //timer.schedule(task, date.getTime());
        if (timer2 == 0) {
            timer.scheduleAtFixedRate(task, date.getTime(), 1000);
        }
    }
}