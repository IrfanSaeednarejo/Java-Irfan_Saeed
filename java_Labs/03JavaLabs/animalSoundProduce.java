
abstract class Animal{
    private String name, gender;
    private int age;

    Animal(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    String getName(){
        return name;
    }

    String getGender(){
        return gender;
    }

    int getAge(){
        return age;
    }

    abstract String produceSound(String sound);
}

class Dog extends Animal{
    Dog(String name, String gender, int age){
        super(name, gender, age);
    }
    String produceSound(String sound){
        return "\nAnimal name: " + getName() + "\nAnimal gender: " + getGender() + "\nAnimal age: " + getAge() + "\nsound : " + sound;
    }
}

class Frog extends Animal{
    Frog(String name, String gender, int age){
        super(name, gender, age);
    }
    String produceSound(String sound){
        return "\nAnimal name: " + getName() + "\nAnimal gender: " + getGender() + "\nAnimal age: " + getAge() + "\n sound : " + sound;
    }
}

class Cats extends Animal{
    Cats(String name, String gender, int age){
        super(name, gender, age);
    }
    String produceSound(String sound){
        return "\nAnimal name: " + getName() + "\nAnimal gender: " + getGender() + "\nAnimal age: " + getAge() + "\nsound : " + sound;
    }
}

class AnimalTest{
    public static void main(String []arg){
        System.out.println("=======Dogs=======");
        Dog dog1 = new Dog("kozu", "Male", 13);
        Dog dog2 = new Dog("kaili", "Female", 11);
        System.out.println(dog1.produceSound("bhaw bhaw bhawwwuu"));
        System.out.println();
        System.out.println(dog2.produceSound("bhaw bhaw bhawweee"));
        System.out.println();
        System.out.println("========Cats========");
        Cats cat1 = new Cats("shenek", "Female", 10);
        Cats cat2 = new Cats("Tom", "Male", 9);
        System.out.println(cat1.produceSound("Meaww meawwu"));
        System.out.println();
        System.out.println(cat2.produceSound("Meaww meawwuee"));
        System.out.println();
        System.out.println("========Frogs========");

        Frog frog1 = new Frog("crogis", "Female", 14);
        Frog frog2 = new Frog("loster","Male", 12);
        System.out.println(frog1.produceSound("Trant trant"));
        System.out.println();
        System.out.println(frog2.produceSound("Trant trant"));
        System.out.println();

        Animal animal[] = {dog1, dog2, cat1, cat2, frog1, frog2};
        double calcDogAvg = 0.0, calcCatAvg = 0.0, calcFrogAvg = 0.0;
        int countDogs = 0, countCats = 0, countFrogs = 0;
        for(int i=0; i<animal.length; i++){
            if(animal[i] instanceof Dog){
                calcDogAvg = calcDogAvg + animal[i].getAge();
                countDogs++;
            }
        }
        for(int i=0; i<animal.length; i++){
            if(animal[i] instanceof Frog){
                calcFrogAvg = calcFrogAvg + animal[i].getAge();
                countFrogs++;
            }
        }
        for(int i=0; i<animal.length; i++){
            if(animal[i] instanceof Cats){
                calcCatAvg = calcCatAvg + animal[i].getAge();
                countCats++;
            }
        }
        System.out.println("Average age of dogs: " + (calcDogAvg/countDogs));
        System.out.println("Average age of cats: " + (calcCatAvg/countCats));
        System.out.println("Average age of frogs: " + (calcFrogAvg/countFrogs));
    }

}
