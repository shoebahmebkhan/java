import java.util.Scanner;

class simpleintrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the principle : ");
        int P = input.nextInt();
        System.out.println("enter the time: ");
        float t = input.nextFloat();
        System.out.println("enter the rate of interest: ");
        float r = input.nextFloat();
        float SI = (P*t*r)/100 ;
        System.out.println("The simple interest is " + SI);


    }
}