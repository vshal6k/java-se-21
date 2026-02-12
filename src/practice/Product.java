package practice;

public record Product(String name, double price) {

    // public Product(String name){
    //     this.name = name.toLowerCase();
    // }

    public Product{
        name = name.toLowerCase();
    }

    public void printName() {
        System.out.println(name);
    }
}
