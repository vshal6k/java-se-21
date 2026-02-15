package practice;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SequencedMap;
import java.util.Set;
import java.util.SequencedSet;
import practice.A.*;

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

        // Delivery delivery = new Delivery(new Product("Pencil", 10),
        // LocalDateTime.now());
        // if(delivery instanceof Delivery(Product (String name, double price),
        // LocalDateTime deliveryDateTime)){
        // System.out.println(delivery.deliveryTime());
        // System.out.println(deliveryDateTime);

        // System.out.println(name);
        // System.out.println(price);
        // }

        // W w = new W();
        // System.out.println(w instanceof X);
        // System.out.println(w instanceof Y);

        // Declaration
        // int[] intArray;
        // Product[] productArray;

        // intArray = new int[10]; //Creation of array of length 10
        // productArray = new Product[20]; //Creation of array of length 20

        // //initialisation
        // intArray[0] = 1;
        // productArray[0] = new Product("Tea", 10);

        // //Creation and initilisation
        // intArray = new int[]{1,2,3};
        // productArray = new Product[]{new Product("Tea", 20)};

        // Declaration Creation Initialisation
        // int[] intArray = {1,2,3};
        // Product[] productArray = {new Product("Rasna", 23)};

        // int[] intArray = {1, 2, 3};
        // System.out.println(intArray.length);
        // int[] intArrayDoubleSize = Arrays.copyOf(intArray, 6);
        // System.out.println(intArrayDoubleSize.length);
        // int[] intArrayDoubleSizev1 = new int[6];
        // System.arraycopy(intArray, 0, intArrayDoubleSizev1, 0, 3);

        // String[] names = { "Vishal", "Kanan", "Het", "Amaan" };
        // Arrays.sort(names);
        // for (String string : names) {
        // System.out.println(string);
        // }

        // boolean[] hyperlinkEnabled = new boolean[10];
        // Arrays.fill(hyperlinkEnabled, true);

        // for (boolean b : hyperlinkEnabled) {
        // System.out.println(b);
        // }

        // Arrays.sort(names, (String s1, String s2) -> {
        //     return s2.compareTo(s1);
        // });
        // for (String string : names) {
        //     System.out.println(string);
        // }

        // Map mp = new HashMap<>();
        // Map mp = new HashMap<>(20);


        // Map<Integer, Integer> mp = Map.ofEntries(Map.entry(2, 2), Map.entry(4, 3));
        // System.out.println(mp.get(2));
        // System.out.println(mp.get(4));
        // System.out.println(mp.get(1));

        // Set<Integer> set = mp.keySet();
        // Iterator <Integer> it = set.iterator();
        // while(it.hasNext()){
        //     Integer key = it.next();
        //     Integer value = mp.get(key);
        //     System.out.println(key + " " + value);
        // }

        // mp.put(2, 3);
        
        // HashMap<Integer, Integer> hashMap = new HashMap<>();

        // A.nestedStaticA insideA = new A.nestedStaticA();
        // insideA.run();

        A.createNestedClass();
        

    }
}
