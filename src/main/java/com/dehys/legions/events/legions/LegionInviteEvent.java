package com.dehys.legions.events.legions;

import com.dehys.legions.events.LegionEvent;
import com.dehys.legions.objects.Legion;
import org.bukkit.OfflinePlayer;
import org.bukkit.event.Cancellable;

public class LegionInviteEvent extends LegionEvent implements Cancellable {

    private boolean cancelled = false;

    private OfflinePlayer invited;

    public LegionInviteEvent(Legion legion, OfflinePlayer player, OfflinePlayer invited) {
        super(legion, player);
        this.invited = invited;
    }

    public OfflinePlayer getInvitedPlayer() {
        return invited;
    }

    public void setInvitedPlayer(OfflinePlayer invited) {
        this.invited = invited;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        this.cancelled = b;
    }
}
