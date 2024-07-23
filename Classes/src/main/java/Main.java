import person.Person;

public class Main {

    /*
    Java is an OOP (Object-Oriented Programming) language
    there are 2 concepts we need to understand (basics):
    1. classes
    2. objects

    lets consider Christian and Kerry
    - what are some similarities? both in YU, both want to be S.E., enjoy solving complex problems
    - what are some differences? job titles, different ethnicities, weight differences

    the things that make us similar and different are attributes
    attributes? are a classes methods and variables - a class being a collection of like-minded attributes

    some people might refer to classes as blueprint for building an object

    a class is a blueprint meanwhile an object is an instance of a class
    this means that we can have many copies (instances) of a class by making many objects

    this allows us to abstract ideas and think of our programs like in the real world

    static methods are not tied to any instance of an object, they are tied to the classes themselves
    - this is useful for when you want a class to do something no matter the instance

    The 4 pillars of OOP (advanced)
    inheritance, polymorphism, encapsulation, abstraction
     */

    public static void main(String[] args) {

        Person christian = new Person("Christian Escano", 25);
        Person kerry = new Person("Kerry Metayer", 22);
        Person ibra = new Person();

        ibra.setName("Ibrahim Farhane");
        ibra.setAge(22);

        Person.staticMethod();

        System.out.println(ibra.getAge());
        System.out.println(ibra.getName());
    }

}
