public class Box {
    private  int height, length, width;

    public Box(int height, int length, int width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public int Volume(){
        return this.length * this.height * this.width;
    }

    public String toString() {
        return  "height=" + height +
                ", length=" + length +
                ", width=" + width;
    }
}