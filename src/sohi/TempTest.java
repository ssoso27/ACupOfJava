package sohi;

import java.util.HashMap;

public class TempTest {
    public static void main(String[] args) {
        HashMap<String, Integer> runner = new HashMap<>();
        runner.put("aa", 22);

        int count = runner.get("ab");
        System.out.println(count);
    }
}