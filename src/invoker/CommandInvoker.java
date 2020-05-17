package invoker;

import command.ICommand;

import java.io.IOException;

public class CommandInvoker {
    private ICommand iCommand;

    public CommandInvoker(ICommand iCommand) {
        this.iCommand = iCommand;
    }

    public CommandInvoker() {
    }

    public void executeCommand() throws IOException {
        if (this.iCommand != null) {
            this.iCommand.execute();
        }
    }
}
