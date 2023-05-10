class Car2 {
    private String color;       //이 변수에 접근 할 수 있는 건 오직 나! "나만 쓸 거야 아무도 조회 못 해"
    private int speed;

    Car2(String color, int speed) {   //파라미터 값을 넣어서 생성하게 할 수도 있음(파라미터를 넣어서 한번에 올려라)
        this.color = color;           //파라미터는 입력 받는 값을 말함
        this.speed = speed;
    }

    public String getColor() {
        return this.color;
    }

    public int getSpeed() {
        return this.speed;
    }
}
public class Ex11_07 {
    public static void main(String[] args) {
        Car2 myCar1 = new Car2("빨강", 0);
        Car2 myCar2 = new Car2("파랑", 30);

        System.out.println("자동차1의 색상은 " + myCar1.getColor() + "이며, 현재 속도는 " + myCar1.getSpeed() + "km입니다.");
        System.out.println("자동차2의 색상은 " + myCar2.getColor() + "이며, 현재 속도는 " + myCar2.getSpeed() + "km입니다.");
    }
}
