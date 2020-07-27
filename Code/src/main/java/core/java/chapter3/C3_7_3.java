package core.java.chapter3;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @author: huakaimay
 * @since: 2020-07-27
 */
public class C3_7_3 {
    public static void main(String[] args) {
        String property = System.getProperty("user.dir");
        System.out.println(property);
        try {
            Scanner scanner = new Scanner(Paths.get("/Users/wentimei/Downloads/Calibration.txt"), "GBK");
            PrintWriter printWriter = new PrintWriter("/Users/wentimei/Downloads/test.txt");

            while (scanner.hasNext()) {
                String s = scanner.nextLine();
                printWriter.println(s);
                printWriter.flush();
            }
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
