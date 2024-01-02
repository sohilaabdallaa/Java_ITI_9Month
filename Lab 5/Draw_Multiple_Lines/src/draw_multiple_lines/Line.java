
package draw_multiple_lines;

public class Line {
    int x1;
    int x2;
    int y1;
    int y2;


    public Line(int startX, int startY, int endX, int endY) {
        x1 = startX;
        y1 = startY;
        x2 = endX;
        y2 = endY;
    }

    public Line() {
        x1 = 0;
        x2 = 0;
        y1 = 0;
        y2 = 0;
    }    
}
