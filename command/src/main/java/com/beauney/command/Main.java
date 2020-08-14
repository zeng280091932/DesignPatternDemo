package com.beauney.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zengjiantao
 * @since 2020-08-12
 */
public class Main {
    public static void main(String[] args) {
        Content content = new Content();

        Command copyCommand = new CopyCommand(content);
        copyCommand.exec();
        copyCommand.undo();

        Command insertCommand = new InsertCommand(content);
        insertCommand.exec();
        insertCommand.undo();

        Command deleteCommand = new DeleteCommand(content);
        deleteCommand.exec();
        deleteCommand.undo();

        List<Command> commands = new ArrayList<>();
        commands.add(new CopyCommand(content));
        commands.add(new InsertCommand(content));
        commands.add(new DeleteCommand(content));

        for (int i = 0; i < commands.size(); i++) {
            commands.get(i).exec();
        }

        System.out.println(content.msg);

        for (int i = commands.size() - 1; i >= 0; i--) {
            commands.get(i).undo();
        }

        System.out.println(content.msg);
    }
}
