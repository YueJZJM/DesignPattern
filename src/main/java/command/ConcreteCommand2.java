package command;

public class ConcreteCommand2 implements Command {
    String s;

    ConcreteCommand2(String s) {
        this.s = s;
    }

    public void execute() {
        System.out.println("ConcreteCommand2:" + s);

    }
}