/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vs.fosterMoore.test;

/**
 *
 * @author Aimee
 */
public class Person {

    public String name;

    private Person(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    private void setName(String newName) {
        name = newName;
    }

    private static void changes(Person first, Person second) {
        first.setName("Sue");
        second = new Person("Joe");
    }

    public static void main(String[] args) {
        Person a = new Person("Bob");
        Person b = new Person("Mary");
        changes(a, b);
        System.out.println(a + ", " + b);
    }
}
