import java.util.Scanner;
public class pra7_1 {
    // 시작값, 끝값, 증가값을 직접 입력해서 합을 구하는 프로그램을 while로 짜기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hap = 0;
        int i;
        int start, end, add;

        System.out.printf("시작값 입력: ");
        start = sc.nextInt();
        System.out.printf("끝값 입력: ");
        end = sc.nextInt();
        System.out.printf("증가값 입력: ");
        add = sc.nextInt();

        i = start;
        while ( i < 15 ) {
            hap = hap + i;
            i = i + add;
        }
        System.out.printf("%d부터 %d까지 %d씩 증가한 값의 합은? %d", start, end, add, hap);
    }
}
