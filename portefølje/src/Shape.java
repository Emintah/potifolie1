
public abstract class Shape implements ShapeMethods{

    public Shape(double posX, double posY) {
        this.DpointX = posX;
        this.DpointY = posY;
    }

    double DpointX;
    double DpointY;

    public Shape(double dpointX, double dpointY, point c) {
        DpointX = dpointX;
        DpointY = dpointY;
        this.c = c;
    }

    point c= new point(0,0);


}
