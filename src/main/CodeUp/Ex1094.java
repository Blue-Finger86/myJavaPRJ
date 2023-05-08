import java.util.Scanner;

public class Ex1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[]k = new int[n];

        for(int i = 0; i < n; i++) {
            k[n-1-i] = sc.nextInt();
        }

        for(int i = 0; i < k.length; i++) {
            System.out.print(k[i]+" ");
        }
    }
}
