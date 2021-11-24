class Circle extends Shape {
    private double radius;


    public Circle(double radius,double posX,double posY)
    {
        super(posX,posY);
        this.radius = radius;
        this.calculateArea();
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }


    @Override
    public double calculateArea()
    {
        return Math.PI * radius* radius;
    }

    @Override
    public double calculateCircumference()
    {
        return 2 * Math.PI * radius;
    }

    public double calculateCenter() {
        c.setX(DpointX);
        c.setY(DpointY);


        return calculateArea();
    }


}

