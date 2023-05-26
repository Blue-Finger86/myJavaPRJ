import java.util.Scanner;

public class Ex09_05_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str, str2, str3, str4, str5[];

        System.out.print("문자열을 입력해주세요: ");
        str = sc.nextLine();

        str2 = str.replaceAll(" ", "G");
        str3 = str.replaceAll("o", "M");
        str4 = str.substring(2, 6);  //이거 따옴표에 안 넣는 거야!
        str5 = str.split(" ");

        System.out.println("변경한 문자열:" +str2);
        System.out.println("두번째로 변경한 문자열:" +str3);
        System.out.println("일부만 추출한 문자열:" +str4);

        for(int i = 0; i < str5.length; i++) {   //얘는 지금 배열의 길이를 이용하는 거니까 메소드가 아님!
            System.out.println("분리한 문자열" + i + ":" + str5[i]);
        }
    }
}
