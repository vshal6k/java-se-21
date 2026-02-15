package practice;

public sealed class A permits B{
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
