package patos;

import patos.fly_behavior.FlyBehavior;

abstract public class AbstractDuck {
    FlyBehavior flyBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void fly() {
        if (this.flyBehavior != null) {
            this.flyBehavior.fly();
        } else {
            System.out.println("Não há comportamento de voar!");
        }
    }

    public void land() {
        if (this.flyBehavior != null) {
            this.flyBehavior.land();
        }
    }

    public void nadar() {
        System.out.println("Pato nadando...");
    }

    public void grasnar() {
        System.out.println("Pato grasnando...");
    }

}
