import java.util.Scanner;
public class Ex08_03_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[]s = new int[4];
        int hap = 0, k;

        for(k=0; k<=3; k++) {
            System.out.printf("%d번째 숫자를 입력하세요:", k+1);
            s[k] = sc.nextInt();
        }
        System.out.printf("합계==>", hap);
    }

}
