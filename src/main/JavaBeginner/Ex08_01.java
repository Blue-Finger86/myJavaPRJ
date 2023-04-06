import java.util.Scanner;
public class Ex08_01 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
            //int a, b, c, d;
            int[]aa = new int[4];
            int hap;

            System.out.print("1번째 숫자를 입력하세요:");
            //a = s.nextInt();
            aa[0] = s.nextInt();
            System.out.print("2번째 숫자를 입력하세요:");
            //b = s.nextInt();
            aa[1] = s.nextInt();
            System.out.print("3번째 숫자를 입력하세요:");
            //c = s.nextInt();
            aa[2] = s.nextInt();
            System.out.print("4번째 숫자를 입력하세요:");
            //d = s.nextInt();
            aa[3] = s.nextInt();

            //hap = a + b + c + d;
            hap = aa[0] + aa[1] + aa[2] + aa[3];

            System.out.printf("합 ==> %d", hap);
    }
}
