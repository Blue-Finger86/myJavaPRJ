import java.util.Scanner;

public class Ex1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i = a; i >= 1; i--) {  // 조건문에서 등호의 방향 유의. <= 이렇게 되면 안 됨 0보다 작거나 같으려면 음수부터 출발해야 하니까
            System.out.println(i-1);
        }
    }
}
