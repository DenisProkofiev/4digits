package Numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Helper {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String s) {
        System.out.print(s);
    }

    public static String readMessage() {
        String string = null;
        do {
            try {
                string = reader.readLine();
            } catch (IOException e) {
                Helper.writeMessage("Возникла ошибка, вы ввели неправильную строку, попробуйте еще раз");
                continue;
            }
        } while (string == null && string.length() != 4);

        return string;
    }
}
