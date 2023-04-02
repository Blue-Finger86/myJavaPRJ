public class Ex02_01_1 {
    public static void main(String[] args) {
        int a, b, result;

        a = 1234; // 타입은 위에 선언 해놨으니까 들어가는 값만 선언해주면 됨! 선언 + 초기화는 세트인데 내가 분리해놓은 거니까
        b = 567;

        result = a + b;
        System.out.println(a + "+" + b + "=" + result);

        result = a - b;
        System.out.println(a + "-" + b + "=" + result);

        result = a * b;
        System.out.println(a + "*" + b + "=" + result);

        result = a / b;
        System.out.println(a + "/" + b + "=" + result);


    }
}
