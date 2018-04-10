package com.example.studypattern.behavioral.commandpattern.singlecommand;

import com.example.studypattern.behavioral.commandpattern.*;

public class Program {

    public static void main(String[] args) {

        //创建接收者对象
        AudioPlayer audioPlayer = new AudioPlayer();

        //创建命令对象
        ICommand playCommand = new PlayCommand(audioPlayer);
        ICommand rewindCommand = new RewindCommand(audioPlayer);
        ICommand stopCommand = new StopCommand(audioPlayer);

        //按键去调用
        Keypad keypad = new Keypad();
        keypad.setPlayCommand(playCommand);
        keypad.setRewindCommand(rewindCommand);
        keypad.setStopCommand(stopCommand);

        keypad.play();
        keypad.stop();
        keypad.rewind();
        keypad.play();
        keypad.stop();
    }
}
