import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setAge(14);
        cat.setName("Finik");
        Dog dog = new Dog();
        AngryDog angryDog = new AngryDog();
        Cow cow = new Cow();
        Animal[] animals = {cat,dog,cow,angryDog};

        for (Animal all :
                animals) {
            all.voice();
        }

        Delegator delegator = new Delegator();
        System.out.println(delegator.toStringAnimal(cat));

    }
}