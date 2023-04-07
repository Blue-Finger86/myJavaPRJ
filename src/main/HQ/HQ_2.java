import java.util.Arrays;
import java.util.Scanner;
public class HQ_2 {
    public static void main(String[] args) {
        int[]std = new int[23]; // 배열 선언 및 생성

        Scanner sc = new Scanner(System.in);   // 직접 입력할 거니까 스캐너 선언 해주고
        int num = 0; // 선생님이 부를 횟수를 담을 변수 선언
        int num2 = 0; // 선생님이 부른 번호들을 담을 변수 선언
        // int num3 = 0; // 번호가 불린 횟수 담을 변수 선언

        num = sc.nextInt(); // 부를 횟수 num이 입력 받아

        for(int i = 0; i <= num-1; i++) {   // 번호들 여러 번 부를게
            num2 = sc.nextInt();  // 내가 부른 번호는 num2가 입력 받아
            // std[i] = num2; // num2가 가진 값을 std[i]에 넘겨줘야해 (이거 물어봐서 친구 도움 받음) -> 애초에 넣으면 안 됐음

            // for(int i = 1; i <= std.length; i++) {
            switch(num2){
                case 1:
                    std[num2-1]++; break; //인덱스 안에 넣는 것도 처음에 std[1], std[2], std[3]이렇게 다 다르게 넣어 놨었는데 친구가 이렇게 써야 한다고 알려줌
                case 2:
                    std[num2-1]++; break;
                case 3:
                    std[num2-1]++; break;
                case 4:
                    std[num2-1]++; break;
                case 5:
                    std[num2-1]++; break;
                case 6:
                    std[num2-1]++; break;
                case 7:
                    std[num2-1]++; break;
                case 8:
                    std[num2-1]++; break;
                case 9:
                    std[num2-1]++; break;
                case 10:
                    std[num2-1]++; break;
                case 11:
                    std[num2-1]++; break;
                case 12:
                    std[num2-1]++; break;
                case 13:
                    std[num2-1]++; break;
                case 14:
                    std[num2-1]++; break;
                case 15:
                    std[num2-1]++; break;
                case 16:
                    std[num2-1]++; break;
                case 17:
                    std[num2-1]++; break;
                case 18:
                    std[num2-1]++; break;
                case 19:
                    std[num2-1]++; break;
                case 20:
                    std[num2-1]++; break;
                case 21:
                    std[num2-1]++; break;
                case 22:
                    std[num2-1]++; break;
                case 23:
                    std[num2-1]++; break;
            }
        }
        System.out.print(Arrays.toString(std));
        System.out.print(" ");
    }
}
