import java.util.Scanner;

 class fahrenheittocelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the value of farrenheit: ");
        double f = input.nextDouble();
        double c = (f-32)*5/9 ;
        System.out.println("the result is " + c);
    }
}