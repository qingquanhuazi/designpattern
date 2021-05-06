package cn.arthur.design.command.player.actions;


import cn.arthur.design.command.player.GPlayer;
import cn.arthur.design.command.player.IAction;

/**
 * Created by arthur.
 */
public class PlayAction implements IAction {
    private GPlayer gplayer;

    public PlayAction(GPlayer gplayer) {
        this.gplayer = gplayer;
    }

    public void execute() {
        gplayer.play();
    }
}
