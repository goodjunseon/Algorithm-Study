import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    int value = 0;
    String str = Integer.toString(N);
        int[] arr = new int[10];

        /*
        * case 1) 66 -> (2,0) => (1,1) : 1
        * case 2) ~~~ -> (2,1) => (2,1) : 2
        * case 3) 6669 -> (3,1) => (2,2) : 2
        * case 4) 6669 -> (3,2) => (3,2) : 3  즉 두 수의 차가 1이면 그대로 가면됨
        * case 5) 66669 -> (4,1) => (3,2) : 3
        * case 6) ~~~ -> (4,2) => (3,3) : 3
        * case 7) ~~~ -> (5,3) => (4,4) : 4 즉 두수의 차가 2이면 -1하면 됨
        * case 8) ~~~ -> (5,2) => (4,3) : 4 두수의 차가 3이면 -1 하면 됨
        * case 9) ~~~ -> (6,2) => (4,4) : 두수의 차가 4이면 -2 하면됨
        * 정리 : 두 수의 합이 짝수일 때, 홀수일 때 나눈다.
        * 두 수의 합 : [홀수] -> 두수의 차가 1,3,5,7,9 일때 순서대로 0,-1,-2,-3
        * 두 수의 합 : [짝수] -> 두수의 차가 2,4,6,8,10 일때 순서대로 -1,-2,-3
        * 두수의 차가 1,2,3,4,5,6,7,8 => 0,-1,-1,-2,-2,-3,-3 이런식으로 감
        * 두수의 차 : 결과 : -
        * 0 : 0
        * 1 : 0
        * 2 : 1 (-1)
        * 3 : 2 (-1)
        * 4 : 2 (-2)
        * 5 : 3 (-2)
        * 6 : 3 (-3)
        * 7 : 4 (-3)
        * 8 : 4 (-4)
        * 9 : 5 (-4)
        * */
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - '0']++;
        }

        int six = arr[6];
        int nine = arr[9];

        int minus = (six + nine) / 2;
        int wildnum = six+nine - minus;

        for (int i = 0; i < 10; i++) {
            if(i == 6 || i == 9 ) {
                if( wildnum > value) value = wildnum;
            } else if (arr[i] > value) {
                value = i;
            }
        }
        System.out.println(value);

    }
}
