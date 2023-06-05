public class Qz_Mx {
    public static void main(String[] args) {
        int[]std = {100, 200, 300, 400, 500};

        int max = std[0];
        int min = std[0];
        int sum = 0;

        for(int i = 0; i < std.length; i++) {
            if(max<std[i]) {
                max = std[i];
            } else {
                min = std[i];
            }
            sum = sum + i;
        }
        System.out.printf("최댓값은 %d 최소값은 %d 평균은 %d", max, min, sum/std.length);
    }
}
