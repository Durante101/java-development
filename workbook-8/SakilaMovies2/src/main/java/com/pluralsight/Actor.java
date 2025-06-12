package com.pluralsight;

public class Actor {
    private int actorId;
    private String firstName;
    private String Name;

    public Actor(int actorId, String firstName, String name) {
        this.actorId = actorId;
        this.firstName = firstName;
        Name = name;

    }

    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
