package practice;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // A a = new A();
        // A a = new B();
        // A a = new C();
        // A a = new D();

        // B b = (B) new A(); Invalid because an object of A cannot be stored in B
        // reference type
        // A a = new A();
        // B b = (B)a; this will error because a contains an object of B

        // A a = new B();
        // B b = (B)a; Valid typecasting because a reference type was storing B object
        // so any reference type lower or equal than B can work

        // A a = new C();
        // B b = (B)a;
        // C c = (C)a;
        // D d = (D)a; Invalid because D is not in heirarchy of object C

        // A a = new A();
        // System.out.println(a instanceof A);
        // System.out.println(a instanceof B);

        // A a = new B();
        // System.out.println(a instanceof A);
        // System.out.println(a instanceof B);
        // System.out.println(a instanceof C);

        // A a = new C();
        // System.out.println(a instanceof A);
        // System.out.println(a instanceof B);
        // System.out.println(a instanceof C);
        // System.out.println(a instanceof D);

        // X instance of Y returns true if X is either Y or superclass of Y
        // instanceof should be used before typecasting a superclass to a subclass
        // reference

        // C c = new C(3);

        // Product natrajPencil = new Product("Natraj B2");
        // // System.out.println(natrajPencil.name());
        // natrajPencil.printName();

        Delivery delivery = new Delivery(new Product("Pencil", 10), LocalDateTime.now());
        if(delivery instanceof Delivery(Product (String name, double price), LocalDateTime deliveryDateTime)){
            System.out.println(delivery.deliveryTime());
            System.out.println(deliveryDateTime);

            System.out.println(name);
            System.out.println(price);
        }
    }
}
