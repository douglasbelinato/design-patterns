package br.com.patterns.creational.prototype.approach01;

import java.time.LocalDateTime;

public class DocumentTemplate implements Cloneable {

    private String title;
    private String body;
    private LocalDateTime creationDate;
    private User owner;

    public DocumentTemplate(String title, String body, LocalDateTime creationDate, User owner) {
        this.title = title;
        this.body = body;
        this.creationDate = creationDate;
        this.owner = owner;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    @Override
    public DocumentTemplate clone() throws CloneNotSupportedException {
        // Shallow copy
        var clonedDdocumentTemplate = (DocumentTemplate) super.clone();

        // Deep copy
        var clonedOwner = this.owner.clone();
        clonedDdocumentTemplate.setOwner(clonedOwner);

        return clonedDdocumentTemplate;
    }

    @Override
    public String toString() {
        return "DocumentTemplate{" +
                "title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", creationDate=" + creationDate +
                ", owner=" + owner +
                '}';
    }
}
