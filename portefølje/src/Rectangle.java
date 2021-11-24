class Rectangle extends Shape {
    private double W;
    private double H;


    public Rectangle(double posX,double posY, double W,double H){
        super(posX,posY);
        this.W=W;
        this.H=H;


    }

    @Override
    public double calculateArea() {
        return W * H;
    }


    @Override
    public double calculateCircumference() {
        return 2 * (W + H);
    }
    public double calculateCenter (){
        c.setX(DpointX+(W/2));
        c.setY(DpointY+(H)/2);

        return calculateArea();
    }


}


