public class Ex09_04 {
    public static void main(String[] args) {
        String str = "Java를 공부하는 중, Java는 재밌어요.^^";

        System.out.println("문자열 ==> " + str);

        System.out.print("제일 처음 나오는 Java 위치 ==> ");
        System.out.println(str.indexOf("Java"));  //Java라는 단어를 앞에서 부터 찾아라(컴퓨터는 무조건 0부터 시작)
        System.out.print("마지막에 나오는 Java 위치 ==> ");
        System.out.println(str.lastIndexOf("Java"));
        //Java는 대소문자를 구별하기 때문에 java라고 입력하면 -1이라는 값을 뱉어냄(참이 아니라는 소리)
    }
}
