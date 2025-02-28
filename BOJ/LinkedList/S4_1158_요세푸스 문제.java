import org.w3c.dom.Node;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int index = 0;


        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while (!list.isEmpty()){
            index += K;
            index = (index-1) % list.size();

            if (list.size() > 1) {
                sb.append(list.get(index));
                sb.append(", ");
            } else {
                sb.append(list.get(index));
                sb.append(">");
            }
            list.remove(index);
        }
        System.out.println(sb);
    }
}

