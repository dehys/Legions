package com.dehys.legions.commands;

import com.dehys.legions.events.legions.LegionCreateEvent;

public class Create {

    public void execute() {
        new LegionCreateEvent(null, null).call();
    }

}
