import java.util.Scanner;

public class Ex09_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;

        System.out.print("문자열 입력 ==> ");
        str = s.nextLine();

        System.out.print("출력 문자열 ==> ");

        if(!str.startsWith("(")) {  //첫 글자가 괄호로 시작하지 "않는다면"
            System.out.printf("("); //괄호를 출력해라  --> 이게 제일 먼저 출력되니까 맨 앞에 괄호가 나오고 그 다음에 아래 반복문으로 괄호 안에 값이 들어가는 형태로 출력됨
        }

        for(int i = 0; i < str.length(); i++) {
            System.out.printf("%c", str.charAt(i));
        }

        if(!str.endsWith(")")) {    //괄호로 끝나지 않는다면(괄호로 닫히지 않았다면)
            System.out.printf(")"); //마지막에 괄호를 출력해라(괄호로 닫아줘라)
        }
    }
}

// 첫 글자 매칭, 끝 글자 매칭 -> startsWith(); / endsWith();
// 참이면 참인 구문 실행하고, 거짓이면 거짓인 구문 실행하고(not연산자 사용해서 거짓일 때 참이다로 만들어도 되고!)