import java.util.Scanner;

class oddeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number; ");
        int num = input.nextInt();
        if (num % 2 == 0){
            System.out.println("the number is even");
        } else {
            System.out.println("the number is odd");
        }

    }
}
