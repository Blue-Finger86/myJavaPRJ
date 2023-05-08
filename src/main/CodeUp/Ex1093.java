import java.util.Scanner;

public class Ex1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[]a = new int[n];

        for(int i = 0; i < a.length; i++) {
            int x = sc.nextInt();
            a[x-1]++;
        }

        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
