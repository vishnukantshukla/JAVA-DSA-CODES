import java.util.*;

public class array_inverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans[] = new int[num];
        for (int i = 0; i < arr.length; i++) {
            ans[arr[i]] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}
