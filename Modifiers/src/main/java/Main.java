import class_modifiers.PublicClass;
import method_and_variable_modifiers.ExampleClass;

public class Main {

    /*
    Access modifiers - change who and what can access our classes, methods, and variables

    we have seen access modifiers:
    1. the main function of any java program - the main has the modifier public
    2. we went over access modifiers for classes

    classes
    ----------------------------------
    1. public - any outside class, no matter the package it is in, can access our class
    2. default (you type nothing) - class is only accessible by classes of the same package

    methods (constructors as well)
    ----------------------------------
    1. public - the method or constructor is available to all classes in our program
    2. default (type nothing) - the method or constructor is available in the same package
    3. protected - the method or constructor is available in the same package and any subclasses
    4. private - the method or constructor is available to only the class that it was declared in

    variables (sometimes called attributes)
    ----------------------------------
    1. public - the method or constructor is available to all classes in our program
    2. default (type nothing) - the method or constructor is available in the same package
    3. protected - the method or constructor is available in the same package and any subclasses
    4. private - the method or constructor is available to only the class that it was declared in

    Non-Access modifiers - change the behaviour of our classes, methods, and variables

    we have seen non-access modifiers:
    1. final - methods
    2. static - main methods have this
    3. abstract - classes

    classes
    ----------------------------------
    1. final - the class cannot be inherited by other classes
    2. abstract - the class cannot be used to create objects

    methods
    ----------------------------------
    1. final - the method cannot be override/modified
    2. static - the method belongs to the class rather than the object
    3. abstract - can only be used in an abstract class, its syntax is just the method signature, without the body

    4. transient - the method is skipped when serializing the object containing it
    5. synchronized - methods can only be accessed by one thread at a time

    variables (sometimes called attributes)
    ----------------------------------
    1. final - the variables cannot be changed onced initialized
    2. static - the attribute/variables belongs to the class rather than the object

    4. transient - the variable is skipped when serializing the object containing it
    6. volatile - the value of the variable is not cached thread-locally, always read from main memory
     */

    public static void main(String[] args) {
        //classes
        PublicClass publicClass = new PublicClass();
        //DefaultClass defaultClass = new DefaultClass(); - this gives us an error

        //methods
        ExampleClass exampleClass = new ExampleClass();
        exampleClass.sayHello();

        //variables
        String publicStr = exampleClass.str1;
        System.out.println(publicStr);
    }

}
