package com.dehys.legions.events.legions;

import com.dehys.legions.events.LegionEvent;
import com.dehys.legions.objects.Legion;
import org.bukkit.OfflinePlayer;
import org.bukkit.event.Cancellable;

public class LegionMemberKickEvent extends LegionEvent implements Cancellable {

    private boolean cancelled = false;

    private String reason;

    public LegionMemberKickEvent(Legion legion, OfflinePlayer player, String reason) {
        super(legion, player);
        this.reason = reason == null || reason.isEmpty() ? "No reason given." : reason;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
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
