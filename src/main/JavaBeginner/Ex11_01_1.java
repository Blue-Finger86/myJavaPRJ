class Car3 {
    String color;
    int speed;

    public void upSpeed(int value) {
        this.speed = this.speed + value;
        if(speed + value >= 200) {     //속도가 200이 넘어가면
            this.speed = 200;       //무조건 200으로 고정(그 이상은 올라가지 못하게)
        }
    }

    public void downSpeed(int value) {
        this.speed = this.speed - value;
    }
}

public class Ex11_01_1 {
    public static void main(String[] args) {
        Car3 myCar1 = new Car3();
        myCar1.color = "그린";
        myCar1.upSpeed(50);
        //myCar1.downSpeed(30);
        //myCar1.upSpeed(250);  //이거는 메소드를 호출하는 거고 호출했으면 받아온 값이 있을 거 아니야 그게 myCar1.speed인 거야

        System.out.println("자동차의 색상은 "+myCar1.color+"입니다.");
        System.out.println("자동차의 현재 속도는"+myCar1.speed+"입니다.");
    }
}
