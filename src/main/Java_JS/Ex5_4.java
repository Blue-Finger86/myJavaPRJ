import java.util.Arrays;

public class Ex5_4 {
    // 배열의 섞기 ==> 셔플
    public static void main(String[] args) {
        int[]numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; //정수형 배열 numArr 선언 후 값 직접 대입
        System.out.print(Arrays.toString(numArr)); // 배열 numArr출력

        for(int i=0; i<100; i++){  // 0부터 시작해서 100보다 작아질 때까지 1씩 커가면서 반복
            int n = (int)(Math.random() * 10); // 변수 n에다가 랜덤으로 뽑고 10을 곱한 값을 대입한다.
            int tmp = numArr[0];  // 배열의 첫번째 인덱스 값을 tmp라는 변수에 담음
            numArr[0] = numArr[n]; // 배열의 n번째 인덱스 값을 배열의 첫번째 인덱스에 담음
            numArr[n] = tmp; // tmp가 가진 값을 배열의 n번째 인덱스에 담음
        }
        System.out.println(Arrays.toString(numArr)); // 내가 배열의 순서를 다 바꿔놨으니까 그 상태 그대로 출력해줘
    }
}
