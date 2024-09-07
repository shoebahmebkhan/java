import java.util.Scanner;

class multiplicationTable {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = input.nextInt();
        table(num);
    }
    public static void table(int num) {
        int i = 1;
        while (i <=10){
            System.out.println(num + "X" + i + "=" + (num*i));
            i++;
        }

    }
}
