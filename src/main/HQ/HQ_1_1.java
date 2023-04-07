public class HQ_1_1 {
    public static void main(String[] args) {
        //int[]arr = new int[9];
        int[]arr = {3, 29, 38, 12, 57, 74, 40, 85, 61};

        int max = arr[0];
        int maxIdx = 0;

        for(int i = 0; i < 9; i++) {
            if(max < arr[i]) {
                max = arr[i];
                maxIdx = i;
            }
        }
        System.out.printf("최댓값은:%d\n",max);
        System.out.printf("최댓값의 위치는:%d", maxIdx);
    }
}
