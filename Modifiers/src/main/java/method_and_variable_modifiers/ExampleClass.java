package method_and_variable_modifiers;

public class ExampleClass {

    public String str1 = "Public String";
    String str2 = "Default String";
    protected String str3 = "Protected String";
    private String str4 = "Private String";

    //public modifier
    public void sayHello() {
        System.out.println("Hello from ExampleClass public");
    }

    //default modifier
    void sayHello_default() {
        System.out.println("Hello from ExampleClass default");
    }

    //protected modifier
    protected void sayHello_protected() {
        System.out.println("Hello from ExampleCLass protected");
    }

    //private modifier
    private void sayHello_private() {
        System.out.println("Hello from ExampleCLass private");
    }

    //non-access final example
    public final void sayHello_final() {
        System.out.println("Hello from ExampleClass final");
    }

    //non-access abstract example - we get an error since ExampleClass is not abstract
    //public abstract void sayHello_abstract();
}
