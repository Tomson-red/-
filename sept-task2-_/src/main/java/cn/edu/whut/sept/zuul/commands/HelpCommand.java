package cn.edu.whut.sept.zuul.commands;

import cn.edu.whut.sept.zuul.Command;
import cn.edu.whut.sept.zuul.CommandWords;
import cn.edu.whut.sept.zuul.Game;

public class HelpCommand extends Command {
    private CommandWords commandWords;

    public HelpCommand(CommandWords words) {
        commandWords = words;
    }

    public boolean execute(Game game) {
        System.out.println("You are lost. You are alone. You wander");
        System.out.println("around at the university.");
        System.out.println();
        System.out.println("Your command words are:");
        commandWords.showAll();
        return false;
    }
}
