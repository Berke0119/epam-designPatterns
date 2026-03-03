package com.epam.behavioraldesignpatterns.command;

public class RemoteControl {

    private Command lastCommand;

    public RemoteControl(Command lastCommand) {
        this.lastCommand = lastCommand;
    }

    public void submit(Command command) {
        command.execute();
        this.lastCommand = command;
    }

    public void undoButtonPushed(){
        if(lastCommand != null){
            lastCommand.undo();
        }
    }
}
