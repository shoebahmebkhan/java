import java.util.Scanner;

class compondintrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the value of principle: ");
        int p = input.nextInt();
        System.out.print("enter the value of rate:  ");
        float R = input.nextFloat();
        System.out.print("enter the value of time: ");
        float t = input.nextFloat();
        double CM = p* Math.pow((1+R/100),t);
        System.out.println("the value of " + CM);

    }
}