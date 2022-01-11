package com.dehys.legions.events;

import com.dehys.legions.objects.Legion;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public abstract class LegionEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    private final Legion legion;
    private OfflinePlayer offlinePlayer = null;

    public LegionEvent(Legion legion) {
        this.legion = legion;
    }

    public LegionEvent(Legion legion, OfflinePlayer player) {
        this.legion = legion;
        this.offlinePlayer = player;
    }

    public Legion getLegion() {
        return legion;
    }

    public OfflinePlayer getPlayer() {
        return offlinePlayer;
    }

    public @NotNull HandlerList getHandlers() {
        return LegionEvent.handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public void call() {
        Bukkit.getPluginManager().callEvent(this);
    }
}