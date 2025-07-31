import java.util.Scanner;
class Question5 {
    public static void main(String[] args) {
     Scanner sc  = new Scanner(System.in);
        System.out.println("Enter score");
        int score = sc.nextInt();
        if( score >= 90 ){
            System.out.print("A");
        }
else if( score >=80 ){
    System.out.println("B");
} 
else{
    System.out.println("C");
    }
}
}
