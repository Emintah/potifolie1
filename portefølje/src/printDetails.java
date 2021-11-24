public class printDetails {
    //taget indpsiration for kode http://www.java2s.com/example/java-book/create-abstract-class-shape-concrete-rectangle-class-and-circle-class.html

    public static void printShape(Shape[]List)
    {
        for(int i=0; i< List.length; i++)
        {
            double calculateArea = List[i].calculateArea();
            double calculateCircumference =List[i].calculateCircumference();
            double calculateCenter= List[i].calculateCenter();
            System.out.println("Area:"+ calculateArea);
            System.out.println("circumference" + calculateCircumference);
            System.out.println("Center" + calculateCenter);

        }

    }

}

