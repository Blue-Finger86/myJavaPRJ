class Car {
    //변수랑 함수랑 묶어서 통으로 메모리에 올라감 --> 클래스 단위로 메모리에 올라간 것임
            public String color;
            public int speed;

            void upSpeed(int value) {    //Car라는 클래스 안에 함수까지 넣어놨으니까 쓸 수 있는 것임
                this.speed = this.speed + value; //this = 자기 자신 즉 Car라는 클래스
            }

            void downSpeed(int value) {
                this.speed = this.speed - value;
            }
}
//전역변수로 선언된 변수를 사용할 때는 this를 붙이는 습관을 들이는 게 좋다.
//클래스 안에 클래스는 절대 못 들어감 하나의 클래스와 또 다른 클래스는 분리되어야 함.
//같은 소스 파일 안에 클래스가 여러개인 것 뿐.
//근데 파일 하나 당  클래스가 하나여야 좋은 코드임 이거는 썩 좋은 예제는 아님
//코딩에서 가장 중요한 건 가독성임 남이 보기 쉬운 코드가 가장 좋은 코드임
public class EX11_01 {
    public static void main(String[] args) {
        Car myCar1 = new Car();   //new가 붙으면 독립적인 + 메모리에 올라가는
        myCar1.color = "빨강";
        myCar1.speed = 0;

        Car myCar2 = new Car();   //생성자를 호출한 것 --> 메모리에 올리는 방식이 생성자 호출인 것
        myCar2.color = "파랑";
        myCar2.speed = 0;

        Car myCar3 = new Car();
        myCar3.color = "노랑";
        myCar3.speed = 0;

        myCar1.upSpeed(30);
        System.out.println("자동차1의 색상은 " + myCar1.color + "이며, 현재 속도는 " + myCar1.speed + "km입니다.");

        myCar2.upSpeed(60);
        System.out.println("자동차2의 색상은 " + myCar2.color + "이며, 현재 속도는 " + myCar2.speed + "km입니다.");

        myCar3.upSpeed(0);
        System.out.println("자동차3의 색상은 " + myCar3.color + "이며, 현재 속도는 " + myCar3.speed + "km입니다.");

    }
}



