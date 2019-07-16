package sohi;

public class TempTest {
    public static void main(String[] args) {
        String[] p = new String[] {"aa", "bb", "cc", "d", "bb"};
        String[] c = new String[] {"aa", "cc", "d", "bb"};

        System.out.println(solution(p, c));
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        for(int i=0;i<participant.length;i++)
            answer += participant[i];
        for(int i=0;i<completion.length;i++)
            answer = answer.replaceFirst(completion[i], "");
        return answer;
    }
}