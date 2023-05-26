import java.util.Scanner;

class func15 {
    //세 개의 int형 정수 입력 후, 세 수 중 중간 값을 출력한다.
    public static int f(int a, int b, int c) {
        int max, mid, min;
        max = (a > b) ? a : b;  //a와 b 둘 중 큰 값을 max가 갖고 있음
        min = (a < b) ? a : b;  //a와 b 둘 중 작은 값을 min가 갖고 있음
        mid = (max < c) ? max : (min > c) ? min : c; //두 수를 비교해서 나온 최댓값과 최소값을 나머지 변수 하나와 비교함

        return mid; //그렇게 해서 나온 중간 값을 호출한 곳으로 반환함
        }
}
public class Ex1563 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        System.out.print(func15.f(a, b, c));
    }
}
