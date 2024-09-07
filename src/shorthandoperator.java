import java.util.Scanner;

class shorthandoperator {
    public static void main(String[] args) {
        int a=5;
        Scanner input = new Scanner(System.in);
        System.out.print("enter the valve of x1:  ");
        int x1 = input.nextInt();
        a += x1;
        System.out.println("the addition of numbers is: " + a);
        System.out.print("enter the valve of x2:  ");
        int x2 = input.nextInt();
        a -= x2;
        System.out.println("the substraction of numbers is: " + a);
        System.out.print("enter the valve of x3:  ");
        int x3 = input.nextInt();
        a /= x3;
        System.out.println("the devision of numbers is: " + a);


    }
}