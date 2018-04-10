package com.example.studypattern.behavioral.commandpattern.multiplecommand;

import com.example.studypattern.behavioral.commandpattern.ICommand;

import java.util.ArrayList;
import java.util.List;

/**
 * 调用者
 */
public class MacroAudioCommand{// implements IMacroCommand {

    private List<ICommand> commandList = new ArrayList<>();

    //@Override
    public void add(ICommand command) {
        commandList.add(command);
    }

    //@Override
    public void remove(ICommand command) {
        commandList.remove(command);
    }

    //@Override
    public void execute() {
        for (ICommand item :
                commandList) {
            item.execute();
        }
    }
}
