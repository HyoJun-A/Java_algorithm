package input_output;

import java.util.Scanner;

public class Minus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int C = A - B;
        System.out.println(C);

        sc.close();
    }
}
