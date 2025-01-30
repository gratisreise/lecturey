package _00_SOLID._05_dependency_inversion.ex01;

// High-level class
public class Switch {

    private Fan fan;

    public Switch(Fan fan){
        this.fan = fan;
    }

    public void turnOn(){
        fan.spin();
    }

    public void turnOff(){
        fan.stop();
    }
}
