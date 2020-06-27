package command;

public class Main {
    public static void main(String args[]) {
        ConcreteCommand1 concreteCommand1 = new ConcreteCommand1("111");
        ConcreteCommand2 concreteCommand2 = new ConcreteCommand2("222");


        MacroCommand command = new MacroCommand();
        command.addCommand(concreteCommand1);
        command.addCommand(concreteCommand2);

        command.execute();
    }
}
