public class Ex09_07 {
    public static void main(String[] args) {
        String str = " 한글 ABCD efgh ";
        String result = "";

        //trim( )메소드는 앞 뒤의 공백을 제거해주는 거고 이 방식은 모든 공백을 다 제거하는 방식!
        for(int i = 0; i < str.length(); i++) {
            if( str.charAt(i) != ' ') {          // 특정 위치의 문자(열)가 공백이 아니라면
                result += str.substring(i, i+1); // result 옆에다가 붙여라  --> 이거 반복해서 공백 제외하고 이어 붙이겠다는 소리
            }
        }

        System.out.println("원 문자열 ==> [" +str+ "]");
        System.out.println("공백제거 후 문자열 ==> [" +result+ "]");
    }
}
