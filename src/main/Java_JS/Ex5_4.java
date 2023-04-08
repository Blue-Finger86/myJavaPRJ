import java.util.Arrays;

public class Ex5_4 {
    // 배열의 섞기 ==> 셔플
    public static void main(String[] args) {
        int[]numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; //정수형 배열 numArr 선언 후 값 직접 대입, 내가 섞을 배열
        System.out.println(Arrays.toString(numArr)); // 배열 numArr출력

        for(int i=0; i<100; i++){  // 0부터 시작해서 100보다 작아질 때까지 1씩 커가면서 반복 => 100번 반복하라는 뜻
            int n = (int)(Math.random() * 10); // 변수 n에 랜덤으로 뽑고 10을 곱한 값을 대입한다.(1
            int tmp = numArr[0];  // 배열의 첫번째 인덱스 값을 tmp라는 변수에 담음(비어 있는 새로운 변수가 하나 필요한 이유는 두 개의 컵 속 내용물을 서로 바꾼다고 할 때,
                                  // 하나의 컵을 비워야 다른 걸 받을 수 있으니까. 우유랑 콜라랑 서로 컵을 바꾸려면 콜라를 일단 다른 컵에 담아야 우유를 빈 컵이 받을 수가 있잖아
            numArr[0] = numArr[n]; // 배열의 n번째 인덱스 값을 배열의 첫번째 인덱스에 담음
            numArr[n] = tmp; // tmp가 가진 값을 배열의 n번째 인덱스에 담음 ==> 섞고 섞고 또 섞기

            System.out.println(Arrays.toString(numArr)); // 이렇게 쓰면 100번 동안 섞는 과정을 다 출력해줌
        }
        //System.out.println(Arrays.toString(numArr)); // 내가 배열의 순서를 다 바꿔놨으니까 그 상태 그대로 출력해줘(섞인 배열이 출력)
    }
}
