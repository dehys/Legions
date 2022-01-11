package com.dehys.legions.events.legions;

import com.dehys.legions.events.LegionEvent;
import com.dehys.legions.objects.Legion;
import org.bukkit.OfflinePlayer;
import org.bukkit.event.Cancellable;

public class LegionMemberLeaveEvent extends LegionEvent implements Cancellable {

    private boolean cancelled = false;

    public LegionMemberLeaveEvent(Legion legion, OfflinePlayer player) {
        super(legion, player);
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        cancelled = b;
    }
}
