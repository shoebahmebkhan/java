import java.sql.SQLOutput;
import java.util.Scanner;

class rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("give the value of A: ");
        int A = input.nextInt();
        System.out.print("give the value of B: ");
        int B = input.nextInt();
        System.out.print("give the value of C: ");
        int C = input.nextInt();
        System.out.print("give the value of D: ");
        int D = input.nextInt();
        int ABCD = A+B+C+D;
        System.out.println("the perimeter of retangle is " + ABCD);

    }
}