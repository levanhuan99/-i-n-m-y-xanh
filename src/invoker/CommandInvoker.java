package invoker;

import command.ICommand;

public class CommandInvoker {
    private ICommand iCommand;

    public CommandInvoker(ICommand iCommand) {
        this.iCommand = iCommand;
    }

    public CommandInvoker() {
    }
    public void executeCommand(){
        if (this.iCommand!=null){
            this.iCommand.execute();
        }
    }
}
