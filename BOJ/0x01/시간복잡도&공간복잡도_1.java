import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println("N = " + N);

        func1(N);


    }

    private static void func1(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0 || i % 5 == 0 ) sum += i;
        }
        System.out.println(sum);
    }


}
