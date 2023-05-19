import java.util.Scanner;

public class Ex09_02_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;

        System.out.print("문자열 입력==>");
        str = sc.nextLine();

        System.out.print("출력 문자열==>");
        // 입력받은 문자열을 "출력할 때" 바꾸는 것
        // charAt(i)은 이 위치에 있는 문자 하나를 반환하는 것 i를 사용해서 반복문을 돌리니까 문자열에 있는 모든 문자 하나하나를 반환한다는 말!
        for(int i = 0; i<str.length(); i++) {
            if(str.charAt(i) == 'o') {                      //문자열의 문자가 o와 같다면
                System.out.printf("%c", '@');               //그 문자를 @로 바꾸어서 출력해라  --> 아 뭐야 계속 오류났던게 따옴표가 아니라 쌍따옴표에 넣어서 그런 거였다고??
            } else {                                        //문자열의 문자가 o이 아니라면
                System.out.printf("%c", str.charAt(i));     //원래 문자 그대로 출력해라!
            }
        }
    }
}
