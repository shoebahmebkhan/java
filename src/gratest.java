import java.util.Scanner;

 class gratest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("enter the second number: ");
        int num2 = input.nextInt();
        System.out.print("enter the third number: ");
        int num3 = input.nextInt();
        if (num1>num2 ){
            System.out.println( num1 + " number is gratest");
        } else if(num2>num3 ) {
            System.out.println(num2 + " number is gratest");
        }else{
            System.out.println(num3 + " number is gratest");
        }

    }
}