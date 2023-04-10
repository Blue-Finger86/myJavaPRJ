import java.util.Arrays;
import java.util.Scanner;
public class Qz0409_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //배열 길이 잡기!

        int[]arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            int num = sc.nextInt(); // 배열에 들어갈 수들 내가 정한 길이만큼 입력해라
            arr[i] = num;  // 배열에 값 집어 넣고
            if( i != 0 ) {   // 중복 확인할 조건문 집어 넣음
                for(int j = 0; j < i; j++) {
                    if(arr[i]==arr[j]){
                        System.out.println("중복 \n");
                        --i;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));  // 배열 출력

        int tmp = 0;  // 값 비교할 때 쓸 변수 설정

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
