import java.util.Arrays;
import java.util.Scanner;

public class Qz0417 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 입력할 거니까 스캐너 선언하기

        int[] a = new int[5];  // 5개 입력할 거라고 했으니까 길이가 5인 배열 만들기

        for (int i = 0; i < a.length; i++) { // 반복해서 배열에 값 입력하기
            a[i] = sc.nextInt();  // 차례대로 값 들어가기
        }

        int j = a.length;
        for (int i = 0; i < j; i++) {
            for (int k = i + 1; k < j; k++) {
                if (a[i] == a[k]) {
                    a[k] = a[k + 1];
                    j--;
                    i = 0;
                    k = 0;
                }
            }
        }

        for(int i = 0; i < j; i++) {
            System.out.print(Arrays.toString(a));
        }
    }
}







        /*
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                if (a[i] != a[j]) {
                    j = i;
                    System.out.print(Arrays.toString(a));
                } else {
                    return;
                }
            }
        }
    }
}*/






