package practice;

import java.io.Serializable;

public sealed class A implements Serializable permits B {

    public int id;
    public transient String name;

    public A(int id, String name){
        this.id = id;
        this.name = name;
    }

    private static NestedStaticA nestedStaticA;

    public static void createNestedClass(){
        nestedStaticA = new NestedStaticA();
        nestedStaticA.run();
    }

    //Static Nested Class
    private static class NestedStaticA{
        public void run(){
            System.out.println("Running");
        }
    }

    void aMethod(){
        
    }
}
