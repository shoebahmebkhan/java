import java.util.Scanner;

 class areaoftriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the  first sides of tringle: ");
        double b = input.nextDouble();
        System.out.println("enter the second side of triangle: ");
        double h = input.nextDouble();
        double c= 0.5*b*h;
        System.out.println("the ra is " + c);
    }
}