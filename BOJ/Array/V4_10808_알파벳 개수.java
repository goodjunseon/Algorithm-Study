import java.io.*;
import java.util.*;

/* 주어진 길이 N의 int 배열 arr에서 합이 100인 서로 다른 위치의 두 원소가 존재하면 1을,
 * 존재하지 않으면 0을 반환하는 함수 func2(int arr[], int N)을 작성하라.
 * arr의 각 수는 0 이상 100 이하이고 N은 1000 이하이다.
 * func2({1,52,48},3) = 1,
 * func2({50,42},2) = 0,
 * func2({4,13,63,85},4) = 1
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26]; // 알파벳 개수를 저장하는 배열
        String s = br.readLine(); // 단어 입력받기
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            arr[c - 97]++; // 개수 1개씩 늘려주기
            }
        for (int i = 0; i < 26; i++){
            System.out.print(arr[i] + " ");
        }


    }
}
