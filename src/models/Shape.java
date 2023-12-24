package models;
import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points;
//    public ArrayList<Point> getNumArray() {
//        ArrayList<Point> clone = (ArrayList<Point>) points.clone();
//        return clone;
//    }
    // Constructor to initialize a shape with an array of points
    public Shape() {
        points = new ArrayList<>();
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    // Calculate and return the perimeter of the shape
    public double calculatePerimeter() {
        double perimeter = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            perimeter += points.get(i).distanceTo(points.get(i + 1));
        }
        perimeter += points.get(points.size() - 1).distanceTo(points.get(0)); // Closing the shape
        return perimeter;
    }
    // Find and return the length of the longest side in the shape
    public double distance(){
        int i=0;
        double v= points.get(i).distanceTo(points.get(i+1));
        if(i<points.size()-1){
            i=+1;}
        return v;

    }
    public double getLongestSide() {
        double longestSide = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            double sideLength = points.get(i).distanceTo(points.get(i + 1));
            if (sideLength > longestSide) {
                longestSide = sideLength;
            }
        }
        longestSide = Math.max(longestSide, points.get(points.size() - 1).distanceTo(points.get(0))); // Closing the shape
        return longestSide;
    }

    // Calculate and return the average length of the sides in the shape
    public double getAverageSide() {
        double totalSideLength = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            totalSideLength += points.get(i).distanceTo(points.get(i + 1));
        }
        totalSideLength +=points.get(points.size() - 1).distanceTo(points.get(0)); // Closing the shape
        return totalSideLength / points.size();
    }
}
