package com.example.studypattern.behavioral.commandpattern;

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
