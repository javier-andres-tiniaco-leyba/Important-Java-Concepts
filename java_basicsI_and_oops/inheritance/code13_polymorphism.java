// https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html


// The JVM calls the appropiate method for the object that is referred
// to in each variable. It does not call the method that is defined by
// the variable's type. This behaviour is referred to as virtual method
// invocation and demonstrates and aspect of the important polymorphism
// in the Java programming language.


class TestBikes {
  public static void main(String[] args){
    Bicycle bike01, bike02, bike03;

    bike01 = new Bicycle(20, 10, 1);
    bike02 = new MountainBike(20, 10, 5, "Dual");
    bike03 = new RoadBike(40, 20, 8, 23);

    bike01.printDescription();
    bike02.printDescription();
    bike03.printDescription();
  }
}

class RoadBike extends Bicycle{
    // In millimeters (mm)
    private int tireWidth;

    public RoadBike(int startCadence,
                    int startSpeed,
                    int startGear,
                    int newTireWidth){
        super(startCadence,
              startSpeed,
              startGear);
        this.setTireWidth(newTireWidth);
    }

    public int getTireWidth(){
      return this.tireWidth;
    }

    public void setTireWidth(int newTireWidth){
        this.tireWidth = newTireWidth;
    }

    @Override
    public void printDescription(){
        super.printDescription();
        System.out.println("The RoadBike" + " has " + getTireWidth() +
            " MM tires.");
    }
}

class MountainBike extends Bicycle {
    private String suspension;

    public MountainBike(
               int startCadence,
               int startSpeed,
               int startGear,
               String suspensionType){
        super(startCadence,
              startSpeed,
              startGear);
        this.setSuspension(suspensionType);
    }

    public String getSuspension(){
      return this.suspension;
    }

    public void setSuspension(String suspensionType) {
        this.suspension = suspensionType;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("The MountainBike has a" +
            getSuspension() + " suspension.");
    }
}


class Bicycle {

    private int cadence;
    private int speed;
    private int gear;

    public Bicycle(
               int startCadence,
               int startSpeed,
               int startGear) {
        cadence = startCadence;
        speed = startSpeed;
        gear = startGear;
    }

    public void printDescription() {
        System.out.println("\nBike is in gear " + this.gear
            + " with a cadence of " + this.cadence +
            " and travelling at a speed of " + this.speed + ". ");
    }
}
