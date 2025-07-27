import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 시작시간: 14:18 ~ 15: 11 | 주석 단 시간: 15:11 ~
// 핵심 아이디어
// 증가하는 경우와 감소하는 경우를 나눠서 구구단을 출력하자. 그리고 StringBuilder와 끝나는 조건인 mulNum을 사용해서 출력하자.
// 틀린 부분
/*
1. 감소할 때 지역변수를 s가 아닌 e로 설정해버림.
2. 증감식 부분을 --로 해야하는데 ++로 함.
3. 빌어먹을 자바 0 < x < 10이 안되고 &&, || 써야해서 헷갈리네!!!!!!!!!!!!
4. 구구단 결과 숫자로는 2칸의 숫자로 표현되어야 하기 때문에 printf를 사용해 출력해야한다.
5. s,e가 같을 때 예외처리 안됐음.
 */
public class JUNGOL_1291_구구단1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); // StringTokenizer의 기본 delim은 공백 문자들인 \t,\n 등등이 있다.
        int s = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int mulNum = 1;

        while (mulNum < 10) {
            // s,e가 범위 내에 없다면 다시 입력받는다.
            if (s < 2 || s > 9 || e < 2 || e > 9) {
                System.out.println("INPUT ERROR!");
                st = new StringTokenizer(br.readLine());
                s = Integer.parseInt(st.nextToken());
                e = Integer.parseInt(st.nextToken());
                continue;
            }
            // 증가하는 경우
            if (s <= e) {
//                StringBuilder sb = new StringBuilder();
                for (int i = s; i < e + 1; i++) {
//                    sb.append(i);
//                    sb.append(" * ");
//                    sb.append(mulNum);
//                    sb.append(" = ");
//                    sb.append(i * mulNum);
//                    sb.append("   ");
                    System.out.printf("%d * %d = %2d", i, mulNum, i * mulNum);
                    System.out.print("   ");
                }
//                System.out.println(sb.toString());
            }
            // 감소하는 경우
            else if (s >= e) {
//                StringBuilder sb = new StringBuilder();
                for (int i = s; i > e - 1; i--) {
//                    sb.append(i);
//                    sb.append(" * ");
//                    sb.append(mulNum);
//                    sb.append(" = ");
//                    sb.append(i * mulNum);
//                    sb.append("   ");
                    System.out.printf("%d * %d = %2d", i, mulNum, i * mulNum);
                    System.out.print("   ");
                }
//                System.out.println(sb.toString());
            }
            mulNum++;
            System.out.println();
        }
    }
}
