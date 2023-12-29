package activities;

public class MountainBike extends Bicycle{
    int seatHeight;
    MountainBike(int gears,int current,int seatHeight){
        super(gears,current);
        this.seatHeight=seatHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
    @Override
    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed+ "\nseatHeight of bicycle is " + seatHeight);
    }
}
