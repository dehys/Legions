package com.dehys.legions.events.legions;

import com.dehys.legions.events.LegionEvent;
import com.dehys.legions.objects.Legion;
import org.bukkit.Chunk;
import org.bukkit.OfflinePlayer;
import org.bukkit.event.Cancellable;

public class LegionClaimEvent extends LegionEvent implements Cancellable {

    private boolean cancelled = false;
    private final Chunk chunk;

    public LegionClaimEvent(Legion legion, OfflinePlayer player, Chunk chunk) {
        super(legion, player);
        this.chunk = chunk;
    }

    public Chunk getChunk() {
        return chunk;
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