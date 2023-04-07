import java.util.Scanner;
public class HQ_2_sb {
    public static void main(String[] args){
        int array[] = new int[23];
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++) {
            int a = sc.nextInt();
            array[a-1]++;
        }
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}
