public class Point extends Shape{
    Coords coords = new Coords();
    public Point(int a, int b) {
        coords.setX(a);
        coords.setY(b);
    }
    public void setX(int x) {
        coords.setX(x);
    }
    public void setY(int y) {
        coords.setY(y);
    }
    public void Draw(){
        System.out.printf("Point coords are %d -- %d\n", coords.getX(), coords.getY());
    }
}
