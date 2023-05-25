import java.util.*;

public class QzSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();     //HashSet이라는 데이터 타입 정의
        Scanner sc = new Scanner(System.in);        //스캐너 사용하여 값 입력받기

        for(int i = 0; i < 5; i++) {                //반복문 사용하여 값 입력(추가)
            set.add(sc.nextInt());
        }

        System.out.print(set);                      //Set을 사용하면 중복제거를 알아서 해준다.(중복값은 출력X)
    }
}
