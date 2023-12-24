import models.Point;
import models.Shape;
import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Point> array;
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\batyr\\IdeaProjects\\assignment2\\src\\source.txt");
        array = new ArrayList<>();
        Scanner sc = new Scanner(file);
        Shape shape = new Shape();


        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);

            array.add(point);
            shape.addPoint(point);
        }
        double dist=0;
        for (int i = 0; i < array.size() - 1; i++) {
            dist =array.get(i).distance(array.get(i + 1));
            System.out.println("Distance between "+array.get(i)+ " and "+array.get(i+1)+" = "+dist);
//            System.out.println(dist);


        }

        System.out.println("Perimetr= "+shape.calculatePerimeter());
        System.out.println("The longest side= "+shape.getLongestSide());
        System.out.println("Average side= "+shape.getAverageSide());

    }
}