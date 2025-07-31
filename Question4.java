 import java.util.*;
 class Question4 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        System.out.println("Enter a number");
        int y = sc.nextInt();
        if (!(x > 0 && y < 15)) {
            System.out.println(x + y);
        } else {
            System.out.println(x * y);
        }
    }
}

