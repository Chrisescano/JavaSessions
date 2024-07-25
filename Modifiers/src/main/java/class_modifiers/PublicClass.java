package class_modifiers;

public class PublicClass {

    private void accessingDefaultClass() {
        DefaultClass defaultClass = new DefaultClass(); //main cant see DefaultClass but PublicClass can
    }
}
