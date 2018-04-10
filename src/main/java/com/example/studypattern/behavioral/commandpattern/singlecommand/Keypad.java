package com.example.studypattern.behavioral.commandpattern.singlecommand;

import com.example.studypattern.behavioral.commandpattern.ICommand;

/**
 * 调用者
 */
public class Keypad {
    private ICommand playCommand;
    private ICommand rewindCommand;
    private ICommand stopCommand;

    public void setPlayCommand(ICommand playCommand) {
        this.playCommand = playCommand;
    }

    public void setRewindCommand(ICommand rewindCommand) {
        this.rewindCommand = rewindCommand;
    }

    public void setStopCommand(ICommand stopCommand) {
        this.stopCommand = stopCommand;
    }

    public void play(){
        playCommand.execute();
    }

    public void rewind(){
        rewindCommand.execute();
    }

    public void stop(){
        stopCommand.execute();
    }
}
