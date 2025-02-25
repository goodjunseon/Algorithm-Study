import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = st.nextToken();
        int N = Integer.parseInt(br.readLine());

        LinkedList<Character> charArr = new LinkedList<Character>();

        for (Character c : str.toCharArray()) {
            charArr.add(c);
        }

//        System.out.println("charArr = " + charArr);

        int index = charArr.size();
//        System.out.println("처음index = " + index);

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            if (input.charAt(0) == 'P'){
//                System.out.println("index = " + index);
                charArr.add(index, input.charAt(2));
                index++;
//                System.out.println(charArr);
            } else if (input.charAt(0) == 'L') {
                if(index > 0) {
                    index--;
//                    System.out.println("index = " + index);
                }
            } else if (input.charAt(0) == 'D') {
                if (index < charArr.size()) {
                    index++;
//                    System.out.println("index = " + index);
                }
            } else if (input.charAt(0) == 'B') {
                if(index > 0) {
                    charArr.remove(index-1);
                    index--;
//                    System.out.println("charArr = " + charArr);
                }

            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : charArr) {
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}

