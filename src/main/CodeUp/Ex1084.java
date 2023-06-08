import java.util.Scanner;

public class Ex1084 {
    public static void main(String[] args) {
        //빨강(r), 초록(g), 파랑(b) 각각의 빛의 강약에 따른 가짓수가 주어질 때,(입력)
        //주어진 rgb 빛들을 다르게 섞어 만들 수 있는 모든 경우의 조합(r g b)을 오름차순으로 줄을 바꿔가며 모두 출력하고,(출력1)
        //마지막에 그 개수를 출력한다.(출력2)

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();  //빨간색
        int g = sc.nextInt();  //초록색
        int b = sc.nextInt();  //파란색

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < g; j++) {
                for (int z = 0; z < b; z++) {
                    System.out.printf("%d %d %d\n", i, j, z);
                }
            }
        }

        System.out.print(r*g*b);
    }
}


//답이랑 풀이과정은 맞았는데 시간초과라고 뜸
//자바로는 해결이 안 되는 문제인가 다들 이걸 물어보네 나도 궁금한데!!!