import java.util.Scanner;

public class Ex1072 {
    // 정수의 개수 입력(n), n개의 정수 입력, 줄 바꿔가면서 입력한 정수 모두 출력(한 줄에 하나씩 출력)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //정수의 개수
        int b;

        for (int i = 0; i < n; i++) { //n번동안 정수 입력
            b = sc.nextInt();
            System.out.println(b);
        }
    }
}

// 반복문을 사용 안 하고 반복할 수 있는 방법이 뭐가 있을까
// 조건문으로 브레이크 걸어주는 건 알겠는데 반복을 모르겠어 i에 담으면 값이 계속 바뀌는데
// 뭐지 이 황당한 성공은? 저렇게 쓰고 컴파일 돌려봤는데 이렇게 된다고..?

