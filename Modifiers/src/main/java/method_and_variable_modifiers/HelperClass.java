package method_and_variable_modifiers;

public class HelperClass {

    //method default access
    private void testingDefaultAccess() {
        ExampleClass exampleClass = new ExampleClass();

        //default
        exampleClass.sayHello_default();

        //protected
        exampleClass.sayHello_protected();

        //default - variable
        String string = exampleClass.str2;

        //protected - variable
        String string1 = exampleClass.str3;
    }
}
