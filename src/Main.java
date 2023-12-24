import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\batyr\\IdeaProjects\\assignment2\\src\\source.txt");
        Scanner sc = new Scanner(file);
        Shape shape = new Shape();
//        ArrayList<Point> points=shape.getNumArray();

        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            System.out.println(shape.distance());
            Point point = new Point(x, y);
//            System.out.println(point.distanceTo(points.get(i)));

            shape.addPoint(point);

        }

        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.getLongestSide());
        System.out.println(shape.getAverageSide());

    }
}