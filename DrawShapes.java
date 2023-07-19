import java.util.Scanner;
import src.PennDraw;

public class DrawShapes {
    public static void main(String[] args) {

        //library setup
        Scanner sc = new Scanner(System.in);
        PennDraw.setCanvasSize(500, 500);
        PennDraw.setXscale(0, 100);
        PennDraw.setYscale(0, 100);

        //variables
        boolean running = true;

        //game loop
        while (running) {

            //user input shape type
            System.out.println("Enter: circle | square | quit");
            String shape = sc.nextLine();
            Shape s = new Shape();

            //menu options
            if (shape.equals("circle")) {
                System.out.println("Enter radius: ");
                double r = sc.nextDouble();
                s.setRadius(r);
                running = true;

            } 
            else if (shape.equals("square")) {
                System.out.println("Enter side length: ");
                double length = sc.nextDouble();
                s.setSideLength(length);
                running = true;
            }
            else if(shape.equals("quit")){
                System.out.println("Bye!");
                running = false;
            }
            else{
                System.out.println("!Shape undefined error!");
                running = false;
            }

            //check if game continues
            if(running){
                //user input shape location
                System.out.println("Enter x coordinate: ");
                double x = sc.nextDouble();
                s.setX(x);

                System.out.println("Enter y coordinate: ");
                double y = sc.nextDouble();
                s.setY(y);

                //draw the shape
                s.draw();

                //clear scanner buffer
                sc.nextLine();
                System.out.println("...");
            }
            else{
                sc.close();
                break;
            }
        } 
    }
}