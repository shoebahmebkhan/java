import java.util.Scanner;

public class mintarnaary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first value : ");
        int num1 = input.nextInt();
        System.out.println("enter the second value : ");
        int num2 = input.nextInt();
        mintarnaary tarnary = new mintarnaary();
        int min = tarnary.min(num1,num2);
        System.out.println("minimum numdar: " + min);

    }
    public int min(int num1, int num2){
        return num1 < num2 ? num1 : num2;
    }
}
