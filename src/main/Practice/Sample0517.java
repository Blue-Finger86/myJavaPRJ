import java.util.Scanner;

class Cloth {
    public static String A(char o) {  //static 안 붙이면 메인 클래스에서 호출을 못 함!
        if(o == 'C') {
            return "네 현재 재고가 있습니다!";
        }
        if(o == 'H') {
            return "네 현재 재고가 있습니다!";
        }
        return "손님 지금 찾으시는 상품은 현재 재고가 없습니다.";
    }
}

public class Sample0517 {
    public static void main(String[] args) {
        System.out.println("손님 찾으시는 옷 있으십니까?");

        Scanner sc = new Scanner(System.in);
        char o = sc.next().charAt(0);

        System.out.printf("%c 여기 이 제품 재고 있나요?\n", o);
        System.out.println("네 잠시만요 손님~!");

        String str = Cloth.A(o);   //재고 확인하는 메소드 실행
        System.out.println(str);
    }
}
