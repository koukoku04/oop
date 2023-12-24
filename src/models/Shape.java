package models;
import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points;

    // Constructor to initialize a shape with an array of points
    public Shape() {
        points = new ArrayList<>();
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    // Calculate and return the perimeter of the shape
    public double calculatePerimeter() {
        double per = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            per += points.get(i).distance(points.get(i + 1));
        }
        per += points.get(points.size() - 1).distance(points.get(0));
        return per;
    }
    // Find and return the length of the longest side in the shape
//    public double distance(){
//        int i=0;
//        double v= points.get(i).distance(points.get(i+1));
//        if(i<points.size()-1){
//            i=+1;}
//        return v;
//
//    }
    public double getLongestSide() {
        double temp = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            double side = points.get(i).distance(points.get(i + 1));
            if (side > temp) {
                temp = side;
            }
        }
        temp = Math.max(temp, points.get(points.size() - 1).distance(points.get(0)));
        return temp;
    }

    // Calculate and return the average length of the sides in the shape
    public double getAverageSide() {
        double per = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            per += points.get(i).distance(points.get(i + 1));
        }
        per +=points.get(points.size() - 1).distance(points.get(0));
        return per / points.size();
    }
}
