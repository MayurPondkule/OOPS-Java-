

import java.util.*;




class Animal{
    void eat() {
        System.out.println("eating");
    }

}

class Lion extends Animal{
    void roar(){
        System.out.println("roaring");

    }

}

class Cat extends Lion{
    void meow(){
        System.out.println("meowing");
    }

}




public class inheritance {

    public static void main(String[] args){

//        Animal ani1=new Animal();
        Cat cat1=new Cat();
        cat1.meow();
        cat1.roar();
        cat1.eat();

    }

}
