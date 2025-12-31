//inheritance

package ProblemSolving;

class Animal {
    public void display() {
        System.out.println("This is an animal");
    }
}

public class Dog extends Animal {

    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.display();
    }
}
