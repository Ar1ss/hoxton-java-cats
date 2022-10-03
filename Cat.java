


public class Cat {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Oliver", 4, false);
        Cat cat2 = new Cat("Molly", 2, true);
        cat1.displayInfo();
        cat2.displayInfo();
    }
    String name;
    int age;
    boolean likesCuddles;

    public Cat(String name, int age, boolean likesCuddles) {
        this.name = name;
        this.age = age;
        this.likesCuddles = likesCuddles;
    }

    public void displayInfo() {
        System.out.println("This is " + name + ", who is " + age + " year(s) old. " + name + " likes cuddles: " + likesCuddles);
    }
}

