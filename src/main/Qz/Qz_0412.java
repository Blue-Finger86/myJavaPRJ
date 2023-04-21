import java.util.Scanner;
public class Qz_0412 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]a = new int[5];

        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int max = a[0];
        int min = a[0];
        int sum = 0;
        float avg = 0;

        for(int i = 0; i < a.length; i++) {
            if(a[i] > max) {
                max = a[i];
            } else if(a[i] < min) {
                min = a[i];
            }
            sum = sum + a[i];
        }
        avg = sum/(float)a.length;

        System.out.printf("최대값은 %d 최소값은 %d 평균은 %f", max, min, avg);
    }
}
