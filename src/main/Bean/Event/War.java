package main.Bean.Event;

import main.Bean.People.People;

public class War extends Event{
    private People commander;
    private String combatant;

    public People getCommander() {
        return commander;
    }

    public void setCommander(People commander) {
        this.commander = commander;
    }

    public String getCombatant() {
        return combatant;
    }

    public void setCombatant(String combatant) {
        this.combatant = combatant;
    }
}
