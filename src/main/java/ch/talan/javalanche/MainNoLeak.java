package ch.talan.javalanche;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.Arrays.asList;

/**
 * Created by MonCherWatson on 20/03/2017.
 */
public class MainNoLeak {
    public static void main(String... args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        MyService myService = new MyService();

        try {
            executorService.invokeAll(asList(
                    myService::calculate
                    , myService::calculate
                    , myService::calculate
                    , myService::calculate
                    , myService::calculate));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
