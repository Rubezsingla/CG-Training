package Inheritance.AssistedProblems;

public class AnimalH {
    public static void main(String[] args) {
        Dog d=new Dog("tommy",4);
        d.makeSound();
    }
}

class Animal{
    String name;
    int age;

    Animal(String name,int age){
        this.name=name;
        this.age=age;
    }
    void makeSound(){
        System.out.println("make sound");
    }

}

class Dog extends Animal{

    Dog(String name,int age){
        super(name,age);
    }
    void makeSound(){
        System.out.println("bark");
    }
}

class Cat extends Animal{

    Cat(String name,int age){
        super(name,age);
    }
    void makeSound(){
        System.out.println("meow");
    }
}

class Bird extends Animal{

    Bird(String name,int age){
        super(name,age);
    }
    void makeSound(){
        System.out.println("Chirp");
    }
}
