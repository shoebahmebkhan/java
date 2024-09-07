import java.util.Scanner;

class assingment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("the value of a is ");
        float a = input.nextFloat();
        System.out.print("the value of b is ");
        float b = input.nextFloat();
        float c = a*b;
        System.out.println("the product of two value is "  + c);

    }
}