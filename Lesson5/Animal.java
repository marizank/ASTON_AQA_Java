package Lesson5;

public class Animal {
    static int countAnimal = 0;
    int obstacleLength;
    String name;
    public Animal() {
        countAnimal++;
    }

    public void run(int obstacleLength) {

    }
    public void swim(int obstacleLength) {

    }

    public static int getCountAnimal(){
        return countAnimal;
    }
}
    class Dog extends Animal{
        static int countDog = 0;
        Dog(String name){
            this.name=name;
            countDog++;
            System.out.println("dog " + name);
        }
    @Override
    public void run(int obstacleLength) {
        super.run(obstacleLength);
        if (obstacleLength>0 && obstacleLength<=500){
            System.out.println( name + " run " + obstacleLength + "m.");
        } else System.out.println(name + " couldn't run " + obstacleLength);
    }

    @Override
    public void swim(int obstacleLength) {
        super.swim(obstacleLength);
        if (obstacleLength>0 && obstacleLength<=10){
            System.out.println( name + " swam " + obstacleLength + "m.");
        } else System.out.println(name + " couldn't swim " + obstacleLength);
    }

    public static int getCountDog(){
        return countDog;
    }
}
    class Cat extends Animal{
        static int countCat = 0;
        Cat(String name){
            this.name=name;
            countCat++;
            System.out.println("cat " + name);
        }
        @Override
        public void run(int obstacleLength) {
            super.run(obstacleLength);
            if (obstacleLength>0 && obstacleLength<=200){
                System.out.println( name + " run " + obstacleLength + "m.");
            } else System.out.println(name + " couldn't run " +obstacleLength);
        }
        @Override
        public void swim(int obstacleLength) {
            super.swim(obstacleLength);
            if (obstacleLength>0){
                System.out.println("The cat can't swim");
            }
        }
        public static int getCountCat(){
            return countCat;
        }
    }

    class Test{
        public static void main(String[] args){
            Dog dog1=new Dog("Baron");
            Cat cat1=new Cat("Mur");
            cat1.run(50);
            dog1.run(150);
            dog1.swim(10);
            cat1.swim(6);
            Cat cat2=new Cat("Murzik");
            cat2.swim(56);
            cat2.run(14);
            System.out.println("creat dogs: " + Dog.getCountDog());
            System.out.println("creat cats: " +Cat.getCountCat());
            System.out.println("creat animals: " +Animal.getCountAnimal());

        }
    }




