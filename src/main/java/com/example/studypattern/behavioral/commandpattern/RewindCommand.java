package com.example.studypattern.behavioral.commandpattern;

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
