package command;

public class ConcreteCommand1 implements Command {
    String s;

    ConcreteCommand1(String s) {
        this.s = s;
    }

    public void execute() {
        System.out.println("ConcreteCommand1:" + s);

    }
}
