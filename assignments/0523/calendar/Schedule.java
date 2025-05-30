package com.example.calendar2;

import java.util.Date;

public class Schedule {
    private String title;
    private String description;
    private Date date;
    private int id;

    public Schedule(int id, String title, String description, Date date) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.date = date;
    }

    // Getter와 Setter 메서드들
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
}