package br.com.patterns.structural.bridge.approach01.model;

public class Job extends Entity {

    private final String title;

    public Job(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
