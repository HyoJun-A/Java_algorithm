package For_;

import java.util.Scanner;

public class For9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i < N + 1; ++i) {
            for (int j = 0; j < N; j++) {
                if (j < N - i) {
                    System.out.print(" ");
                } else if (j < N) {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
