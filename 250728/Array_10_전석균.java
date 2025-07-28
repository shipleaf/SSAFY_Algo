// 풀이 시간: 23: 30 ~ 24:08
// 핵심 아이디어: 각자 주석으로 작성함.

public class Array_10_전석균 {
    private static int R = 4, C = 5;
    private static char[][] map;
    private static StringBuilder output = new StringBuilder();

    private static void setup() {
        map = new char[R][C];
        int a = 'A';
        // TODO: 위 배열을 알파벳 대문자 A ~ T로 초기화 하시오.
        for(int i = 0; i < R; i++) {
            for(int j = 0; j < C; j++) {
                map[i][j] = (char)(a++);
            }
        }
        // END
    }

    public static void main(String[] args) {
        setup();
//        rowFirst();
//        colFirst();
//        zigzag();
        snail();
    }

    private static void rowFirst() {
        // TODO: 행우선 탐색을 작성하시오.
        for(int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                output.append(map[i][j]);
            }
        }
//        System.out.println(output.toString());
        // END
        System.out.println(output.toString().equals("ABCDEFGHIJKLMNOPQRST"));
    }

    private static void colFirst() {
        // TODO: 열우선 탐색을 작성하시오.
        for(int i = 0; i < C; i++) {
            for(int j = 0; j < R; j++) {
                output.append(map[j][i]);
            }
        }
        // END
        System.out.println(output.toString().equals("AFKPBGLQCHMRDINSEJOT"));
    }

    private static void zigzag() {
        // TODO: zigzag 탐색을 작성하시오.
        // 행이 짝수면 정방향, 행이 홀수면 역방향으로 추가하자.
        for(int i = 0; i < R; i++) {
            if(i % 2 == 0) {
                for(int j = 0; j < C; j++) {
                    output.append(map[i][j]);
                }
            }else {
                for(int j = C-1; j >= 0; j--) {
                    output.append(map[i][j]);
                }
            }
        }
        // END
        System.out.println(output.toString().equals("ABCDEJIHGFKLMNOTSRQP"));
    }

    private static void snail() {
        // TODO: 달팽이 탐색을 작성하시오.
        // 아이디어: 달팽이가 직진하다가 벽에 부딪히면(인덱스 범위를 벗어나면) 방향을 바꿔 진행한다. 더 이상 직진하지 못할 때 종료
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};
        boolean[][] visited = new boolean[R][C];
        int d = 0; // 0,1,2,3 방향
        int x = 0;
        int y = 0;
        int turnTime = 0;
        while(true) {
            // 4번 머리 돌리면 종료
            if(turnTime == 4) {
                break;
            }

            if(!visited[x][y]) {
                output.append(map[x][y]);
            }
            visited[x][y] = true;

            // 직진
            int nx = x + dx[d];
            int ny = y + dy[d];
            // 만약 다음 칸이 배열 범위 밖이거나 이미 간 곳일 경우
            if(!isIn(nx, ny) || visited[nx][ny]) {
                d = (d + 1) % 4;
                x = x + dx[d];
                y = y + dy[d];
                turnTime += 1;
            } else {
                x = nx;
                y = ny;
                turnTime = 0;
            }

        }
        System.out.println(output.toString());
        
        // END
        System.out.println(output.toString().equals("ABCDEJOTSRQPKFGHINML"));
    }

    private static boolean isIn(int r, int c) {
        return 0<=r && r<R && 0<=c && c<C;
    }

}
