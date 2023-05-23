import java.util.Scanner;
//메소드를 사용하여 입력한 값 n의 약수의 개수 값 리턴 받아서 출력하기

class func13 {
    public static int f(int a) {
        int divi = 1;

       // if(a%2 == 0) {
            for(int i = 2; i <= a; i++) {
                if(a%i == 0) {
                    divi++;
                }
            }
        //}

//        else if(a%3 == 0) {
//            for(int i = 3; i <= a; i++) {
//                if(a%i == 0) {
//                    divi++;
//                }
//            }
//        }
        return divi;
    }
}
public class Ex1557 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(func13.f(n));         //입력한 값의 약수의 개수를 메소드 호출해서 받아온 다음 출력 값으로 사용
    }
}

//1은 모든 수의 약수니까 기본적으로 가지고 있어야 함
//20의 경우는 4, 5를 둘 다 약수로 가지는데 +2씩 커져버리면 5를 만날 기회가 없잖아(짝수라고 짝수만 약수로 가지는 게 아니니까)
//if문을 따로 2개를 만들 게 아니라 if랑 else if문으로 짰어야 함 144같은 수는 2로도 나누어 떨어지고 3으로도 나누어 떨어지니까
//소스를 줄일 수 있을까 싶어서 보니까 반복문의 시작값이 2다 3이다 이 차이만 빼고 끝 값도 증감식도 약수의 개수 카운트 1 한다는 것도 다 똑같아서 반복문 하나를 주석 처리 하고 돌려봤더니 잘 돌아감
//보니까 2나 3으로 나누어 떨어지냐고도 안 물어봐도 되겠다 싶음 그래서 뺌 잘 돌아감