package br.com.patterns.creational.prototype.approach01;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public final class DocumentTemplateRegistry {

    private final Map<String, DocumentTemplate> templates = new HashMap<>();

    public DocumentTemplateRegistry() {
        templates.put("letter",
                new DocumentTemplate("Letter", "Letter body", LocalDateTime.now(), new User("Bot")));
        templates.put("invoice",
                new DocumentTemplate("Invoice", "Invoice body", LocalDateTime.now(), new User("Bot")));
    }

    public DocumentTemplate getByName(String name) throws CloneNotSupportedException {
        return templates.get(name).clone();
    }

}
