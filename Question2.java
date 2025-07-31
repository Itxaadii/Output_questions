 import java.util.*;
 class Question2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        if( x > 0 && x % 2 == 1){
            System.out.print("Positive Odd");       
        }
        else {
            System.out.print("other");
        }
    }
}
