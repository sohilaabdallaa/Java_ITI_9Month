package pattern;

public class Pattern {

    int numRows;

    public Pattern() {
        numRows = 0;
    }

    public Pattern(int rows) {
        numRows = rows;
    }

    public void draw() {
        int i, j;
        for (i = 0; i < numRows; i++) {
            for (j = numRows - i -1; j >= 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
