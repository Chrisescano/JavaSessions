package person;

public class Person {

    private String name; //this is an attribute
    private int age;

    //this method is special - it is called a constructor
    //constructors tell java how to build an object from a class
    //constructors can only be called once
    public Person( String name, int age ) {
        this.name = name;
        this.age = age;
    }

    public Person( String name ) {
        this.name = name;
    }

    //default constructor
    public Person () {

    }

    /*----- Static Methods -----*/

    public static void staticMethod() {
        System.out.println("I am a static method");
    }

    /*----- Getters/Setters -----*/
    /*
    These methods are attributes
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
