public class Circle extends Shape{
    Coords centre;
    int radius;
    public Circle(int x, int y, int radius) {
        Coords centre = new Coords();
        centre.setX(x);
        centre.setY(y);
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void Draw(){
        System.out.printf("Centre circle are %d -- %d\n", centre.getX(),centre.getY());
        System.out.printf("Radius circle is %d\n", getRadius());
    }
}
