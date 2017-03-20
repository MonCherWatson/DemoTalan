package ch.talan.javalanche.leak;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by MonCherWatson on 20/03/2017.
 */
public class LeakingService {
    public static List<BigDecimal> leaker = new ArrayList<>();

    public List<BigDecimal> doingStuff() {
        sleep(10000);
        double counter = 0;
        while (true) {
            try {
                counter++;
                leaker.add(new BigDecimal(counter));
//                sleep(5);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
