public class Star {

    public static void main(String args[]) //driver function
    {
        int n = 2;
        pyramidPattern(n);
    }

        public static void pyramidPattern(int n) {
            if (n == 0) {
                System.out.print("*");
            } else {

            for (int i = 0; i < n; i++) {
                    System.out.print(" ");

                    for (int j = 0; j <= i; j++) {

                        System.out.print("* ");

                    }

                    System.out.println();


            }

        }}
}
