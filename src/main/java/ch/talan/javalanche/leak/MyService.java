package ch.talan.javalanche.leak;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by MonCherWatson on 20/03/2017.
 */
public class MyService {
    public BigDecimal calculate() {
        while (true) {
            try {
//                Files.readAllBytes(Paths.get("./src/main/resources/github-git-cheat-sheet.pdf"));
                Files.readAllBytes(Paths.get("./src/main/resources/file.jpg"));
//                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
