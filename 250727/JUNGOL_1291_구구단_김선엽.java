import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JUNGOL_1291_구구단_김선엽 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null && !line.isEmpty()) {
            StringTokenizer st = new StringTokenizer(line);
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            if ((2 <= s && s <= 9) && (2 <= e && e <= 9)){
                if (s < e){
                    for (int i = 1; i < 10; i++){
                        System.out.printf("%d * %d = %2d", s, i, (s*i));
                        for (int j = s+1; j < e+1; j++){
                            System.out.printf("   %d * %d = %2d", j, i, (j*i));
                        }
                        System.out.println();
                    }
                } else {
                    for (int i = 1; i < 10; i++){
                        System.out.printf("%d * %d = %2d", s, i, (s*i));
                        for (int j = s-1; j > e-1; j--){
                            System.out.printf("   %d * %d = %2d", j, i, (j*i));
                        }
                        System.out.println();
                    }
                }
            }else {
                System.out.println("INPUT ERROR");
            }

        }
        }
}
