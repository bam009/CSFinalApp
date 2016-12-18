package com.example.bam00.csfinalapp;

public class Career {
    private String category;
    private String job;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Career(String category, String job) {
        this.category = category;
        this.job = job;
    }
}
