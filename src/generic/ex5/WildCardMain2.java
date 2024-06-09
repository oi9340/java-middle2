package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildCardMain2 {

    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        writeBox(objectBox);
        writeBox(animalBox);
//        writeBox(dogBox); // 하한이 Animal
//        writeBox(catBox); // 하한이 Animal

        Animal animal = animalBox.get();
        System.out.println("animal = " + animal);
    }


    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍이", 100));
    }


}


