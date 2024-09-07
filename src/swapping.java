import java.util.Scanner;

 class swapping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("welcome to swapping:\n\n  ");
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second numder: ");
        int b = input.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("swapping done ....  ");
        System.out.println("value of first number is "  + a);
        System.out.println("value of second number is "  + b);



    }
}