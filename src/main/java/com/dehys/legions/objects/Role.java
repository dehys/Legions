package com.dehys.legions.objects;

import java.util.ArrayList;
import java.util.List;

public class Role {

    private String name;
    private String description;
    private int permissionLevel;

    public Role(String name, String description, int permissionLevel) {
        this.name = name;
        this.description = description;
        this.permissionLevel = permissionLevel;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPermissionLevel() {
        return permissionLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPermissionLevel(int i) {
        this.permissionLevel = i;
    }

    public static List<Role> getDefaultRoles(){
        return new ArrayList<>(List.of(
                new Role("Admin", "Administrator", 3),
                new Role("Moderator", "Moderator", 2),
                new Role("Member", "Member", 1),
                new Role("Recruit", "Recruit", 0)
        ));
    }
}