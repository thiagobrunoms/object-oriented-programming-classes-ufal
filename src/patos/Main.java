package patos;

import patos.fly_behavior.HorizontalFly;
import patos.fly_behavior.VerticalFly;

public class Main {

    public static void main(String[] args) {
        Pato1 pato1 = new Pato1();
        Pato2 pato2 = new Pato2();

        VerticalFly verticalFly = new VerticalFly();
        pato1.setFlyBehavior(verticalFly);

        HorizontalFly horizontalFly = new HorizontalFly();
        pato2.setFlyBehavior(horizontalFly);

        System.out.println("=== Pato 1 ==== ");
        pato1.fly();
        pato1.land();

        System.out.println("=== Pato 2 ==== ");
        pato2.fly();
        pato2.land();

        System.out.println("Alterando comportamentos");
        pato1.setFlyBehavior(horizontalFly);
        pato2.setFlyBehavior(verticalFly);

        System.out.println("=== Pato 1 ==== ");
        pato1.fly();
        pato1.land();

        System.out.println("=== Pato 2 ==== ");
        pato2.fly();
        pato2.land();

        Pato1 pato11 = new Pato1();
        pato11.fly();

    }

}
