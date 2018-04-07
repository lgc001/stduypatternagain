package com.example.studypattern.commandpattern;

import com.example.studypattern.commandpattern.AudioPlayer;
import com.example.studypattern.commandpattern.ICommand;

public class RewindCommand implements ICommand {

    private AudioPlayer audioPlayer;

    public RewindCommand(AudioPlayer audioPlayer){
        this.audioPlayer=audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.rewind();
    }
}
