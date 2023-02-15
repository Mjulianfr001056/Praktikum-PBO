abstract class Animal {
    abstract void makeSound();
}
    class Cow extends Animal{
        @Override
        void makeSound(){
            System.out.println("Cow goes moo..mo..");
        }
    }

    class Fox extends Animal{
        @Override
        void makeSound(){
            System.out.println("What does the fox say?");
            System.out.println("ring ding ding dingering ding...");
        }
    }

    public class AnimalTest{
        public static void main(String[] args){
            Animal sapi = new Cow();
            sapi.makeSound();
            Animal fox = new Fox();
            fox.makeSound();
        }
    }