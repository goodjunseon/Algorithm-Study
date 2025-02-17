import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];

        int sum = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
        String strSum = String.valueOf(sum);

        for (int i = 0; i < strSum.length(); i++) {
            arr[strSum.charAt(i) - '0']++;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
