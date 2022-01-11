package com.dehys.legions.events.legions;

import com.dehys.legions.events.LegionEvent;
import com.dehys.legions.objects.Legion;
import com.dehys.legions.objects.Member;
import org.bukkit.OfflinePlayer;
import org.bukkit.event.Cancellable;

public class LegionMemberPromoteEvent extends LegionEvent implements Cancellable {

    private boolean cancelled = false;

    private Member promotedMember;

    public LegionMemberPromoteEvent(Legion legion, OfflinePlayer player, Member member) {
        super(legion, player);
        this.promotedMember = member;
    }

    public Member getPromotedMember() {
        return promotedMember;
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
