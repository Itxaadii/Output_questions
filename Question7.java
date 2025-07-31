 class Question7 {
    public static void main(String[] args) {
        int Sum = 0;
        for(int i = 1; i<=3; i++){
            for(int j = 1; j<=i; j++)
            Sum = Sum + j;
        }
        System.out.println(Sum);
    }
}
