package template.new1;

import java.util.Random;

public class App extends Library {
    protected boolean step2() {
        System.out.println("step2");
        return new Random().nextBoolean();
    }

    protected void step4() {
        System.out.println("step4");
    }

    public static void main(String[] args) {
        Library library = new App();
        library.run();
    }
}
