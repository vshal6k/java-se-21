package practice;
public class StringBuilderLearnings {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder("Hello");
        StringBuilder c = new StringBuilder(20);

        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);

        // b.append("World");
        // System.out.println(b);

        a.append("ab");
        a.insert(2, "cde");
        System.out.println(a.length());
        System.out.println(a.capacity());
        System.out.println(a.charAt(2));
        a.delete(2, 4);
        System.out.println(a);
    }
}
