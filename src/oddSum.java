import java.util.Scanner;

 class oddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the target number: ");
        int num = input.nextInt();
        int sum = odd(num);
        System.out.println("oddsum of " + num + " is " + sum);
    }
    public static int odd( int num){
        int sum = 0;
        int i = 1;
        while (i<=num) {
            sum+=i;
            i+=2;

        }
        return sum;
    }


}