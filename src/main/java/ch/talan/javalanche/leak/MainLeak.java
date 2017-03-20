package ch.talan.javalanche.leak;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.Arrays.asList;

/**
 * Created by MonCherWatson on 20/03/2017.
 */
public class MainLeak {
    public static void main(String... args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        LeakingService leakingService = new LeakingService();
        MyService myService = new MyService();


        try {
            executorService.invokeAll(asList(
                    myService::calculate,
                    myService::calculate,
//                    leakingService::doingStuff,
                    leakingService::doingStuff));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
