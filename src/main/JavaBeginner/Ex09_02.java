import java.util.Scanner;

public class Ex09_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;

        System.out.print("문자열 입력==> ");
        str = sc.nextLine();

        System.out.print("출력 문자열==> ");
//        for(int i = 0; i < str.length(); i++){
//            if(str.charAt(i) == 'o') {          //소문자 o가 있으면
//                System.out.printf("%c", '$');   //$로 바꾼다.
//            } else {
//                System.out.printf("%c", str.charAt(i));
//            }
//        }
        System.out.println("내가 사용한 함수 : " + str.replaceAll("o","q"));
        // 달러는 오류나서 q로 바꿈
    }
}


// System.out.println("내가 사용한 함수 : " + str.replaceAll("o","$"); // 문자 전체를 바꿔줘 괄호 안의 내용대로
// 괄호 내용 -> 소문자 o를 달러로 바꿔줘!