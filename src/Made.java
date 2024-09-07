import java.sql.SQLOutput;
import java.util.Scanner;

 class Made {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter you first number: ");
        int a = input.nextInt();
        System.out.print("enter you second  number: ");
        int b = input.nextInt();
        int c = a + b ;
        System.out.println("the sum of two values is\t" + c );
    }
}
