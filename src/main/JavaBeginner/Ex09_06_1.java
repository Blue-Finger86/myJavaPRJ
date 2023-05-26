import java.util.Scanner;

public class Ex09_06_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println("원래 문자열:" + str);
        System.out.println("대문자로 바꿔서:" + str.toUpperCase());
        System.out.println("소문자로 바꿔서:" + str.toLowerCase());
        System.out.println("앞 뒤로 공백을 제거하고" + str.trim());


    }
}
