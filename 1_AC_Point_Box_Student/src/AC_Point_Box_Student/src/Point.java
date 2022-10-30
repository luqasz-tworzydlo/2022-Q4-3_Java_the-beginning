public class Point {
    // 3.2
    private int x, y;

    Point (int x, int y){
        this.x = x;
        this.y = y;
    }

    public void ResetPoint (int ResetPointX, int ResetPointY) {
        if (ResetPointX >= 1 && ResetPointX <= 3) {
            this.x = ResetPointX;
        }
        else {
            this.x = 2;
        }
        if (ResetPointY > 3 && ResetPointY <= 9) {
            this.y = ResetPointX;
        }
        else {
            this.y = 5;
        }
    }

    int numberX = 3;
    int numberY = 1;

    public void MovePoint (int MovePointX, int MovePointY) {
        this.x += numberX = MovePointX;
        this.y += numberY = MovePointY;
    }

    public String toString() {
        return "=> Selected points:\n"
                + "< X - Y > : < " + this.x + " - " + this.y + " >";
    }
}