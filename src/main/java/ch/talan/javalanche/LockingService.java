package ch.talan.javalanche;

import java.util.Date;

/**
 * Created by MonCherWatson on 21/03/2017.
 */
public class LockingService {

    public synchronized Date lockIt() {
        while (true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Date date = new Date();
            System.out.println(date);
        }
    }
}
