import java.util.Scanner;

class methode {
    public static void main(String[] args) {
        greet();
        int first = readNumber() ;
        int second = readNumber();
         int e = first+second;
        System.out.println("the value is " + e);

    }
    public static void greet(){
        System.out.println("good morning welcome");
    }
    public static int readNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int num = input.nextInt();
        return num ;

    }

}