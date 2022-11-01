public class Point {
    // 3.2
    private int x, y;

    Point (int x, int y){
        this.x = x;
        this.y = y;
    }

    public void ResetPoint () {
        this.x = this.y = 0;
    }

    public void MovePoint (int horizontal, int vertical){
        this.x += horizontal;
        this.y += vertical;
    }

    public String toString(){
        return "(" + this.x + ", " + this.y + " )";
    }
}