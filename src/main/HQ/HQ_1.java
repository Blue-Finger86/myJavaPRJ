public class HQ_1 {
    public static void main(String[] args) {
        //첫째줄에 최대값, 두번째줄에 최대값이 몇번째에 있는지 위치를 출력
        int aa[] = {3, 29, 38, 12, 57, 74, 40, 85, 61};
        int max = aa[0]; // 배열의 첫번째 값을 첫번째 max로 선언
        int max2 = 0; // 배열의 인덱스(위치)를 담을 변수

        int i, k;
        for (i=0; i<9; i++) { // 9개의 값을 나열할 반복문
            if(max<aa[i]){ // 인덱스끼리의 크기를 비교할 조건문, 맥스보다 그 다음 수가 크다면
                max = aa[i]; // 최대값 교체
                max2 = i; //i의 마지막 위치 ==> 최대값의 위치
            }
        }
        System.out.printf("배열의 최대값은 %d\n", max);
        System.out.printf("최대값의 위치는 %d", max2);



    }

}
