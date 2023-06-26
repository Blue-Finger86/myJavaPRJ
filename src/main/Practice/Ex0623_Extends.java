package myJavaPRJ.src.main.Practice;

public class Ex0623_Extends {
        public int cal(int a, int b){
            return a + b;
        }
}
//부모 클래스가 cal()이라는 메서드를 갖고 있음

 class Ex0623_1 extends Ex0623_Extends {
    public int cal(int a, int b) {
        return a * b;
    }
}
//자식 클래스가 부모 클래스에게 상속을 받아 메서드의 반환값을 변경함 --> 오버라이딩
//오버라이딩 조건 모두 충족함 : 1.메서드의 이름 같음 2.매개변수의 개수와 타입 모두 같음 3.반환값의 타입 같음
