import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();

        int[] alpha1 = new int[26];
        int[] alpha2 = new int[26];
        int cnt = 0;

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        for (char c : chars1) alpha1[c-97]++;
        for (char c : chars2) alpha2[c-97]++;

//        System.out.println("alpha1 = " + Arrays.toString(alpha1));
//        System.out.println("alpha2 = " + Arrays.toString(alpha2));

        for (int i = 0; i < 26; i++) {
            if (alpha1[i] != alpha2[i]) {
               if(alpha1[i] > alpha2[i]){
                   cnt += alpha1[i]-alpha2[i];
               } else cnt += alpha2[i] - alpha1[i];
            }
        }

        System.out.println(cnt);





    }
}
