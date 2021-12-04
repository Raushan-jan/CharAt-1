import java.util.Scanner;

public class MAin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        int sum = 1;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i)==' ') {
                sum++;
            }
        }
        System.out.println(sum);
    }

}