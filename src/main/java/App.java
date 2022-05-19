import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("AppContext.xml");

      Coords coor = context.getBean("cord", Coords.class);
        System.out.printf("Your coords are %d -- %d\n", coor.getX(), coor.getY());

      Shape sh = context.getBean("figure",Shape.class);
        sh.Draw();

      Point pn = context.getBean("point", Point.class);
        pn.Draw();

      Circle cr = context.getBean("circ", Circle.class);
        cr.Draw();

//        Shape shape = new Shape("blue");
//        shape.Draw();
//        Point point = new Point(4, 5);
//        point.Draw();
//        Circle circle = new Circle(7,9,11);
//        circle.Draw();
    }
}
