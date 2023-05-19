//메소드 호출하기
class func1 {
    public static char f() {
        return 'A';
    }
}

public class Ex1530 {
    public static void main(String[] args) {
        System.out.printf("%c", func1.f());
    }
}



//헐 뭐야 func1에서 static 안 붙었을 때는 func1.f()에서 f에 오류나더니 static 붙으니까 안 나네?
//이거 뭔지 찾아봐야 되겠다