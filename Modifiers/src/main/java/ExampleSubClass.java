import method_and_variable_modifiers.ExampleClass;

public class ExampleSubClass extends ExampleClass {

    //protected access
    private void testingProctectedAccess() {
        sayHello_protected(); //we can access this because this is a subclass of ExampleClass
    }

//    @Override //we get an error - cannot override/modify
//    public final void sayHello_final() {
//        System.out.println("Hello from ExampleSubClass final");
//    }
}
