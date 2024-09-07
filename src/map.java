import java.util.Scanner;

class map {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("give the first number: ");
        int a = input.nextInt();
        System.out.print("give the second number: ");
        int b = input.nextInt();

         //int p = (a/2);
         //int q = (b/2);

        if (a % 2 ==0) {

            System.out.println(a + "is  divisible by 2");
        }
        else {
            System.out.println(a + "is not divisible by 2");
            }
        if (b%2 == 0) {

            System.out.println(b + "is  divisible by 2");
        }
        else {
            System.out.println(b + "is not divisible by 2");
        }



    }
}










