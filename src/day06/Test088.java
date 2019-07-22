package day06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

class Score {

}

public class Test088 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

        while ( true ) {
            System.out.println("[ M E N U ]");
            System.out.println("1. 새 자료");
            System.out.println("2. 자료 입력");
            System.out.println("3. 파일로 저장");
            System.out.println("4. 파일에서 불러오기");

            LinkedList<Score> l = null;
            if (l.equals("1")) {
                l = new LinkedList<Score>();
            } else if (l.equals("2")) {
//                String str = "10101,100"; // 10101 학생의 점수는 100점
                String str = br.readLine();
            } else if (l.equals("3")) {
                // String str = "score.dat"; // 저장파일명
                String str = br.readLine();
            } else if (l.equals("4")) {
                // String str = "score.dat"; // 파일명
                String str = br.readLine();
            } else if (l.equals("quit")) break;
        }
    }
}
