package eisbot.abl.actions;

import eisbot.abl.ABLStarCraftBot;
import eisbot.abl.StarCraftConstants;
import eisbot.proxy.command.CommandQueue;
/**
 * @see CommandQueue
 */
public class SetRallyPositionTile extends StarCraftAction {

    public void execute(Object[] args) {     
    	ABLStarCraftBot.getQueue().setRallyPosition(this,
    			((Integer)args[0]).intValue(), 
    			((Integer)args[1]).intValue() * StarCraftConstants.PIXELS_PER_TILE, 
    			((Integer)args[2]).intValue() * StarCraftConstants.PIXELS_PER_TILE);
    }
}
