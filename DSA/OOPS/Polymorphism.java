package DSA.OOPS;

public class Polymorphism {
    public static class Dog{
      void sound(){
        System.out.println("Bow Bow");
      }
    }
    public static class Cat{
       void sound(){
        System.out.println("Meow Meow");
       }
    }
    public static class Lion{
       void sound(){
        System.out.println("grrr grrrr");
       }
    }
    public static class Human{
        void sound(){
            System.out.println("Hello");
        }
    }
    public static void main(String[] args) {
        Dog tommy=new Dog();
        Cat kitty=new Cat();
        Human Zaid=new Human();
        tommy.sound();
        kitty.sound();
        Zaid.sound();
    }
    
}
