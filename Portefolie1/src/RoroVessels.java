public class RoroVessels extends Vessels {

    public double laneMeters;
    int cars,trucks;

    public RoroVessels(String flagNotation,double draft, double length, double width, double laneMeters) {
        super(flagNotation, draft, length, width);
        this. laneMeters = laneMeters;
    }
 public void loadingCargo(int cars, int trucks){
        this.cars =cars;
        this. trucks = trucks;

 }
    public void utilityLevelOfCapacity(){
        return(cars*8+ trucks*30) / laneMeters*100;
    }



    /*
    The RoRo vessels has a total amount of lane meters and can carry cars and trucks, each
     car is 8 meter long and each truck is 30 meters.
     */



}
