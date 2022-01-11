package com.dehys.legions.events.legions;

import com.dehys.legions.events.LegionEvent;
import com.dehys.legions.objects.Legion;
import org.bukkit.event.Cancellable;

public class LegionRenameEvent extends LegionEvent implements Cancellable {

    private boolean cancelled = false;

    private final String oldName;
    private String newName;

    public LegionRenameEvent(Legion legion, String newName) {
        super(legion);
        this.oldName = legion.getName();
        this.newName = newName;
    }

    public String getOldName() {
        return oldName;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        this.cancelled = b;
    }
}
