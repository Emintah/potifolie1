public class Main {

    public static void main(String[] args) {
        Shape[] shapeList = new Shape[3];
        shapeList[0] =new Circle(5.0,6,8);
        shapeList[1] =new Circle(7.0,8,9);
        printDetails.printShape(shapeList);

    }
}
