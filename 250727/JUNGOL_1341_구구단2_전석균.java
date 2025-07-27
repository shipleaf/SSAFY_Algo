// 핵심 아이디어: 3개 print할때마다 한줄 개행 -> mulNum이 3의 배수일 때 개행하도록
//              구구단 사이에는 한 줄 개행

// 풀이 시간 및 주석: 21:44 ~ 22:07

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JUNGOL_1341_구구단2_전석균 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int mulNum = 1;

        while (true) {
            // mulNum이 9이하일 때 까지 반복
            for(int i = 1; i < 10; i++) {
                System.out.printf("%d * %d = %2d   ", s, i, s*i);
                if (i % 3 == 0) {
                    System.out.println();
                }
            }
            System.out.println();

            // endNum과 e가 같다면 종료
            if (s == e) {
                break;
            } else if (s > e) { // 감소 case
                s--;
            } else {
                s++;
            }
        }

    }
}