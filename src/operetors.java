import java.util.Scanner;

class operetors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number: ");
        int A = input.nextInt();
        if(A>0) {
            System.out.println( A + " is positive");
        } else if (A<0) {
            System.out.println(A + " is negative");
        }else {
            System.out.println(A + "  is zero");
        }
    }
}