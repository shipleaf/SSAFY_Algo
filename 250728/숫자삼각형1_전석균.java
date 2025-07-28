import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 풀이 시간: 18:24 ~ 40
// 핵심 아이디어: 행은 자동으로 바뀌고 열이 0, 1, 2, 3... 포함되고 있다.
public class 숫자삼각형1_전석균 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        int num = 1;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                arr[i][j] = num;
                num++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != 0) {
                    System.out.printf("%2d", arr[i][j]);
                    System.out.print(" ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}