package command;

import java.util.ArrayList;
import java.util.List;

public class MacroCommand implements Command {

    List<Command> mCommands = new ArrayList<Command>();

    void addCommand(Command command) {
        mCommands.add(command);
    }

    public void execute() {
        for (Command command : mCommands) {
            command.execute();
        }
    }
}
