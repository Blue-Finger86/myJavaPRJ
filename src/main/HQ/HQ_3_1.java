import java.util.Scanner;
public class HQ_3_1 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            //출석을 부를 횟수를 Scanner객체 s를 통해 입력받아 변수 n에 저장
            int n = s.nextInt();
            //불려진 출석 번호를 저장할 배열
            int[] arr = new int[n];
            //불려진 출석 번호를 배열 arr에 저장
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
        /* 1~23번이 출석 불린 횟수를 저장할 정수형 배열 선언
        1~23번이 출석 불린 횟수를 answer[0]~answer[22]에 저장
        0으로 자동 초기화*/
            int[] answer = new int[23];
            //출석 부른 횟수만큼 반복하며, 불린 출석 번호에 해당하는 출석 횟수 저장 공간의 값 1추가
            //각 반복 속에서 불려진 출석 번호는 arr[i]임, 해당 번호가 불려진 횟수는 answer[번호-1]에 저장됨
            //출석 번호는 1부터 시작하지만, 배열 인덱스는 0부터 시작하므로
            for (int i = 0; i < n; i++) {
                answer[arr[i]-1]++;
            }
            //일렬로 출력
            for (int i = 0; i < 23; i++)
                System.out.print(answer[i] + " ");
        }

}

