package com.example.studypattern.behavioral.commandpattern;

/**
 * 音乐播放机
 */
public class AudioPlayer {
    public void play(){
        System.out.println("播放...");
    }

    public void rewind(){
        System.out.println("倒带...");
    }

    public void stop(){
        System.out.println("停止...");
    }
}
