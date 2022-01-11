package com.dehys.legions.events.legions;

import com.dehys.legions.objects.Legion;
import org.bukkit.Chunk;
import org.bukkit.entity.Player;

public class LegionUnclaimEvent extends LegionClaimEvent{

    public LegionUnclaimEvent(Legion legion, Player player, Chunk chunk) {
        super(legion, player, chunk);

        //unclaim logic
    }

}
