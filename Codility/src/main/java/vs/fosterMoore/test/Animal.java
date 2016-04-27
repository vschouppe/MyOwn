package vs.fosterMoore.test;

public class Animal {

    private String name = "dog";

    private Animal(String name) {
        this.name = name;
    }

    private String getName() {
        return name + ", ";
    }

    private boolean transform() {
        boolean result = false;
        if (name.equals("mouse")) {
            name = "cat";
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        int a = 1;
        Animal animal = new Animal("mouse");
        System.out.print(animal.getName());
        if (animal.transform() || a == 1 ) {
            System.out.print(animal.getName());
        }
        System.out.print(animal.getName());
    }
}
