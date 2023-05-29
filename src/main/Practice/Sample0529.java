
//클래스 통해 객체 생성한 후 클래스 사용하기 연습

//객체 생성을 위해 정의만 내리는 클래스
class Pra0529 {
    //클래스가 가진 변수
    String color; //오토바이의 컬러
    int key; //키 개수
    static int speed = 50; //오토바이의 현재 속도

    //클래스가 가진 메소드
    public static void NowSpeed(int now) {
        speed = speed + now;
    }

    public static void Bye() {
        System.out.print("고객님 오늘도 좋은 하루 보내세요~!");
        System.out.println();
    }

    //매개변수 받아서 출력까지 대신 해줄 메소드
    public static void Print(String col, int gae, int spd) {
        System.out.print("현재 고객님의 오토바이 색상은 " + col + "이며, 키의 개수는 " + gae + "개이고, 현재 속도는 " + spd + "km입니다.");
        System.out.println();
    }
}

//클래스를 사용만 하는 메인 클래스
public class Sample0529 {
    public static void main(String[] args) {
        Pra0529 p = new Pra0529(); //객체 생성

        p.color = "파란색";
        p.key = 3;
        p.NowSpeed(50);

        System.out.print("p1 고객님의 오토바이 색상은 " + p.color + "이며, 키의 개수는 " + p.key + "개이고, 현재 속도는 " + p.speed + "km입니다.");
        System.out.println();

        Pra0529 p2 = new Pra0529(); //객체 하나 더 생성

        p2.color = "빨간색";
        p2.key = 4;
        p2.NowSpeed(100);

        System.out.print("p2 고객님의 오토바이 색상은 " + p2.color + "이며, 키의 개수는 " + p2.key + "개이고, 현재 속도는 " + p2.speed + "km입니다.");
        System.out.println();


        Pra0529 p3 = new Pra0529(); //객체 하나 더 생성
        p3.Print("노란색", 3, 130);

        p.Bye();
        p2.Bye();
        p3.Bye();
    }
}
