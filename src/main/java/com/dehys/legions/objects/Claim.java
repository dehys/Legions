package com.dehys.legions.objects;

import org.bukkit.Chunk;

public class Claim {

    public Legion legion;
    public Chunk chunk;

    public Claim(Legion legion, Chunk chunk) {
        this.legion = legion;
        this.chunk = chunk;
    }

}
