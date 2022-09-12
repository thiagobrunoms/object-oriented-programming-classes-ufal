package patos.fly_behavior;

public class HorizontalFly implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Horizontal flying behavior executed!!");
    }

    @Override
    public void land() {
        System.out.println("Horizontal landing behavior executed!!");
    }

}
