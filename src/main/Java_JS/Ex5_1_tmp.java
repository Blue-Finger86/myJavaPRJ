import java.util.Arrays;

public class Ex5_1_tmp {
    public static void main(String[] args) {
        // index : 0~3-1, 0~2
        String[]strArr = {"가위", "바위", "보"}; // 문자열 배열 선언과 동시에 값 집어넣기
        System.out.println(Arrays.toString(strArr)); // strArr 라는 배열 출력

        for(int i = 0; i < 10; i++) {  // 총 10번 반복할 것
            int tmp = (int)(Math.random()*3);
                    System.out.println(strArr[tmp]); // 이렇게 선언하면 내가 선택한 배열의 인덱스가 갖고 있는 값이 출력이 됨
                    //System.out.println(tmp); 이렇게 선언하면 밑에 쓴 거랑 똑같이 위치가 출력 됨
            //System.out.println((int)(Math.random()*3)); // 0~2, 이 안에서 랜덤으로 뽑는 행위를 통해 선택된 인덱스의 순서를 출력해라
        }
    }
}
