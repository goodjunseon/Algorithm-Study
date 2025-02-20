import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        for (int i = 0; i < N; i++) {
            int[] alph = new int[26];
            String input = br.readLine();
            String[] words = input.split(" ");
            char[] word1 = words[0].toCharArray();
            char[] word2 = words[1].toCharArray();

            for (char ch : word1) alph[ch - 97]++;
            for (char ch : word2) alph[ch - 97]--;
            boolean flag = true;
            for (int j : alph) {
                if(j!=0) flag = false;
            }
            System.out.println(flag ? "Possible" : "Impossible");
        }
    }
}
