import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 풀이 시간 : 23:12 ~
// 처음 생각한 핵심 아이디어
// 배열로 관리해서 한꺼번에 출력하자. 첫 대각선의 행,열 합은 N-1이라는 규칙을 찾았다.
// 마지막 행,열의 합은 (N-1) * 2이다. -> 종료조건

// 행과 열의 합은 입력이 아니라 출력에서 썼던가? 여기서는 행, 열, 대각선 번호의 규칙으로 풀어야한다.
// "첫" 대각선의 문자 개수는 5개, 행은 0부터 시작, 열은 0부터 시작 -> 여기에서 for문의 값을 설정해야함.
public class JUNGOL_1338_문자삼각형1_전석균 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = 'A';
//        int row = 0;
        int col = n - 1;
        char[][] arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = ' ';
            }
        }

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n - j; i++) {
                arr[i + j][col - i] = (char) (a);
                ++a;
                if (a == (int)('Z' + 1)) {
                    a = 'A';
                }
            }
        }

        for (char[] temp : arr) {
            for (char temp2 : temp) {
                System.out.printf("%c ", temp2);
            }
            System.out.println();
        }
    }
}