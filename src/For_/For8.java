package For_;

import java.util.Scanner;

public class For8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < i + 1; ++j) {
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}
// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제