import java.util.Scanner;

class Activity_1 {
    public static void main(String args[]) {
        System.out.println("========== Activity One: What does the animal say? ===========");
        Selections choose = new Selections();
        choose.choices();
    }
}

class Dog {
    public void makeSound() {
        System.out.println("bark! bark! bark!");
    }
}

class Cat extends Dog {
    public void makeSound() {
        System.out.println("meow! meow! meow!");
    }
}

class Fish extends Dog {
    public void makeSound() {
        System.out.println("glub! glub! glub!");
    }
}

class Pig extends Dog {
    public void makeSound() {
        System.out.println("oink! oink! oink!");
    }
}

class Selections {
    private Scanner scan = new Scanner(System.in);

    public void choices() {
        int number;
        System.out.println("Select an animal: ");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Fish");
        System.out.println("4. Pig");
        System.out.println("\nEnter a number: ");
        number = scan.nextInt();

        switch (number) {
            case 1:
                System.out.println("Animal: Dog");
                Dog dog = new Dog();
                dog.makeSound();
                break;
            case 2:
                System.out.println("Animal: Cat");
                Cat cat = new Cat();
                cat.makeSound();
                break;
            case 3:
                System.out.println("Animal: Fish");
                Fish fish = new Fish();
                fish.makeSound();
                break;
            case 4:
                System.out.println("Animal: Pig");
                Pig pig = new Pig();
                pig.makeSound();
                break;
            default:
                System.out.println("Out of the choices");
        }
    }
}