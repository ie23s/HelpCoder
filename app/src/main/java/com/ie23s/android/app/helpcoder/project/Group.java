package com.ie23s.android.app.helpcoder.project;

import java.util.Objects;

public class Group {
    private int id;
    private String name;
    private int weight;
    private long developingTime;
    private long projectTime;

    public Group(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Group(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public Group(int id, String name, int weight, long developingTime, long projectTime) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.developingTime = developingTime;
        this.projectTime = projectTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public long getDevelopingTime() {
        return developingTime;
    }

    public void setDevelopingTime(long developingTime) {
        this.developingTime = developingTime;
    }

    public long getProjectTime() {
        return projectTime;
    }

    public void setProjectTime(long projectTime) {
        this.projectTime = projectTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return id == group.id;
    }

    //TODO CREATING
    public void create() {

    }

}
