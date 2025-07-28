/*
    메모리: 14276KB
    시간: 104ms
    난이도: 실버 5
    아이디어: 도화지를 100 x 100으로 두고 배열을 생성, 예제 입력 케이스 10 x 10 사이즈 만큼 값을 1로 변경한다.
    배열을 채운 후에 다시 도화지 배열을 돌면서 값이 1인 것을 찾으면 끝!
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2563_색종이_김선엽 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] board = new int[100][100]; // 도화지 배열

        for (int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()); // 각 라인을 읽음
            int x = Integer.parseInt(st.nextToken()); // x, y 토큰화 후 숫자로 변환
            int y = Integer.parseInt(st.nextToken());

            for(int j = x; j < x+10; j++) { // 도화지를 1로 칠하기
                for (int k = y; k < y + 10; k++) {
                    board[j][k] = 1;
                }
            }
        }

        int area = 0;
        for(int i = 0; i < 100; i++){ // 1인곳 반환
            for(int j = 0; j < 100; j++){
                if (board[i][j] == 1){
                    area++;
                }
            }
        }
        System.out.println(area);
    }
}
