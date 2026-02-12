package practice;

public class StringLearnings {
    public static void main(String[] args) {
        // String a = "Hello";
        // String b = a.intern();
        // String c = new String("Hello");

        // if (a == c) {
        // System.out.println("sameReference");
        // } else {
        // System.out.println("differentReference");
        // }

        // System.out.println(a.contains("ell"));

        // System.out.println(a.indexOf("l"));
        // System.out.println(a.indexOf("l", 3));
        // System.out.println(a.lastIndexOf("l"));

        // try {
        // System.out.println(a.charAt(a.length()));
        // } catch (Exception e) {
        // System.out.println("Index Out of Bounds " + e.getMessage());
        // }

        String textBlock = """
                Hello   World
                abcd
                abc\s
                Three Quoatation \"""
                "Double Quoation"
                Same\
                Line
                """;

        System.out.print(textBlock);
    }

}
