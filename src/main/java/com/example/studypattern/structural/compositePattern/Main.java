package com.example.studypattern.structural.compositePattern;

public class Main {
    public static void main(String[] args) {
        AbstractFile folder0 = new Folder("MyDocument");

        AbstractFile folder1 = new Folder("EDC的资料");
        AbstractFile folder2 = new Folder("图像文件");
        AbstractFile folder3 = new Folder("文本文件");
        AbstractFile folder4 = new Folder("视频文件");

        AbstractFile image1 = new ImageFile("小龙女.jpg");
        AbstractFile image2 = new ImageFile("张无忌.gif");

        AbstractFile text1 = new TextFile("九阴真经.txt");
        AbstractFile text2 = new TextFile("葵花宝典.doc");

        AbstractFile video1 = new VideoFile("笑傲江湖.rmvb");
        AbstractFile video2 = new VideoFile("天龙八部.mp4");

        folder2.add(image1);
        folder2.add(image2);

        folder3.add(text1);
        folder3.add(text2);

        folder4.add(video1);
        folder4.add(video2);

        folder1.add(folder2);
        folder1.add(folder3);
        folder1.add(folder4);

        folder0.add(folder1);

        folder0.killVirus();
    }
}
