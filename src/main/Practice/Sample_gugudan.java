public class Sample_gugudan {
    public static void main(String[] args) {
        int j = 2; // 2단부터 시작하려고 j의 초기값은 2로 설정한다.

        for (int i = 1; i < 10; i++) { // 승수가 1부터 9까지 1씩 늘어나면서 9번 반복되도록 한다.
            System.out.println(j + "*" + i + "=" + i*j); // 구구단 출력
            if(i == 9) { // 승수가 9까지 갔다면
                j++; // 단을 하나 키우고
                i = 0; // 승수는 다시 0으로 초기화한다.
                System.out.println(); // 단과 단 사이에 한 줄을 띄우고(공백을 출력한다.) 다시 for문으로 올라간다.
                if(j == 10) {  // 단을 하나씩 키우면서 9단까지 늘린 후에 10단이 되면
                    break; // 반복문을 빠져나가라.
                }
            }
        }
    }
}
