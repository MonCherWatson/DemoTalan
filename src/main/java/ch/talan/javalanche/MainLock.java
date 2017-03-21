package ch.talan.javalanche;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.Arrays.asList;

/**
 * Created by MonCherWatson on 21/03/2017.
 */
public class MainLock {
    public static void main(String... args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        LockingService lockingService = new LockingService();

        try {
            executorService.invokeAll(asList(
                    lockingService::lockIt,
                     lockingService::lockIt,
                     lockingService::lockIt,
                     lockingService::lockIt,
                     lockingService::lockIt));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
