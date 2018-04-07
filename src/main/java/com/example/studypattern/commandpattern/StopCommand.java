package com.example.studypattern.commandpattern;

import com.example.studypattern.commandpattern.AudioPlayer;
import com.example.studypattern.commandpattern.ICommand;

public class StopCommand implements ICommand {

    private AudioPlayer audioPlayer;

    public StopCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.stop();
    }
}
