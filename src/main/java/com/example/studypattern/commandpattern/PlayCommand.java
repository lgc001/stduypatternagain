package com.example.studypattern.commandpattern;

import com.example.studypattern.commandpattern.AudioPlayer;
import com.example.studypattern.commandpattern.ICommand;

public class PlayCommand implements ICommand {

    private AudioPlayer audioPlayer;

    public PlayCommand(AudioPlayer audioPlayer){
        this.audioPlayer=audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.play();
    }
}
