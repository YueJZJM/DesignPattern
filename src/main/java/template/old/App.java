package template.old;

import java.util.Random;

public class App {
    public boolean step2() {
        System.out.println("step2");
        return new Random().nextBoolean();
    }

    public void step4() {
        System.out.println("step4");
    }

    public static void main(String[] args) {
        App app = new App();
        Library library = new Library();
        library.step1();
        if (app.step2()) {
            library.step3();
        }
        app.step4();
        library.step5();
    }
}
