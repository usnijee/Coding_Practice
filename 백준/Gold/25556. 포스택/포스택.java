import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Deque<Integer> stack1 = new ArrayDeque<>();
        Deque<Integer> stack2 = new ArrayDeque<>();
        Deque<Integer> stack3 = new ArrayDeque<>();
        Deque<Integer> stack4 = new ArrayDeque<>();
        ArrayList<Integer> arrList = new ArrayList<>();
        boolean canSorted = true;

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            arrList.add(Integer.parseInt(scanner.next()));
        }

        for (Integer i : arrList) {
            if (stack1.isEmpty() || stack1.peek() < i) {
                stack1.push(i);
            } else if (stack2.isEmpty() || stack2.peek() < i) {
                stack2.push(i);
            } else if (stack3.isEmpty() || stack3.peek() < i) {
                stack3.push(i);
            } else if (stack4.isEmpty() || stack4.peek() < i) {
                stack4.push(i);
            } else {
                canSorted = false;
            }
        }

        if (canSorted) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}