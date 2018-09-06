public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        while (amount > 0) {
            System.out.print("*");
            amount--;
        }
        System.out.print("\n");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        while (amount > 0) {
            System.out.print(" ");
            amount--;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int whites = size - 1;
        int stars = 1;
        while (size > 0) {
            printWhitespaces(whites);
            whites--;
            printStars(stars);
            stars++;
            size--;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int backHeight = height;
        int whites = height - 1;
        int stars = 1;
        while (height >= 1) {
            printWhitespaces(whites);
            whites--;
            printStars(stars);
            stars = stars + 2;
            height--;
        }
        int bottomWidth = backHeight * 2 - 1;
        int leftMargin = bottomWidth / 2 - 1;
        for (int i = 0; i < 2; i++) {
            printWhitespaces(leftMargin);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
