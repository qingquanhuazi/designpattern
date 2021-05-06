package cn.arthur.design.command.player.actions;


import cn.arthur.design.command.player.GPlayer;
import cn.arthur.design.command.player.IAction;

/**
 * Created by arthur.
 */
public class SpeedAction implements IAction {
    private GPlayer gplayer;

    public SpeedAction(GPlayer gplayer) {
        this.gplayer = gplayer;
    }

    public void execute() {
        gplayer.speed();
    }
}
