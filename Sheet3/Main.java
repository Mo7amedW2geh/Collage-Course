import com.company.Line;
import com.company.Point;
import com.company.Triangle;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Point p1 = new Point(0, 0, 0);
        Point p2 = new Point(0, 0, 0);
        Point p3 = new Point(0, 0, 0);
        Line l1 = new Line(new Point(0, 0, 0), new Point(0, 0, 0));
        Line l2 = new Line(new Point(0, 0, 0), new Point(0, 0, 0));
        Triangle t1 = new Triangle(new Point(0, 0, 0), new Point(0, 0, 0), new Point(0, 0, 0));
        //The main loop
        while(true){

            int choice;

            System.out.println("-------------------------");
            System.out.println("        MAIN MENU        ");
            System.out.println("-------------------------");
            System.out.println("1. Insert Point");
            System.out.println("2. Format Line");
            System.out.println("3. Format Triangle");
            System.out.println("4. Operations");
            System.out.println("5. Exit Program");
            System.out.print("Enter your choice: ");
            while (!in.hasNextInt()){
                System.out.print("Invalid operation choice. Please enter an integer: ");
                in.next();
            }
            choice = in.nextInt();

            if (choice == 1){

                int pointChoice;
                System.out.print("Enter the point number (1 or 2 or 3): ");
                while (!in.hasNextInt()){
                    System.out.print("Invalid operation choice. Please enter an integer: ");
                    in.next();
                }
                pointChoice = in.nextInt();

                if (pointChoice == 1){
                    p1 = insertPoint();
                    System.out.println("-------------------------");
                    System.out.println("The point has been formatted successfully.");
                }
                else if (pointChoice == 2){
                    p2 = insertPoint();
                    System.out.println("-------------------------");
                    System.out.println("The point has been formatted successfully.");
                }
                else if (pointChoice == 3){
                    p3 = insertPoint();
                    System.out.println("-------------------------");
                    System.out.println("The point has been formatted successfully.");
                }
                else {
                    System.out.println("-------------------------");
                    System.out.println("Invalid point number.");
                }


            } else if (choice == 2) {

                int lineChoice;
                System.out.print("Enter the line number (1 or 2): ");
                while (!in.hasNextInt()){
                    System.out.print("Invalid operation choice. Please enter an integer: ");
                    in.next();
                }
                lineChoice = in.nextInt();

                if (lineChoice == 1){
                    l1 = formatLine(p1, p2, p3);
                    System.out.println("-------------------------");
                    System.out.println("The line has been formatted successfully.");
                } else if (lineChoice == 2) {
                    l2 = formatLine(p1, p2, p3);
                    System.out.println("-------------------------");
                    System.out.println("The line has been formatted successfully.");
                }else {
                    System.out.println("-------------------------");
                    System.out.println("Invalid line number.");
                }

            } else if (choice == 3) {
                t1 = new Triangle(p1, p2, p3);
                System.out.println("-------------------------");
                System.out.println("The triangle has been formatted successfully.");

            } else if (choice == 4) {
                while(true) {
                    int operationChoice;
                    System.out.println("-------------------------");
                    System.out.println("        OPERATIONS       ");
                    System.out.println("-------------------------");
                    System.out.println("1. Point Operations");
                    System.out.println("2. Line Operations");
                    System.out.println("3. Triangle Operations");
                    System.out.println("4. Main Menu");
                    System.out.print("Enter your choice: ");
                    while (!in.hasNextInt()) {
                        System.out.print("Invalid operation choice. Please enter an integer: ");
                        in.next();
                    }
                    operationChoice = in.nextInt();

                    if (operationChoice == 1) {

                        while (true) {
                            int pointChoice;

                            System.out.println("-------------------------");
                            System.out.println("     POINT OPERATIONS    ");
                            System.out.println("-------------------------");
                            System.out.println("1. Print Point");
                            System.out.println("2. Point Addition");
                            System.out.println("3. Point Subtraction");
                            System.out.println("4. Distance");
                            System.out.println("5. Operations Menu");
                            System.out.print("Enter your choice: ");
                            while (!in.hasNextInt()) {
                                System.out.print("Invalid operation choice. Please enter an integer: ");
                                in.next();
                            }
                            pointChoice = in.nextInt();

                            if (pointChoice == 1) {
                                int point;
                                System.out.println("Enter the point number (1 or 2 or 3): ");
                                while (!in.hasNextInt()){
                                    System.out.print("Invalid operation choice. Please enter an integer: ");
                                    in.next();
                                }
                                point = in.nextInt();
                                if (point == 1) {
                                    System.out.println("-------------------------");
                                    System.out.println("Point 1: " + p1);
                                }
                                else if(point == 2) {
                                    System.out.println("-------------------------");
                                    System.out.println("Point 2: " + p2);
                                }
                                else if(point == 3) {
                                    System.out.println("-------------------------");
                                    System.out.println("Point 3: " + p3);
                                }
                                else {
                                    System.out.println("-------------------------");
                                    System.out.println("Invalid point number.");
                                }
                            } else if (pointChoice == 2) {
                                pointAddition(p1, p2, p3);
                            } else if (pointChoice == 3) {
                                pointSubtraction(p1, p2, p3);
                            } else if (pointChoice == 4) {
                                int point;
                                System.out.println("Enter the point number (1 or 2 or 3): ");
                                while (!in.hasNextInt()){
                                    System.out.print("Invalid operation choice. Please enter an integer: ");
                                    in.next();
                                }
                                point = in.nextInt();
                                if (point == 1) {
                                    System.out.println("-------------------------");
                                    System.out.println("Point 1 Distance from the origin = " + p1.distance());
                                }
                                else if(point == 2) {
                                    System.out.println("-------------------------");
                                    System.out.println("Point 2 Distance from the origin = " + p2.distance());
                                }
                                else if(point == 3) {
                                    System.out.println("-------------------------");
                                    System.out.println("Point 3 Distance from the origin = " + p3.distance());
                                }
                                else {
                                    System.out.println("-------------------------");
                                    System.out.println("Invalid point number.");
                                }
                            } else if (pointChoice == 5)
                                break;
                            else {
                                System.out.println("-------------------------");
                                System.out.println("Invalid choice.");
                            }

                        }

                    } else if (operationChoice == 2) {
                        while (true) {
                            int lineChoice;
                            System.out.println("-------------------------");
                            System.out.println("     LINE OPERATIONS     ");
                            System.out.println("-------------------------");
                            System.out.println("1. Print Line");
                            System.out.println("2. Length");
                            System.out.println("3. Unit Vector");
                            System.out.println("4. Operations Menu");
                            System.out.print("Enter your choice: ");
                            while (!in.hasNextInt()) {
                                System.out.print("Invalid operation choice. Please enter an integer: ");
                                in.next();
                            }
                            lineChoice = in.nextInt();
                            if (lineChoice == 1){
                                int line;
                                System.out.println("Enter the point number (1 or 2): ");
                                while (!in.hasNextInt()){
                                    System.out.print("Invalid operation choice. Please enter an integer: ");
                                    in.next();
                                }
                                line = in.nextInt();
                                if (line == 1) {
                                    System.out.println("-------------------------");
                                    System.out.println("Line 1: " + l1);
                                }
                                else if(line == 2){
                                    System.out.println("-------------------------");
                                    System.out.println("Line 2: " + l2);
                                }
                                else {
                                    System.out.println("-------------------------");
                                    System.out.println("Invalid point number.");
                                }
                            } else if (lineChoice == 2) {
                                int line;
                                System.out.println("Enter the point number (1 or 2): ");
                                while (!in.hasNextInt()){
                                    System.out.print("Invalid operation choice. Please enter an integer: ");
                                    in.next();
                                }
                                line = in.nextInt();
                                if (line == 1) {
                                    System.out.println("-------------------------");
                                    System.out.println("Line 1 length = " + l1.length());
                                }
                                else if(line == 2) {
                                    System.out.println("-------------------------");
                                    System.out.println("Line 2 length = " + l2.length());
                                }
                                else {
                                    System.out.println("-------------------------");
                                    System.out.println("Invalid point number.");
                                }
                            } else if (lineChoice == 3) {
                                int line;
                                System.out.println("Enter the point number (1 or 2): ");
                                while (!in.hasNextInt()){
                                    System.out.print("Invalid operation choice. Please enter an integer: ");
                                    in.next();
                                }
                                line = in.nextInt();
                                if (line == 1) {
                                    System.out.println("-------------------------");
                                    System.out.println("Line 1 unit vector: " + l1.unitVector());
                                }
                                else if(line == 2) {
                                    System.out.println("-------------------------");
                                    System.out.println("Line 2 unit vector: " + l2.unitVector());
                                }
                                else {
                                    System.out.println("-------------------------");
                                    System.out.println("Invalid point number.");
                                }
                            } else if (lineChoice == 4)
                                break;
                            else {
                                System.out.println("-------------------------");
                                System.out.println("Invalid choice.");
                            }
                        }
                    } else if (operationChoice == 3) {
                        while (true) {
                            int triangleChoice;
                            System.out.println("-------------------------");
                            System.out.println("   TRIANGLE OPERATIONS   ");
                            System.out.println("-------------------------");
                            System.out.println("1. Print Triangle");
                            System.out.println("2. Perimeter");
                            System.out.println("3. Area");
                            System.out.println("4. Operations Menu");
                            System.out.print("Enter your choice: ");
                            while (!in.hasNextInt()) {
                                System.out.print("Invalid operation choice. Please enter an integer: ");
                                in.next();
                            }
                            triangleChoice = in.nextInt();
                            if (triangleChoice == 1) {
                                System.out.println("-------------------------");
                                System.out.println("Triangle 1: " + t1);
                            }
                            else if (triangleChoice == 2) {
                                System.out.println("-------------------------");
                                System.out.println("Triangle 1 perimeter = " + t1.perimeter());
                            }
                            else if (triangleChoice == 3) {
                                System.out.println("-------------------------");
                                System.out.println("Triangle 1 area = " + t1.area());
                            } else if (triangleChoice == 4)
                                break;
                            else {
                                System.out.println("-------------------------");
                                System.out.println("Invalid choice.");
                            }
                        }
                    } else if (operationChoice == 4) {
                        break;
                    } else{
                        System.out.println("-------------------------");
                        System.out.println("Invalid choice.");
                    }
                }

            } else if (choice == 5) {
                break;
            } else {
                System.out.println("-------------------------");
                System.out.println("Invalid choice.");
            }
        }
    }
    static Point insertPoint(){
        Scanner in = new Scanner(System.in);
        float x, y, z;
        System.out.println("Enter X coordinate: ");
        while (!in.hasNextFloat()){
            System.out.print("Invalid operation choice. Please enter a number: ");
            in.next();
        }
        x = in.nextFloat();
        System.out.println("Enter Y coordinate: ");
        while (!in.hasNextFloat()){
            System.out.print("Invalid operation choice. Please enter a number: ");
            in.next();
        }
        y = in.nextFloat();
        System.out.println("Enter Z coordinate: ");
        while (!in.hasNextFloat()){
            System.out.print("Invalid operation choice. Please enter a number: ");
            in.next();
        }
        z = in.nextFloat();
        return new Point(x, y, z);
    }
    static Line formatLine(Point p1, Point p2, Point p3){
        Scanner in = new Scanner(System.in);
        Point point1, point2;
        while (true){
            int choice1, choice2;

            System.out.println("-------------------------");
            System.out.println("       LINE FORMAT       ");
            System.out.println("-------------------------");
            System.out.println("1. Point 1");
            System.out.println("2. Point 2");
            System.out.println("3. Point 3");
            System.out.print("Enter the start point: ");
            while (!in.hasNextInt()){
                System.out.print("Invalid operation choice. Please enter an integer: ");
                in.next();
            }
            choice1 = in.nextInt();

            if (choice1 == 1)
                point1 = p1;
            else if (choice1 == 2)
                point1 = p2;
            else if (choice1 == 3)
                point1 = p3;
            else {
                System.out.println("Invalid point number.");
                continue;
            }

            System.out.print("Enter the end point: ");
            while (!in.hasNextInt()){
                System.out.print("Invalid operation choice. Please enter an integer: ");
                in.next();
            }
            choice2 = in.nextInt();

            if (choice2 == 1)
                point2 = p1;
            else if (choice2 == 2)
                point2 = p2;
            else if (choice2 == 3)
                point2 = p3;
            else {
                System.out.println("Invalid point number.");
                continue;
            }
            break;
        }
        return new Line (point1, point2);
    }
    static void pointAddition(Point p1, Point p2, Point p3){
        Scanner in = new Scanner(System.in);
        Point point1, point2;
        while(true) {
            int choice1, choice2;

            System.out.println("Enter the first point number (1 or 2 or 3): ");
            while (!in.hasNextInt()) {
                System.out.print("Invalid operation choice. Please enter an integer: ");
                in.next();
            }
            choice1 = in.nextInt();
            if (choice1 == 1)
                point1 = p1;
            else if (choice1 == 2)
                point1 = p2;
            else if (choice1 == 3)
                point1 = p3;
            else {
                System.out.println("-------------------------");
                System.out.println("Invalid point number.");
                System.out.println("-------------------------");
                continue;
            }

            System.out.println("Enter the second point number (1 or 2 or 3): ");
            while (!in.hasNextInt()) {
                System.out.print("Invalid operation choice. Please enter an integer: ");
                in.next();
            }
            choice2 = in.nextInt();
            if (choice2 == 1)
                point2 = p1;
            else if (choice2 == 2)
                point2 = p2;
            else if (choice2 == 3)
                point2 = p3;
            else {
                System.out.println("-------------------------");
                System.out.println("Invalid point number.");
                System.out.println("-------------------------");
                continue;
            }
            break;
        }
        System.out.println("-------------------------");
        System.out.println("Result of point addition = " + point1.add(point2));
    }
    static void pointSubtraction(Point p1, Point p2, Point p3){
        Scanner in = new Scanner(System.in);
        Point point1, point2;
        while(true) {
            int choice1, choice2;

            System.out.println("Enter the first point number (1 or 2 or 3): ");
            while (!in.hasNextInt()) {
                System.out.print("Invalid operation choice. Please enter an integer: ");
                in.next();
            }
            choice1 = in.nextInt();
            if (choice1 == 1)
                point1 = p1;
            else if (choice1 == 2)
                point1 = p2;
            else if (choice1 == 3)
                point1 = p3;
            else {
                System.out.println("-------------------------");
                System.out.println("Invalid point number.");
                System.out.println("-------------------------");
                continue;
            }

            System.out.println("Enter the second point number (1 or 2 or 3): ");
            while (!in.hasNextInt()) {
                System.out.print("Invalid operation choice. Please enter an integer: ");
                in.next();
            }
            choice2 = in.nextInt();
            if (choice2 == 1)
                point2 = p1;
            else if (choice2 == 2)
                point2 = p2;
            else if (choice2 == 3)
                point2 = p3;
            else {
                System.out.println("-------------------------");
                System.out.println("Invalid point number.");
                System.out.println("-------------------------");
                continue;
            }
            break;
        }
        System.out.println("-------------------------");
        System.out.println("Result of point subtraction = " + point1.sub(point2));
    }
}
