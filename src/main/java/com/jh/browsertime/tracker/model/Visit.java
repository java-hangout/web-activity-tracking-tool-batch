package com.jh.browsertime.tracker.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Visit {

    @Id
    private long id;

    private long visit_time;  // Timestamp for the visit
    private long visit_duration;  // Duration of visit in microseconds

    @Column(name = "url")
    private String url;

    @Column(name = "title")
    private String title;

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getVisit_time() {
        return visit_time;
    }

    public void setVisit_time(long visit_time) {
        this.visit_time = visit_time;
    }

    public long getVisit_duration() {
        return visit_duration;
    }

    public void setVisit_duration(long visit_duration) {
        this.visit_duration = visit_duration;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
