import java.util.Arrays;
import java.util.Scanner;

public class Qz0417 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 입력할 거니까 스캐너 선언하기

        int[] a = new int[5];  // 5개 입력할 거라고 했으니까 길이가 5인 배열 만들기

        for (int i = 0; i < a.length; i++) { // 반복해서 배열에 값 입력하기
            a[i] = sc.nextInt();  // 차례대로 값 들어가기
        }

        int h = a.length;  // 길이값을 갖고 있는 변수 선언하고
        for (int i = 0; i < h; i++) {  // 0번째부터 시작하는 애랑
            for (int j = i + 1; j < h; j++) {  //1번째부터 시작하는 애랑 
                if (a[i] == a[j]) {  // 같은지 비교하고 
                    a[j] = a[j + 1];  // 같으면 그 다음 값을 넣어줄 거임(건너 뛴다는 소리)
                    h--;   // 그리고 길이값 하나 줄여주고
                    i = 0;  // 0으로 초기화
                    j = 0;  // 얘도 0으로 초기화 그리고 다시 반복 
                }
            }
        }

       
            System.out.print(Arrays.toString(a));  // 출력하기
       
    }
}