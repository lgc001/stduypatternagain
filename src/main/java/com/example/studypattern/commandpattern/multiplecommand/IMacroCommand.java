package com.example.studypattern.commandpattern.multiplecommand;

import com.example.studypattern.commandpattern.ICommand;

/**
 * 宏命令（一次多条）
 */
public interface IMacroCommand extends ICommand {

    /**
     * 宏命令聚集的管理方法
     * 可以添加一个成员命令
     */
    void add(ICommand command);

    /**
     * 宏命令聚集的管理方法
     * 可以删除一个成员命令
     */
    void remove(ICommand command);
}
