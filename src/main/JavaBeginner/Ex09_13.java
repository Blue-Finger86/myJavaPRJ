public class Ex09_13 {
    public static int plus(int v1, int v2) { // 호출되면 받은 매개변수를 가지고 실행 시작
        int result;
        result = v1 + v2;
        return result;         // 작업이 끝난 후에 result라는 값을 호출한 곳으로 반환함 --> main( )으로 보냄
    }

    public static void main(String[] args) {
        int hap;
        hap = plus(100, 200);
        // plus라는 메소드를 매개변수 100과 200을 가지고 호출, 메소드가 반화해준 값(result)를 hap에 담음
        // result에게서 받아온 값을 hap이 받는 거라 둘의 데이터 타입은 같아야 함 그래야 받을 수 있음

        System.out.printf("100과 200의 plus() 메소드 결과는 : %d\n", hap);
    }
}
