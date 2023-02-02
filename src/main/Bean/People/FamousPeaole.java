package main.Bean.People;

import main.Bean.Dynasty.Dynasty;
import main.Bean.Event.Event;

public class FamousPeaole extends People{
    private Event event;
    private Dynasty dynasty;

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Dynasty getDynasty() {
        return dynasty;
    }

    public void setDynasty(Dynasty dynasty) {
        this.dynasty = dynasty;
    }
}
