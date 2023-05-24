import java.util.Scanner;

public class Ex09_05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //입력받을 문자열, 바꿀 문자열, 일부 문자열, 분리할 문자열을 담을 변수들 선언
        String str, strRep, strSub, strAry[], strRep2;

        System.out.print("문자열을 입력하세요: ");
        str = s.nextLine();                                       //IT CookBook Java Programming 입력

        strRep = str.replace(" ", "$");          //공백 발견되면 $로 교체
        strRep2 = str.replaceAll("\\s", "\\$");  //특수문자를 바꾸고 싶으면 역슬래쉬 붙여야 함, 문자열 s가 아니라 스페이스(공백)를 말함, 위랑 아래랑 똑같은 말임
        strSub = str.substring(3, 8);
        strAry = str.split(" ");                           //공백을 기준으로 문자열 분리해 --> 총 4개로 분리됨

        System.out.println("입력 문자열 ==> " + str);
        System.out.println("바꾼 문자열 ==> " + strRep);
        System.out.println("바꾼 문자열 ==> " + strRep2);
        System.out.println("일부 문자열 ==> " + strSub);

        //분리한 문자열은 4개니까 출력을 반복문 사용해서 할 것, strAry의 길이값은 4(배열에 4개가 들어갔으니까)
        for(int i = 0; i < strAry.length; i++) {
            System.out.println("분리한 문자열" + i + "==>" + strAry[i]);
        }
    }
}
