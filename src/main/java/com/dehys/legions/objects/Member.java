package com.dehys.legions.objects;

import java.util.UUID;

public class Member {

    public UUID uuid;
    public Role role;
    public Legion legion;
    public int powerLevel;
    public int maxPowerLevel;

    public Member(UUID uuid, Role role, Legion legion, int powerLevel, int maxPowerLevel) {
        this.uuid = uuid;
        this.role = role;
        this.legion = legion;
        this.powerLevel = powerLevel;
        this.maxPowerLevel = maxPowerLevel;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Legion getLegion() {
        return legion;
    }

    public void setLegion(Legion legion) {
        this.legion = legion;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public int getMaxPowerLevel() {
        return maxPowerLevel;
    }

    public void setMaxPowerLevel(int maxPowerLevel) {
        this.maxPowerLevel = maxPowerLevel;
    }
}
