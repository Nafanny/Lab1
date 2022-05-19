public class Shape {
    public String color;

    public Shape(){
    }
    public Shape(String color) {
        this.color = color;
    }
    public void Draw(){
        System.out.printf("You color is - %s\n", this.color);
    }
}
