import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Point> dataPoints = readDataFromFile("C:\\Users\\batyr\\IdeaProjects\\assignment\\src\\points.txt");

        System.out.println("Perimeter: " + calculatePerimeter(dataPoints));
        System.out.println("Longest distance: " + findLongestDistance(dataPoints));
        System.out.println("Average distance: " + calculateAverageDistance(dataPoints));
    }

    private static ArrayList<Point> readDataFromFile(String filePath) throws Exception {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        ArrayList<Point> dataPoints = new ArrayList<>();

        while (scanner.hasNext()) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            dataPoints.add(new Point(x, y));
        }

        scanner.close();
        return dataPoints;
    }

    private static double calculatePerimeter(ArrayList<Point> dataPoints) {
        double perimeter = 0;

        for (int i = 0; i < dataPoints.size(); i++) {
            Point currentPoint = dataPoints.get(i);
            Point nextPoint = (i == dataPoints.size() - 1) ? dataPoints.get(0) : dataPoints.get(i + 1);

            perimeter += findDistance(currentPoint, nextPoint);
        }

        return perimeter;
    }

    private static double findLongestDistance(ArrayList<Point> dataPoints) {
        double longestDistance = 0;

        for (int i = 0; i < dataPoints.size(); i++) {
            Point currentPoint = dataPoints.get(i);
            Point nextPoint = (i == dataPoints.size() - 1) ? dataPoints.get(0) : dataPoints.get(i + 1);

            double distance = findDistance(currentPoint, nextPoint);
            longestDistance = Math.max(longestDistance, distance);
        }

        return longestDistance;
    }

    private static double calculateAverageDistance(ArrayList<Point> dataPoints) {
        double totalDistance = 0;

        for (int i = 0; i < dataPoints.size(); i++) {
            Point currentPoint = dataPoints.get(i);
            Point nextPoint = (i == dataPoints.size() - 1) ? dataPoints.get(0) : dataPoints.get(i + 1);

            totalDistance += findDistance(currentPoint, nextPoint);
        }

        return totalDistance / dataPoints.size();
    }

    private static double findDistance(Point point1, Point point2) {
        return Math.sqrt(Math.pow(point2.x - point1.x, 2) + Math.pow(point2.y - point1.y, 2));
    }
}

class Point {
    double x;
    double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
