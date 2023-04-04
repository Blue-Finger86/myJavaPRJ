import java.util.Scanner;
public class Sample0404_2 {
    //시작값, 끝값, 증가값을 입력받아 for구문을 이용하여 합을 구하는 소스 작성
    public static void main(String[] args) {
        int start, end, add;
        int sum = 0;

        //System.out.print("시작값 끝값 증가값을 입력해주세요: ");
        Scanner sc = new Scanner(System.in);
        //start = sc.nextInt();
        //end = sc.nextInt();
        //add = sc.nextInt();

        System.out.print("시작값을 입력해주세요: ");
        start = sc.nextInt();
        System.out.print("끝값을 입력해주세요: ");
        end = sc.nextInt();
        System.out.print("증가값을 입력해주세요: ");
        add = sc.nextInt();

        for(int i=start; i<end; i=i+add) {
            sum = sum + i;
        }
        System.out.printf("%d부터 %d까지 %d씩 증가한 값의 합은 %d입니다.", start, end, add, sum);
    }
}
