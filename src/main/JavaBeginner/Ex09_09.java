public class Ex09_09 {
    public static void main(String[] args) {
        // 모두 똑같은 문자열의 값을 가지고 있는 문자열 변수 3개 생성
        String str1 = "Java Programming";
        String str2 = "Java Programming";
        String str3 = new String("Java Programming");

        // 갖고 있는 값이 같기 때문에 출력문도 셋이 똑같음
        System.out.println("원 문자열1 ==> [" +str1+"]");
        System.out.println("원 문자열2 ==> [" +str2+"]");
        System.out.println("원 문자열3 ==> [" +str3+"]\n");

        System.out.println("문자열1 == 문자열2 결과 : \t" + (str1 == str2));  // 뒤에 str1 == str2 이거 괄호 안 묶어주면 다른 결과 나오니까 꼭 묶어주기
        System.out.println("문자열1.equals(문자열2) 결과 :" +str1.equals(str2));
        System.out.println("문자열1 == 문자열3 결과 : \t" + (str1 == str3));
        System.out.println("문자열1.equals(문자열3) 결과 : "+str1.equals(str3));

    }
}


// str1과 str2는 같은 데이터 하나를 공유하는 개념이고, new 연산자를 사용하여 생성한 str3는 새로운 메모리(공간)에 올려서 쓰는 독립적인 값을 가짐(데이터의 내용만 같고 주소는 다른!)
// str1과 str2이 가리키는 애는 같은 애, 이 둘과 str3가 가리키는 애는 다른 애
// equals( )는 문자열의 값을 가지고 비교하기 때문에 문자열이 같으면 true를 반환함
// ==는 데이터 값 말고도 "저장된 위치"가 동일해야 true를 반환함, 그래서 str1과 str3가 거짓인 것 저장된 주소가 다르기 때문에 동일하지 않은 데이터로 취급해서