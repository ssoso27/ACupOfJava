package sohi;

import java.util.Scanner;

public class TempTest {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String p=sc.nextLine();
        String first = p.substring(0,1);

        for(int a = 1; a <= p.length() / 2; a++){
            int b = a + a - 1; // 단어의 끝 index
            String target = p.substring(a, a+1);

            if(first.equals(target)) { // 첫글자랑 같으면
//                String pattern = p.substring(0, a+1);
                String pattern = p.substring(0, a);
                String nextWord = p.substring(a, b+1);

                if(pattern.equals(nextWord)){
                    System.out.println(a);
                }
            }
        }
    }
}