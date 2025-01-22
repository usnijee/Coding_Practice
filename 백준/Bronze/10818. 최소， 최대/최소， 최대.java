import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /**
     * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] nums = new int[n];

        nums = Arrays.stream(nums).map(x -> Integer.parseInt(scanner.next())).toArray();

        Arrays.sort(nums);

        System.out.printf("%d %d", nums[0], nums[nums.length - 1]);
    }
}