class loops {
    public static void main(String[] args) {
        starPattern();
        System.out.println("pattern has printed");
    }

    public static void starPattern() {
        int rows = 0;
        while (rows < 5) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }


    }
}